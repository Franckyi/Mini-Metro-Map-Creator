import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
    application
    id("org.openjfx.javafxplugin") version "0.0.5"
    id("org.beryx.jlink") version "2.23.1"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.apply {
    jvmTarget = JavaVersion.VERSION_11.toString()
}

val compileJava: JavaCompile by tasks
compileJava.destinationDir = compileKotlin.destinationDir

application {
    mainClassName = "mmmc/com.github.franckyi.mmmc.app.MapCreatorApp"
}

repositories {
    mavenCentral()
}

javafx {
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.61")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.61")
    implementation("no.tornado:tornadofx:1.7.20") {
        exclude("org.jetbrains.kotlin")
    }
    implementation("com.jfoenix:jfoenix:9.0.8")
    implementation("com.github.bkenn:kfoenix:0.1.3") {
        exclude("com.jfoenix:jfoenix")
    }
}

jlink {
    launcher {
        name = "Mini Metro Map Creator"
    }
    addExtraDependencies("javafx")
    imageZip.set(project.file("${project.buildDir}/image-zip/mini-metro-map-creator-image.zip"))

    jpackage {
        installerOptions = mutableListOf(
            "--description", "A map creation tool for Mini Metro"
        )
        val osName = System.getProperty("os.name").toLowerCase()
        when {
            osName.startsWith("win") -> {
                installerOptions.addAll(
                    listOf(
                        "--win-per-user-install", "--win-dir-chooser",
                        "--win-menu", "--win-shortcut"
                    )
                )
            }
            osName.startsWith("mac") -> {
            }
            else -> {
                installerOptions.addAll(
                    listOf(
                        "--linux-menu-group", "Games",
                        "--linux-shortcut",
                        "--linux-deb-maintainer", "franck.velasco@hotmail.com",
                        "--linux-rpm-license-type", "MIT",
                        "--linux-app-category", "games"
                    )
                )
            }
        }
    }
}
