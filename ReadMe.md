Task 2 - Wikipedia Mobile Testing
=================================

How to execute locally:
*TestRunner* can be used to trigger.

I tried to implement reusable and readable Cucumber BDD framework based on Java programing language.

Important **Dependencies** which I used Cucumber with Java, JUnit, Appium Java Client.


*Step Definitions* should be collected under **stepDefs** package which has also the Hook class which can be used 
for some actions before and/or after every execution.

**utils package** includes some important most common used methods.
<br>*CapabilitiesManager* actually has one method to manage and set the capabilities based on the environment
<br>*DriverManager* class sets *driver* based on the environment.
<br>*GlobalParams* gives us private critical values are not able to reach directly.
<br>*PropertyManager* allows us to use global variables.
<br>*ServerManager* server steps for windows and mac environments.
<br>*TestUtils* has some methods which give information during execution.

**pages** package is based on Page Object Model which is maintainable and readable. BasePage is a super class in which
can be implemented useful methods can be used by other classes.

With **TestRunner** class, execution can be triggered manually.
In **TestRunner** class I added *CucumberOptions* such as *glue*, *features*, *dryRun*, *tags* and *plugin*.
<br>*glue* indicates where step definitions are.
<br>*features* indicates where feature files are
<br>*dryRun* indicates and logs snippet methods can be not implemented.
<br>*monochrome* logs more readable code out.
<br>*tags* test cases can be sorted
<br>*plugin* executes runner classes and creates Cucumber HTML report.

**stepDefs** package has classes which have test cases belong to features

**features** package has *features* of the application. In this case I created some test cases related to *Searching*.
Test scenarios cover positive, negative and crud test cases. I did not cover all test issues that is why I implemented
couple of test cases.

Which tools used in building
======================================
- IntelliJ - IDE
- Appium - Mobile Automation library
- Maven - Build automation tool
- Java - Programming language
- Cucumber - BDD
- Gherkin
- JUnit
