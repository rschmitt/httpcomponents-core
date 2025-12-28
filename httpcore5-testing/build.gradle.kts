// SPDX-License-Identifier: Apache-2.0

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":httpcore5"))
    api(project(":httpcore5-h2"))
    api(project(":httpcore5-reactive"))
    api("commons-cli:commons-cli:1.+")
    api("org.slf4j:slf4j-api:1.+")
    api("io.reactivex.rxjava3:rxjava:3.+")

    testImplementation(project(":httpcore5", configuration = "tests"))
    testImplementation("org.conscrypt:conscrypt-openjdk-uber:2.+")
    testImplementation("org.testcontainers:testcontainers:1.+")
    testImplementation("org.testcontainers:junit-jupiter:1.+")
    testImplementation("org.openjdk.jmh:jmh-core:1.+")
    testImplementation("org.openjdk.jmh:jmh-generator-annprocess:1.+")
}

description = "Apache HttpComponents Core Integration Tests"
