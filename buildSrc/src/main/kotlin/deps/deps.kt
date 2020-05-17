package deps

object Android {
    object Gradle : Group("com.android.tools.build", "3.6.3") {
        val Plugin = artifact("gradle")
    }

    object X {
        object AppCompat : Group("androidx.appcompat", "1.1.0") {
            val Core = artifact("appcompat")
        }
    }
}

object Kotlin : Group("org.jetbrains.kotlin", "1.3.72") {
    object Coroutines : Group("org.jetbrains.kotlinx", "1.3.5") {
        val Android = artifact("kotlinx-coroutines-android")

        object Core {
            val Common = artifact("kotlinx-coroutines-core-common")
            val Jvm = artifact("kotlinx-coroutines-core")
        }
    }

    object Gradle {
        val Plugin = artifact("kotlin-gradle-plugin")
    }

    object StdLib {
        val Common = artifact("kotlin-stdlib-common")
        val Jvm = artifact("kotlin-stdlib")
    }

    object Test {
        val AnnotationsCommon = artifact("kotlin-test-annotations-common")
        val Common = artifact("kotlin-test-common")
        val JUnit5 = artifact("kotlin-test-junit5")
        val Jvm = artifact("kotlin-test")
    }
}

val Oolong = dependency("org.oolong-kt", "oolong", "2.0.4")
