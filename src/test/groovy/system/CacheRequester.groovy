package system

import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import system.model.*

import static io.restassured.RestAssured.given

class CacheRequester {

    private static final String CACHE_URL = "https://prebid-cache.${Constants.ENVIRONMENT.value}.rubiconproject.com/cache"
    private static final RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
            .setBaseUri(CACHE_URL)
            .setContentType(ContentType.JSON)
            .build()

    static CachePostResponse postCache(Cache cache) {
        def response = given(REQUEST_SPECIFICATION)
                .body(cache)
                .post(CACHE_URL)

        assert response.statusCode == 200, response.prettyPrint()

        response as CachePostResponse
    }

    static Creative getCreative(String uuid, Creative.Type type) {
        def response = given(REQUEST_SPECIFICATION)
                .queryParam("uuid", uuid)
                .get(CACHE_URL)

        assert response.statusCode == 200, response.prettyPrint()

        type == Creative.Type.XML ? new XmlCreative(response as String) : new JsonCreative(response as JsonCreative.Value)
    }

    static ErrorResponse getErrorResponse(String uuid) {
        def response = given(REQUEST_SPECIFICATION)
                .queryParam("uuid", uuid)
                .get(CACHE_URL)

        assert response.statusCode != 200, response.prettyPrint()

        response as ErrorResponse
    }
}
