// SPDX-License-Identifier: Apache-2.0

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":httpcore5"))
    compileOnly("org.conscrypt:conscrypt-openjdk-uber:2.+")

    testImplementation("org.conscrypt:conscrypt-openjdk-uber:2.+")
}

description = "Apache HttpComponents Core HTTP/2"
