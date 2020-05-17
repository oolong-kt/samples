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
    macosX64("macos")

    cocoapods {
        summary = "Counter Sample"
        homepage = "https://github.com/oolong-kt/oolong/tree/master/samples/counter"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(deps.Kotlin.StdLib.Common)
                implementation(deps.Oolong)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(deps.Kotlin.Test.Common)
                implementation(deps.Kotlin.Test.AnnotationsCommon)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(deps.Kotlin.StdLib.Jvm)
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(deps.Kotlin.Test.Jvm)
                implementation(deps.Kotlin.Test.JUnit5)
            }
        }
    }
}

// workaround for https://youtrack.jetbrains.com/issue/KT-27170
configurations {
    create("compileClasspath")
}
