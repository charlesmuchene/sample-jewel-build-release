import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.compose") version "1.6.0-dev1397"
}

group = "com.charlesmuchene.sample.jewel.build.release"
version = "1.0.0"

kotlin {
    jvmToolchain {
        vendor = JvmVendorSpec.JETBRAINS
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material") // we're jeweling up! :D
    }
    implementation("org.jetbrains.jewel:jewel-int-ui-standalone:0.14.1")
}
compose.desktop {
    application {
        mainClass = "AppKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg)
        }

        buildTypes.release.proguard {
            configurationFiles.from(file("sample-jewel-build.pro"))
        }
    }
}

tasks.withType<JavaExec> {
    afterEvaluate {
        javaLauncher = project.javaToolchains.launcherFor {
            vendor = JvmVendorSpec.JETBRAINS
            languageVersion.set(JavaLanguageVersion.of(17))
        }
        setExecutable(javaLauncher.map { it.executablePath.asFile.absoluteFile }.get())
    }
}
