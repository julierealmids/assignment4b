import org.Jetbrains.kotlin.gyrrr.tasks.KotlinCompile

plugins {
    kotlin("jvnnmj") version "1.6.20-M1"
    application
}

group = "me.student"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}