# SwagLabs Automated Tests
## Introduction
Aim of the project is to automate tests of SwagLabs website (https://www.saucedemo.com/)

## Technologies
Project is written using Java JDK 11

Project is managed with Maven

Tests are run with TestNG (https://testng.org/doc/index.html)

Front-end functionalities tests are automated with Selenide framework (https://selenide.org/) (powered by Selenium WebDriver)

## Patterns
Project code uses following patterns:
- Page Object Model
- Builder Pattern

## Sources
Main repository of the project could be found at (https://github.com/Joff3R/parabankautomatedtests)

## Launch

- clone the repository 
```
$ git clone https://bitbucket.pansa.pl/scm/tests/webrqaautomatedtests.git
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
- to set the user to run the project at, set USER variable (e.g. ```USER = STANDARD_USER``` will run the tests logged in as standard_user)
  
path: main/java/base/TestConfiguration 
- to configure the browser WebDriver, edit setBrowserConfiguration() method, setting up using Selenide Configuration class (e.g. to run the browser in head mode, set ```headless = false;```)

## Static analysis

### PMD
 - https://pmd.github.io/latest/
 - to execute static analysis by PMD run ```mvn pmd:pmd```
 - you can find report in `target/site/pmd.html`
 - PMD analysis is running during `clean` phase 
 - All PMD analysis results can be seen in logs when running tests with for example `mvn clean test` command 
### SonarLint
 - https://www.sonarlint.org/
 - install SonarLint plugin in IntelliJ
 - right click on root folder `webrqaautomatedtests` and select `SonarLint -> Analyze with SonarLint`

### Error Prone
 - https://errorprone.info/
 - Error Prone static analysis is executed automatically when compiling project, for example with `mvn clean test` command
 - analysis results are visible in logs
