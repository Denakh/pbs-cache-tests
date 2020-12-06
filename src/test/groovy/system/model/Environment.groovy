package system.model

import com.fasterxml.jackson.annotation.JsonValue

enum Environment {
    QA("qa"), DEV("dev")

    private final String value

    private Environment(String value) {
        this.value = value
    }

    @JsonValue
    String getValue() {
        value
    }

    @Override
    String toString() {
        value
    }
}