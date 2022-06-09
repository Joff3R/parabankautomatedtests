# SwagLabs Automated Tests
## Introduction
Aim of the project is to automate GUI tests of SwagLabs website (https://www.saucedemo.com/)

![swaglabstestsGif](https://user-images.githubusercontent.com/30385512/172943983-b8ef3bb6-8c90-4f67-835e-7ff9346dff6a.gif)

## Technologies
Java, Selenide, Maven, TestNG 

## Patterns
Project code uses following patterns:
- Page Object Model
- Builder Pattern
- Singleton Pattern

Project is written using BDD approach

## Sources
Main repository of the project can be found at (https://github.com/Joff3R/swaglabsautomatedtests)

## Launch


- download Java, Maven, Git
- add Java and Maven to your environment variables
- clone the repository 
```
$ git clone https://github.com/Joff3R/swaglabsautomatedtests
```
- download all Maven dependencies and reload the project
- run tests using mvn commandline
```
mvn clean test
```

## Configuration

path: main/java/base/StandardBase 
- in order to set the user that is used for tests, set USER variable (e.g. ```USER = STANDARD_USER``` will run the tests logged in as standard_user)
  
path: main/java/base/TestConfiguration 
- to configure the browser WebDriver, edit setBrowserConfiguration() method, setting up using Selenide Configuration class (e.g. to run the browser normal browser mode, set ```headless = false;```)
