
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    antlr
}

repositories {
    mavenCentral()
}

dependencies {

    antlr("org.antlr:antlr4:4.13.0")

    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    // Define the main class for the application.
    mainClass.set("vypacompiler.App")
}

tasks {

    generateGrammarSource{
        maxHeapSize="1";
        val pkg = "parser"
        arguments = arguments + listOf("-package", pkg) + listOf("-visitor")
        outputDirectory = file("src/main/java/parser")
    }

    jar {
        manifest.attributes["Main-Class"]=application.mainClass

        val dependencies = configurations.runtimeClasspath.get().map{zipTree(it)}

        from(dependencies)
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

}


tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
