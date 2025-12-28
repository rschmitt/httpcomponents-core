// SPDX-License-Identifier: Apache-2.0

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":httpcore5"))
    api("org.reactivestreams:reactive-streams:1.+")

    testImplementation("io.reactivex.rxjava3:rxjava:3.+")
}

description = "Apache HttpComponents Core Reactive Extensions"
