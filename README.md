# bdd-cucumber-serenity
A test project built based on behavior driven development framework with cucumber, serenity, java
This project can be used to automate high quality UI, functional and acceptance tests, with powerful reporting features.

### The project directory structure
The project follows the standard directory structure used in most bdd projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners, stepdefinitions and application page object files
    + resources
      + features                  Feature files
       + webdriver                Driver, serenity configuration files
```
## Executing the tests
The project is fully developed and the scenarios are automated. But currently not in executable state due to dependencies not supported between serenity-cucumber4, maven and java which needs some fix.
```

The test results will be recorded in the `target\site` directory.
