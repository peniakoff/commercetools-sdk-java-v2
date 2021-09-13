
package com.commercetools.docs.meta;

/**
    <h2 id=about-clients>About the client</h2>

    <p>The commercetools platform client communicates asynchronously with the API via HTTPS
    and it takes care about authentication.</p>

    <p>The client uses Java objects to formulate an HTTP request, performs the request and
    maps the JSON response into a Java object. Since the client is thread-safe you need
    only one client to perform multiple requests in parallel.</p>

    <h3 id=instantiation>Instantiation</h3>

    <p>Creating an instance for a project:</p>

    {@include.example example.ExamplesTest#instance()}

    For projects in the US region you should specify in addition to the previous parameters the auth and api urls:

   {@include.example example.ImportExamplesTest#instance()}

    <h3 id=perform-requests>Performing requests</h3>

    A client works on the abstraction level of one HTTP request.
    With one client you can start multiple requests in parallel, it is thread-safe.

    Example:

   {@include.example example.ExamplesTest#performRequest()}

    <h3 id=closing>Closing the client</h3>

    The client holds resources like thread pools and IO connections, so call {@code close()} to release them.
 */
public class GettingStarted {
}
