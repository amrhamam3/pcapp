plugins {
    kotlin("multiplatform") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.11"
}

kotlin {
    jvm("jvm") {
        withJava()
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Exe)
            packageVersion = "1.0.0"
            description = "Amr3D Nesting Pro Application"
        }
    }
}
