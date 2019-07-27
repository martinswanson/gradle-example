# Simple template for Gradle/Java projects with IntelliJ IDEA

This project simplifies the set up of Java projects built with Gradle in IntelliJ IDEA.

## Usage

1. Clone the project
2. Rename the local project directory
3. Change the rootProject.name property in `settings.gradle` to match the new directory naming

## Managing dependencies behind a firewall

For users that only have access to a local repository i.e. no external internet connection: 

1. Create file ~/.gradle/init.gradle: 
```
    def initGradlePath = buildscript.sourceFile.getParent() allprojects {
        apply from: "${initGradlePath}/repos.gradle", to: buildscript
        apply from: "${initGradlePath}/repos.gradle"
    }
```

2. Create file ~/.gradle/repos.gradle:
```
    repositories {
        mavenLocal()
        mavenCentral()
        // other repositories e.g. internal company repos 
    }
```
3. Comment out the following in the `build.gradle` file
```    
    repositories {
        mavenCentral()
    }
```

This allows you to seperate *what* the project dependencies are from *where* the dependencies are found.  

## .gitignore

Filters out the files / directories contained in the local project that should not be stored in GitHub.

## gradlew

Gradle executable allowing users to build the project without a local installation of Gradle. Uses the `settings.gradle` file for configuration parameters.

## gradlew.bat

Same as **gradlew** for Windows users.









