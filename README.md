cat <<EOL > README.md
# Kalbela Mobile Application Automation

This project automates testing for the Kalbela mobile application using Java, Selenium, Appium, TestNG, and Gradle. Additionally, Allure is integrated for test reporting, and video recording is enabled for test runs.

## Project Structure

```
.
├── .gitignore
├── build.gradle
├── gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
├── src
│   ├── main
│   └── test
│       ├── java
│       │   ├── KalbelaAppScreen.java
│       │   ├── Setup.java
│       │   └── TestRunner.java
│       └── resources
│           └── suite.xml
└── .idea
```

## Getting Started

### Prerequisites

- JDK 8 or higher
- Android Studio or Appium Desktop
- Gradle
- Allure for generating test reports

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/nakais/Kalbela-Mobile-Application_Automation.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Kalbela-Mobile-Application_Automation
   ```

3. Build the project:
   ```bash
   gradle clean build
   ```

### Running the Tests

To run the TestNG tests defined in \`suite.xml\`:

```bash
gradle test
```

### Allure Reports Generation

To generate Allure reports after the test run:

1. Generate the Allure results:
   ```bash
   allure generate allure-results --clean -o allure-report
   ```

2. Serve the Allure report:
    ```bash
   allure serve allure-results
   ```
### Allure Reports


### Video Recording
Comming soon.....

## .gitignore

The following directories/files are ignored in the repository:

```
.gradle/
.idea/
build/
gradle/
allure-report/
allure-results/
```
