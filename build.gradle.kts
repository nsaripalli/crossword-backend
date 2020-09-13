import io.kotless.plugin.gradle.dsl.Webapp.Route53
import io.kotless.plugin.gradle.dsl.kotless

group = rootProject.group
version = rootProject.version

plugins {
    //Version of Kotlin should be 1.3.72+
    kotlin("jvm") version "1.3.72" apply true

    id("io.kotless") version "0.1.6" apply true
}

repositories {
    jcenter()
}


dependencies {
    implementation("io.kotless", "kotless-lang", "0.1.6")

//    implementation("commons-validator", "commons-validator", "1.6")
//    implementation("com.amazonaws", "aws-java-sdk-dynamodb", "1.11.650")

    implementation("org.jetbrains.kotlinx", "kotlinx-html-jvm", "0.6.11")
}

kotless {
    //<...>
    extensions {
        local {
            //enable AWS emulation (disabled by default)
            useAWSEmulation = true
        }
    }
}