package com.githab.denakh.cache.functional.system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class SavedCreativeInfo {

    UUID uuid
    Creative.Type type

    SavedCreativeInfo(UUID uuid, Creative.Type type) {
        this.uuid = uuid
        this.type = type
    }
}
