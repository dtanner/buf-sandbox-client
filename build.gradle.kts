plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "buf"
        url = uri("https://buf.build/gen/maven")
    }
}

dependencies {
    implementation("build.buf.gen:dtanner_event-a_protocolbuffers_kotlin:28.3.0.1.20241108162901.7a0b335b69fc")
    implementation("build.buf:protovalidate:0.4.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
