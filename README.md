# Spring Boot API First Design With OpenAPI Generator
This showcases a simplistic Spring Boot project with an API-first design pattern.  
The rest package provides an implementation of a REST controller that imports API and model files that get generated automatically from the supplied [OpenAPI 3 spec file](src/main/resources/api.yml).  
Api and model files will be generated before the compileJava task of the Gradle Java plugin. The processResource dependency is to appease Gradle's compile optimisation.  
  
Please run `./gradlew clean build` to witness the magic.

