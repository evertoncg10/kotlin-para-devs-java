plugins {
    kotlin("jvm") version "2.0.21"
}

group = "br.com.everton"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:2.1.0")

    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation ("org.amshove.kluent:kluent:1.73")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}