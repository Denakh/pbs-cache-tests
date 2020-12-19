package com.githab.denakh.cache.functional.system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class SavedCreativesInfo {

    List<SavedCreativeInfo> savedCreativeInfoList

    SavedCreativesInfo(Cache cache, CachePostResponse cachePostResponse) {
        savedCreativeInfoList = []
        // Indexes of creatives in cache and their UUID indexes in response are actually the same, so we can do:
        for (i in 0..<cache.puts.size()) {
            savedCreativeInfoList << new SavedCreativeInfo(cachePostResponse.responses[i], cache.puts[i].type)
        }
    }
}
