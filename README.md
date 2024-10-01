cat <<EOL > README.md
# Kalbela Mobile Application Automation

This project automates testing for the Kalbela mobile application using Java, Selenium, Appium, TestNG, and Gradle. Additionally, Allure is integrated for test reporting, and video recording is enabled for test runs.

## Project Structure

```
Kalbela_Mobile_Application_Automation/
├── .gradle/
├── .idea/
├── allure-report/                   # Allure report files
├── allure-results/                  # Results generated for Allure reports
├── build/
│   └── reports/
├── gradle/
├── src/
│   └── test/
│       ├── java/
│       │   ├── KalbelaAppScreen.java    # Page Object Model file for app screen interactions
│       │   ├── Setup.java              # Setup and configuration for WebDriver and Appium
│       │   └── TestRunner.java         # Test runner class for executing test cases
│       └── resources/
│           └── suite.xml               # TestNG suite file for running the tests
├── .gitignore
├── build.gradle                        # Gradle dependencies and configurations
└── README.md                           # Project documentation

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
Adding soon...

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
