package com.githab.denakh.cache.functional.system

import com.githab.denakh.cache.functional.system.model.*
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

import static io.restassured.RestAssured.given

class CacheRequester {

    // Actual cache url should be defined
    private static final String CACHE_URL = "https://some-cache.${Constants.ENVIRONMENT.value}.someproject.com/cache"
    private static final RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
            .setBaseUri(CACHE_URL)
            .setContentType(ContentType.JSON)
            .build()

    static SavedCreativesInfo postCache(Cache cache) {
        def response = given(REQUEST_SPECIFICATION)
                .body(cache)
                .post(CACHE_URL)

        checkApiResponse(response)

        new SavedCreativesInfo(cache, response.as(CachePostResponse))
    }

    static Creative getCreative(String uuid, Creative.Type type) {
        def response = given(REQUEST_SPECIFICATION)
                .queryParam("uuid", uuid)
                .get(CACHE_URL)

        checkApiResponse(response)

        type == Creative.Type.XML ? new XmlCreative(response.asString()) : new JsonCreative(response.as(JsonCreative.Value))
    }

    private static void checkApiResponse(Response response) {
        if (response.statusCode != 200) {
            response.prettyPrint()
            throw new ApiErrorException(response.statusCode(), response.asString())
        }
    }

    static class ApiErrorException extends Exception {

        Integer statusCode
        String responseBody

        ApiErrorException(int statusCode, String responseBody) {
            this.statusCode = statusCode
            this.responseBody = responseBody
        }
    }
}
