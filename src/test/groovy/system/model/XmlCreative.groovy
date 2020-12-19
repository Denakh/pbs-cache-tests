package system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class XmlCreative extends Creative {

    String value

    XmlCreative(String value) {
        super.type = Type.XML
        this.value = value
    }
}
