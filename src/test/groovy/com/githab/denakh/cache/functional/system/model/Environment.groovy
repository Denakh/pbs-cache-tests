package com.githab.denakh.cache.functional.system.model

import com.fasterxml.jackson.annotation.JsonValue

enum Environment {

    QA("qa"), DEV("dev")

    @JsonValue
    final String value

    private Environment(String value) {
        this.value = value
    }

    @Override
    String toString() {
        value
    }
}