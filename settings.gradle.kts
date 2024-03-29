pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(url = "https://packages.jetbrains.team/maven/p/kpm/public")
        mavenCentral()
    }
}

rootProject.name = "sample-jewel-build-release"

