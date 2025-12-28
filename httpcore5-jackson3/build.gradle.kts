// SPDX-License-Identifier: Apache-2.0

plugins {
    id("buildlogic.java-conventions")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    api(project(":httpcore5"))
    api("org.reactivestreams:reactive-streams:1.+")
    api("tools.jackson.core:jackson-databind:3.+")

    testImplementation("org.assertj:assertj-core:3.+")
}

description = "Apache HttpComponents Core JSON Bindings"
