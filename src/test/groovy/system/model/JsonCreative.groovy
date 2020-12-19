package system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class JsonCreative extends Creative {

    Value value

    JsonCreative(Value value) {
        super.type = Type.JSON
        this.value = value
    }

    @ToString(includeNames = true)
    static class Value {

        String adm
        Integer width
        Integer height
        Integer w
        Integer h
        HashMap ext
        String id
        String impid
        Double price
    }
}
