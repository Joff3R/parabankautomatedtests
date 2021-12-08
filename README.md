# SwagLabs Automated Tests
## Introduction
Aim of the project is to automate tests of SwagLabs website (https://www.saucedemo.com/)

## Technologies
Project is written using Java JDK 11

Project is managed with Maven

Tests are run with TestNG (https://testng.org/doc/index.html)

Frontend tests are automated with Selenide framework (https://selenide.org/) (powered by Selenium WebDriver)

## Patterns
Project code uses following patterns:
- Page Object Model
- Builder Pattern
- Singleton Pattern 

## Sources
Main repository of the project can be found at (https://github.com/Joff3R/swaglabsautomatedtests)

## Launch

- clone the repository 
```
$ git clone https://github.com/Joff3R/swaglabsautomatedtests
```
- set the compiler as Java 11
- download all Maven dependencies and reload the project
- add Java 11 JDK to your environment variables (PATH)
- run tests using mvn commandline
```
mvn clean test
```

## Configuration

path: main/java/base/StandardBase 
- in order to set the user that will be signed in for tests, set USER variable (e.g. ```USER = STANDARD_USER``` will run the tests logged in as standard_user)
  
path: main/java/base/TestConfiguration 
- to configure the browser WebDriver, edit setBrowserConfiguration() method, setting up using Selenide Configuration class (e.g. to run the browser in head mode, set ```headless = false;```)
