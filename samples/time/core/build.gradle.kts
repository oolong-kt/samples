version = "1.0.0"

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}

repositories {
    mavenCentral()
    jcenter()
}

kotlin {
    jvm()
    iosX64("ios")
    linuxX64("linux")
    macosX64("macOS")

    cocoapods {
        summary = "Time Sample"
        homepage = "https://github.com/oolong-kt/oolong/tree/master/samples/time"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(deps.Kotlin.StdLib.Common)
                implementation(deps.Oolong)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(deps.Kotlin.StdLib.Jvm)
                implementation(deps.Kotlin.Coroutines.Core.Jvm)
            }
        }
    }
}

// workaround for https://youtrack.jetbrains.com/issue/KT-27170
configurations {
    create("compileClasspath")
}
