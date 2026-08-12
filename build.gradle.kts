plugins {
    kotlin("multiplatform") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.11"
    kotlin("plugin.compose") version "2.0.0" 
}

// 1. تحديد مستودعات تحميل مكتبات المطورين للمشروع
repositories {
    mavenCentral()
    maven("https://jetbrains.space")
}

kotlin {
    jvm("jvm") {
        withJava()
    }
}

// 2. تحديد مستودعات تحميل أدوات الـ Compose والـ EXE الخاصة بجيتبرينز
buildscript {
    repositories {
        mavenCentral()
        maven("https://jetbrains.space")
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
