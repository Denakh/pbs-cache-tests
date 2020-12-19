package com.githab.denakh.cache.functional.system

import com.githab.denakh.cache.functional.system.model.Environment


class Constants {

    public static final Environment ENVIRONMENT = System.getenv("ENVIRONMENT") == "dev" ? Environment.DEV : Environment.QA

    private Constants() {
        throw new InstantiationException("This class should not be instantiated!")
    }
}
