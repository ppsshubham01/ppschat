// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        maven {
            url = uri("https://jitpack.io")
        }
        mavenCentral() // or any other necessary repositories for your buildscript dependencies
    }
    // Other buildscript configurations here
}


plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false

}