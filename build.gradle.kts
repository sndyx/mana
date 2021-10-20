plugins {
    kotlin("jvm") version "1.5.31"
}

group = "net.aradiata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")
    implementation("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().forEach {
    it.kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}