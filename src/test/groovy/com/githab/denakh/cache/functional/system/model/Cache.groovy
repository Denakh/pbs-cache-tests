package com.githab.denakh.cache.functional.system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class Cache {

    List<Creative> puts

    static Cache defaultCache() {
        new Cache(puts: [XmlCreative.defaultXmlCreative(), JsonCreative.defaultJsonCreative(), JsonCreative.defaultExtendedJsonCreative()])
    }
}
