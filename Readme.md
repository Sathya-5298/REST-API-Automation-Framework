
# REST API Test Automation Framework
This Java-based REST API Test Automation Framework is designed for efficient and scalable API testing. 

It follows the Service Object Model (SOM) Design Pattern, enabling maintainability and modularization. The framework leverages Rest Assured for API testing, TestNG for execution, and integrates with CI/CD pipelines using GitHub Actions.
# About Me

Hello, I am SathyaMurth D and a Test Automation Engineer with over 3 years of experience with end-to-end testing projects across multiple domains such as retail, luxury fashion, gaming. Expertise in Automation Testing using Selenium WebDriver with Java, Cucumber BDD, TestNG, API testing with Postman and REST Assured, database testing. Embracing a mindset of continuous learning and seeking new opportunities to develop and grow in my role


## Authors

- [SathyaMurthy D](https://github.com/Sathya-5298)
- EmailAddress: smurthy1298@gmail.com

## Tech Stack

**Programming Langauge:** Java 11


## 🔗 Links

[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Sathya-5298)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sathyamurthyd/)
## Prerequisites
Before running this framework, ensure the following softwares are installed on system:
- **Java 11** installed and configured
- **Maven** installed (mvn --version to verify)
- **TestNG** installed (mvn test should execute test cases)

## Features
**API Testing:** Uses Rest Assured with Service Object Model (SOM) Design Pattern.

**Logging & Reporting:** Implements Filters in Rest Assured to capture request/response details for Extent Reports and Log4j.

**Parallel Execution:** Supports parallel execution using ParallelSuite.xml.

**Command-line Execution:** Uses Maven Surefire Plugin for CLI-based test execution.

**CI/CD Integration:** Integrated with GitHub Actions for automated test execution via cron jobs.

## Technologies Used

- Java 11
- REST Assured
- TestNG
- Gson and Apache POI
- Maven Surefire Plugin with custom parameters
- Extent Reports
- Log4j
- CI/CD with GitHub Actions

## Installation

**Clone the repository:**

```bash
    git clone https://github.com/Sathya-5298/REST-API-Automation-Framework.git

    cd REST-API-Automation-Framework
```

**Parameters**

**Suite:** It takes Siutes filename value

```bash
    mvn clean test -Dsuite=Suite -X
```

## Parallel Execution

Parallel execution is enabled in ParallelSuite.xml. Modify the configuration to adjust the number of threads:
```
<suite name="API Tests" parallel="methods" thread-count="5">
```
```
bash
    mvn clean test -Dsuite=ParallelSuite -X
```
## Generating Reports
After test execution, reports will be generated in the report.html file located in the ./reports.html.

## Logging
Logs will be stored in the logs directory as specified in the ./logs/APITest.log

## Integrated project with Github Actions
This TestAutomationFramework is integrated with github actions and tests will be executed at 11:30pm IST every single day.