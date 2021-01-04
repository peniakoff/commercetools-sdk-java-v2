package io.vrap.rmf.okhttp;


import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpHeaders.HeaderEntry;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.utils.Utils;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VrapOkHttpClient implements VrapHttpClient, AutoCloseable {

    private final Supplier<OkHttpClient.Builder> clientBuilder = () -> new OkHttpClient.Builder()
            .connectTimeout(120,TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS);

    private final OkHttpClient okHttpClient;

    public VrapOkHttpClient() {
        okHttpClient = clientBuilder.get().build();
    }

    public VrapOkHttpClient(BuilderOptions options) {
        okHttpClient = options.plus(clientBuilder.get()).build();
    }

    public VrapOkHttpClient(Supplier<OkHttpClient.Builder> builderSupplier) {
        okHttpClient = builderSupplier.get().build();
    }

    public VrapOkHttpClient(int maxRequests, int maxRequestsPerHost) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        okHttpClient = clientBuilder.get()
                .dispatcher(dispatcher)
                .build();
    }

    public VrapOkHttpClient(ExecutorService executor, int maxRequests, int maxRequestsPerHost) {
        Dispatcher dispatcher = new Dispatcher(executor);
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        okHttpClient = clientBuilder.get()
                .dispatcher(dispatcher)
                .build();
    }

    private static final String CONTENT_TYPE =  "Content-Type";
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final byte[] emptyBody = new byte[0];

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        return makeRequest(okHttpClient, toRequest(request))
                .thenApply(VrapOkHttpClient::toResponse);

    }

    private static ApiHttpResponse<byte[]> toResponse(final Response response) {
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(
                response.headers().toMultimap().entrySet().stream()
                        .flatMap(e -> e.getValue().stream()
                                .map(value -> ApiHttpHeaders.headerEntry(e.getKey(), value))
                        ).collect(Collectors.toList())
        );

        ApiHttpResponse<byte[]> apiHttpResponse = new ApiHttpResponse<>(
                response.code(),
                apiHttpHeaders,
                Optional.ofNullable(response.body()).map(Utils.wrapToCompletionException(ResponseBody::bytes)).orElse(null),
                response.message()
        );
        if (apiHttpResponse.getBody() != null) {
            response.body().close();
        }
        return apiHttpResponse;
    }

    private static Request toRequest(final ApiHttpRequest apiHttpRequest) {

        Request.Builder httpRequestBuilder = new Request.Builder()
                .url(apiHttpRequest.getUrl());

        //set headers
        for (Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders()) {
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }

        if(apiHttpRequest.getMethod() == null) {
            throw new IllegalStateException("apiHttpRequest method should be non null");
        }

        //default media type is JSON, if other media type is set as a header, use it
        MediaType mediaType = JSON;
        if(apiHttpRequest.getHeaders().getHeaders().stream().anyMatch(s -> s.getKey().equalsIgnoreCase(CONTENT_TYPE))){
            mediaType = MediaType.parse(Objects.requireNonNull(apiHttpRequest.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
        }

        final RequestBody body = apiHttpRequest.getBody() == null ? null: RequestBody.create(mediaType, apiHttpRequest.getBody());
        httpRequestBuilder.method(apiHttpRequest.getMethod().name(), body);
        return httpRequestBuilder.build();
    }

    private CompletableFuture<Response> makeRequest(OkHttpClient client, Request request) {
        Call call = client.newCall(request);
        OkHttpResponseFuture result = new OkHttpResponseFuture();
        call.enqueue(result);
        return result.future;
    }

    private static class OkHttpResponseFuture implements Callback {
        public final CompletableFuture<Response> future = new CompletableFuture<>();

        public OkHttpResponseFuture() {
        }

        @Override
        public void onFailure(Call call, IOException e) {
            future.completeExceptionally(e);
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            future.complete(response);
        }
    }

    @Override
    public void close() throws IOException {
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
        if (okHttpClient.cache() != null) Objects.requireNonNull(okHttpClient.cache()).close();
    }
}
