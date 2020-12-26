package com.githab.denakh.cache.functional

import com.githab.denakh.cache.functional.system.CacheRequester
import com.githab.denakh.cache.functional.system.model.Cache
import com.githab.denakh.cache.functional.system.model.Creative
import com.githab.denakh.cache.functional.system.model.JsonCreative
import com.githab.denakh.cache.functional.system.model.XmlCreative
import spock.lang.Specification

import java.util.concurrent.TimeUnit

class CachedDataKeepingSpec extends Specification {

    private final Long ttl = 60
    private final Long timeToGetCache = 50

    def "Cache data should be kept for TTL period"() {
        given: "TTL (60 secs) is added to default cache payload"
        def cache = Cache.defaultCache().tap {
            it.puts.each {
                it.expiry = ttl
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

        when: "Wait for 50 secs (less then TTL)"
        TimeUnit.SECONDS.sleep(timeToGetCache)

        then: "We can get all stored cache creative values"
        savedXmlCreatives.every {
            (CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type) as XmlCreative).value == (it.savedCreative as XmlCreative).value
        }
        savedJsonCreatives.every {
            (CacheRequester.getCreative(it.uuid.uuid, it.savedCreative.type) as JsonCreative).value == (it.savedCreative as JsonCreative).value
        }
    }
}
