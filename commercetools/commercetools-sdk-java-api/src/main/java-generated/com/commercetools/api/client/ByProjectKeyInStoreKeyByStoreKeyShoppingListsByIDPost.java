
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Update ShoppingList by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost> {

    private String projectKey;
    private String storeKey;
    private String ID;

    private com.commercetools.api.models.common.Update update;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String ID, com.commercetools.api.models.common.Update update) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
        this.update = update;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost(
            ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
        this.update = t.update;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/shopping-lists/%s", this.projectKey, this.storeKey,
            this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(update);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost(this);
    }
}