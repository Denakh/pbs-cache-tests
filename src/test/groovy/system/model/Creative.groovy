package system.model

import com.fasterxml.jackson.annotation.JsonValue
import groovy.transform.ToString

@ToString(includeNames = true)
abstract class Creative {

    Type type

    enum Type {

        JSON("json"), XML("xml")

        @JsonValue
        final String value

        private Type(String value) {
            this.value = value
        }

        @Override
        String toString() {
            value
        }
    }
}
