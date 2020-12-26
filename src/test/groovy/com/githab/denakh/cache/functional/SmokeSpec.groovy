package com.githab.denakh.cache.functional

import com.githab.denakh.cache.functional.system.CacheRequester
import com.githab.denakh.cache.functional.system.model.Cache
import spock.lang.Specification

class SmokeSpec extends Specification {

    def "Valid post cache request should return status code 200"() {
        when: "Initiate valid post cache request"
        CacheRequester.postCache(Cache.defaultCache())

        then: "Response status code after the request is 200 and so no ApiErrorException"
        notThrown(CacheRequester.ApiErrorException)
    }

    def "Valid get cache request should return status code 200"() {
        given: "Cache is stored"
        def savedCreativesInfo = CacheRequester.postCache(Cache.defaultCache())

        when: "Initiate get requests for all cache creatives"
        savedCreativesInfo.savedCreativeInfoList.each {
            CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type)
        }

        then: "Response status code after the requests is 200 and so no ApiErrorException"
        notThrown(CacheRequester.ApiErrorException)
    }
}
