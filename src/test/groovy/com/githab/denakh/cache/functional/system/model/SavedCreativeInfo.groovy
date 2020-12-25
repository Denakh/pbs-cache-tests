package com.githab.denakh.cache.functional.system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class SavedCreativeInfo {

    UUID uuid
    Creative savedCreative

    SavedCreativeInfo(UUID uuid, Creative savedCreative) {
        this.uuid = uuid
        this.savedCreative = savedCreative
    }
}
