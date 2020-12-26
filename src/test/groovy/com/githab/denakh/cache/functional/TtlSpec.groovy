package com.githab.denakh.cache.functional

import com.githab.denakh.cache.functional.system.CacheRequester
import com.githab.denakh.cache.functional.system.model.Cache
import com.githab.denakh.cache.functional.system.model.Creative
import spock.lang.Specification
import spock.lang.Unroll

import java.util.concurrent.TimeUnit

class TtlSpec extends Specification {

    @Unroll
    def "Cache should be available in TTL period #expectedTtl and unavailable after"() {
        given: "TTL value is added to default cache payload"
        def cache = Cache.defaultCache().tap {
            it.puts.each {
                it.expiry = expiryInPayload
            }
        }

        and: "Cache is stored"
        def savedCreativesInfo = CacheRequester.postCache(cache)
        def savedXmlCreatives = savedCreativesInfo.savedCreativeInfoList.findAll {
            it.savedCreative.type == Creative.Type.XML
        }
        def savedJsonCreatives = savedCreativesInfo.savedCreativeInfoList.findAll {
            it.savedCreative.type == Creative.Type.JSON
        }

        when: "Wait for available resource timeout (less then TTL)"
        TimeUnit.SECONDS.sleep(availableResourceTimeout)

        and: "Initiate get requests for all cache creatives"
        savedCreativesInfo.savedCreativeInfoList.each {
            CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type)
        }

        then: "Response status code after the requests is 200 and so no ApiErrorException"
        notThrown(CacheRequester.ApiErrorException)

        when: "Wait additional time for reaching of unavailable resource timeout (more then TTL)"
        TimeUnit.SECONDS.sleep(unavailableResourceTimeout - availableResourceTimeout)

        and: "Initiate get requests for XML creatives"
        savedXmlCreatives.each {
            CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type)
        }

        then: "Response status code after the request for XML creative is 404 and there is ApiErrorException"
        def apiExceptionForXmlCreative = thrown(CacheRequester.ApiErrorException)
        apiExceptionForXmlCreative.statusCode == 404

        when: "Initiate get requests for JSON creatives"
        savedJsonCreatives.each {
            CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type)
        }

        then: "Response status code after the requests for JSON creative is 404 and there is ApiErrorException"
        def apiExceptionForJsonCreative = thrown(CacheRequester.ApiErrorException)
        apiExceptionForJsonCreative.statusCode == 404

        // Minimum TTL is 60 sec
        where:
        expiryInPayload | expectedTtl | availableResourceTimeout | unavailableResourceTimeout
        1               | 60          | 50                       | 70
        70              | 70          | 60                       | 80
    }
}
