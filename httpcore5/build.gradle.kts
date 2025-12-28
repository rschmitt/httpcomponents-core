// SPDX-License-Identifier: Apache-2.0

import org.gradle.language.jvm.tasks.ProcessResources

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    testImplementation("org.junit.platform:junit-platform-launcher")
}

description = "Apache HttpComponents Core HTTP/1.1"

tasks.named<ProcessResources>("processResources") {
    val templateValues = mapOf(
        "project" to mapOf(
            "artifactId" to project.name,
            "version" to project.version.toString(),
        ),
    )
    inputs.properties(
        mapOf(
            "project.artifactId" to project.name,
            "project.version" to project.version.toString(),
        )
    )
    filesMatching("org/apache/hc/core5/version.properties") {
        expand(templateValues)
        filteringCharset = "UTF-8"
    }
}

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier.set("tests")
    from(sourceSets["test"].output)
}

val tests by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
}

artifacts {
    add(tests.name, testsJar)
}
