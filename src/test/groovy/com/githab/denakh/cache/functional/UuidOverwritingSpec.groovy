package com.githab.denakh.cache.functional

import com.githab.denakh.cache.functional.system.CacheRequester
import com.githab.denakh.cache.functional.system.model.Cache
import spock.lang.Specification

class UuidOverwritingSpec extends Specification {

    private final String customCacheKey = "bla-bla-bla-uuid"

    def "There should be no ability to overwrite cache uuid"() {
        given: "Custom uuid is added to default cache payload"
        def cache = Cache.defaultCache().tap {
            it.puts.first().key = customCacheKey
        }

        when: "Initiate post cache request"
        CacheRequester.postCache(cache)

        then: "ApiErrorException in response with proper status code and error message"
        def apiException = thrown(CacheRequester.ApiErrorException)
        apiException.statusCode == 400
        apiException.responseBody.contains("Prebid cache host forbids specifying UUID in request")
    }
}
