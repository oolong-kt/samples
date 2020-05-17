plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
    jcenter()
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "sample.counter"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    packagingOptions {
        exclude("META-INF/*.kotlin_module")
    }
}

dependencies {
    implementation(project(":samples:counter:core"))
    implementation(deps.Android.X.AppCompat.Core)
    implementation(deps.Kotlin.Coroutines.Android)
    implementation(deps.Kotlin.StdLib.Jvm)
    implementation(deps.Oolong)
}
