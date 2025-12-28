// SPDX-License-Identifier: Apache-2.0

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":httpcore5"))
    api("org.reactivestreams:reactive-streams:1.+")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.21.0")

    testImplementation("org.assertj:assertj-core:3.+")
}

description = "Apache HttpComponents Core JSON Bindings"
