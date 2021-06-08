buildscript {

    val navigationVersion by rootProject.extra {
//        "2.3.5"
        "2.4.0-alpha02"
    }

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", "1.5.10"))
        classpath("com.android.tools.build:gradle:4.2.1")

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${rootProject.extra.get("navigationVersion")}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}
