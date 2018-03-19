# Glm-Api [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A global WebGL-Map java api. Helps to provide a unified front across different platforms.

## Building
**Note:** If you do not have Gradle installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for Windows 
systems in place of any 'gradle' command.

In order to build Glm-Api just run the `gradle build` command. Once that is finished you will find library, sources, and 
javadoc .jars exported into the `./build/libs` folder and the will be labeled like the following.
```
GlmApi-x.x.x.jar
GlmApi-x.x.x-javadoc.jar
GlmApi-x.x.x-sources.jar
```

**Alternatively** you can include Glm-Api in your build.gradle file by using the following.
```
repositories {
    maven {
        name = 'reallifegames'
        url = 'https://reallifegames.net/artifactory/gradle-release-local'
    }
}

dependencies {
    compile 'net.reallifegames:GlmApi:x.x.x' // For compile time.
    runtime 'net.reallifegames:GlmApi:x.x.x' // For usage in a runtime application.
}
```