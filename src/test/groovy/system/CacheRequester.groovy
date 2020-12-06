package system

import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

import static io.restassured.RestAssured.given

class CacheRequester {

    private static final String CACHE_URL = "https://prebid-cache.${Constants.ENVIRONMENT.value}.rubiconproject.com/cache"
    private static final RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
            .setBaseUri(CACHE_URL)
            .setContentType(ContentType.JSON)
            .build()

    static Response postCache(String cache) {
        // TODO add cache obj. model.
        def response = given(REQUEST_SPECIFICATION)
                .body(cache)
                .post(CACHE_URL)

        assert response.statusCode == 200, response.prettyPrint()

        response
        // TODO add response obj. model: response.as(CacheResponse)
    }
}
