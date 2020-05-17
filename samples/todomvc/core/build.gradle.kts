plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
    jcenter()
}

kotlin {
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
    }
}
