description = "Cinema API"

plugins {
    kotlin("jvm")
    id("io.github.ermadmi78.kobby") version "3.1.0"
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    // Add this dependency to enable Jackson annotation generation in DTO classes
    compileOnly("com.fasterxml.jackson.core:jackson-annotations:2.15.3")

    // Add this dependency to enable default Ktor adapters generation
    compileOnly("io.ktor:ktor-client-cio:2.3.6")
}