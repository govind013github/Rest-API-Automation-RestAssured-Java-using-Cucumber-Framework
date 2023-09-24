# RestAPIAutomation-Cucumber-Framework-Design

i have Automated RestAPI using RestAssured-Java with Cucumber Framework. (Please refer master Branch)

This repository contains automated API tests using Rest Assured, a Java-based library for testing RESTful APIs. 
The tests are organized and executed using the Cucumber framework, which allows for behavior-driven development (BDD) practices and collaboration between technical and non-technical team members.

## Table of Contents

- [Introduction](#introduction)
- [Setup](#setup)
- [Usage](#usage)
- [Cucumber Framework](#cucumber-framework)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

## Introduction

This project is designed to showcase the automation of API testing using Rest Assured within a Cucumber framework. Rest Assured simplifies API testing by providing a domain-specific language for making API requests and validating responses. 
Cucumber facilitates writing tests in a natural language format and promotes collaboration between QA engineers, developers, and other stakeholders.

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/govind013github/RestAPIAutomation-Cucumber-Framework-Design.git

1.Install Java Development Kit (JDK) if not already installed.
2.Install Maven (if not already installed) for managing project dependencies.

## Usage
1.Navigate to the project directory:
cd RestAPIAutomation-Cucumber-Framework-Design

2.Build the project:
mvn clean install

3.Run the Cucumber tests:
mvn test

## Cucumber-framework
Cucumber is used as the test framework, which supports behavior-driven development (BDD) practices. Features and scenarios are defined in Gherkin, a human-readable language, allowing non-technical team members to participate in the testing process. Cucumber also integrates seamlessly with Rest Assured for API testing.

## Project Structure
The project structure is organized for better maintainability and readability. Here's an overview:


src/
├── main/
│   └── java/
│       └── api/
│           └── ...
├── test/
│   └── java/
│       ├── stepdefs/
│       │   └── ...
│       ├── runners/
│       │   └── ...
│       └── utils/
│           └── ...
└── resources/
    ├── features/
    │   └── ...
    └── config/
        └── ...

        
- src/main contains API-related code, such as API clients and utility classes.
- src/test is where Cucumber features, step definitions, runners, and utilities are located.
- resources includes feature files written in Gherkin and any configuration files.


## Contributing
Contributions to this project are welcome! If you find any issues or want to add new features, feel free to open a pull request. Please ensure that your code follows the established coding standards and includes appropriate tests.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Following Below Steps are Implemented in Designing the RestAPIAutomation-Cucumber-Framework-Design from Scratch.

Steps Implemented in Rest API Automation Framework from Scratch – 

1.	Created Maven Project with Cucumber and Rest Assured Dependencies.
2.	Defined Project Structure with Cucumber Framework Setup.
3.	Created Feature File with (. feature) extension inside src/test/java -> features Package and added Test Case you want to Automate.
4.	Implemented Step Definition smartly with supported code inside 
[src/test/java ->stepDefinitions package].
5.	Created TestRunner file inside src/test/java -> cucumber.Options package
6.	Build Utils File to define all reusable request and response specifications inside
[src/test/java ->resources package].
7.	Build Pojo classes for Serializing and Deserializing Json payload inside 
[src/main/java->pojo package]. 
Also created TestDataBuild class for separating payload from API request.
8.	Implemented Logging into Framework to log request and response details.
9.	Define global.properties file to drive all the global variables from properties file 
inside resources.
10.	Implemented Parameterization to run tests with multiple data sets using Cucumber
‘Examples’ – keyword inside feature file.
11.	Define Enum class with constants to centralize all resources details inside [src/test/java ->resources package->APIresources.java]
12.	Developed End to End Functionality Test with all Validations and Assertions.
13.	 Further Added More Tests and implemented Tagging Mechanism to run selected Tests from Test Runner file.
14.	Implemented Pre and Post conditions for tests with Cucumber Hooks class inside
[src/test/java ->stepDefinitions package].
15.	Executed Complete Framework from Maven Commands. By navigating to project location using cmd line and execute command – mvn test .
16.	Implemented Maven driven global values into Test for dynamic execution as below.
We can use below command to pass ‘tags’ through maven command line as well.
mvn test -Dcucumber.options=”- - tags @AddPlace”
Above -D stands for parameters to pass.
17.	Generate Reports for Test Execution results. (Add reporting plugin by searching on internet as maven cucumber reporting and set dependency in pom.xml file also mention in Cucumber.Options)
18.	Integrated the Framework further with Jenkin CI/CD tool.
19.	Further Implemented Parameterized Jenkins job to choose the global values at run time using Build with Parameters option.






