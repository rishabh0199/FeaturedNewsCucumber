
# Featured News

This is a Selenium based Automation Project on a website named https://be.cognizant.com

## Tech Stack

- Java(Maven Project)
- Eclipse (4.30.0)

### It is implemented by integrating Framework: ###

- ApachePOI (5.2.5)
- TestNG and (7.9.0)
- Cucumber (7.15.0)

### along with: ###

- Jenkins (2.426.3)
- ExtentReport (1.14.0)
- Page Object Model Concept

## Folder Structure

```bash
- src/test/java

 Package 1: pageObjects
   Class 1: BasePage.java
   Class 2: UserProfile.java

 Package 2: StepDefinitions
   Class 1: CucumberSteps.java
   Class 2: Hooks.java

  Package 3: testBase
    Class 1: BaseClass.java

  Package 4: testCases
    Class 1: CucumberTestRun.java
    Class 2: TC_0001_verifyUserDetails.java
    Class 3: TC_0002_NewsAndCount.java
    Class 4: TC_0003_CompareHeadingwithToolTip.java
    Class 5: TC_0004_ClickEachNewsAndPrint java
    Class 6: TC_0005_AppsAndTools.java
    Class 7: Combined.java

   Package 5: utilities
     Class 1: ExcelUtilFile.java
     Class 2: ExtentReportManager.java
     Class 3: WritingData.java

 - src/test/resources
	Config.properties
	Log4j2.xml

 - Excel
	Data.xlsx
 - FeatureFiles
	News.feature

-	Screenshot

-	Test-output

-	Master.xml

-	Parallelbrowsertest.xml

-	Pom.xml

-	Crossbrowsertest.xml

```

## Test Cases

There are total 4 Test Cases

```bash
  Test Case 1 : Click and Verify User Details
```
```bash
  Test Case 2 : Print Total News count and News Headings
```
```bash
  Test Case 3 : Compare News Heading with ToolTip
```
```bash
  Test Case 4 : Click each news one by one and print the news contents also verify the clicked news heading with opened news after click and verify you are on home page after each opening of news.
  ```
```bash
  Test Case 5 : Capture all the options Under Apps and Tools Print its count with content.
```

## Running the Project

We can run it Parallelly, serially and through XML file.
In order to run the project please make sure you have TestNg and Cucumber plugin installed in your Eclipse.

```bash

### Use- ###
Master.xml:to run Project using chrome with TestNG
### Use-### 
crossbrowsertest.xml:to run Project using chrome and edge with TestNG serially.
### Use- ###
parallelbrowsertest.xml:to run Project using chrome and edge parallelly with TestNG.
### Use-### 
CucumberTestRun.java:to run Project with Cucumber
### Use-### 
pom.xml:right click and run as Maven Test.

``` 

## Report and Screenshots

```bash
- Extent Report (//reports//Test-Report.html)
- Cucumber Report (//reports//myreport.html)
- TestNG Report(//test-output//index.html)
- Screenshots(//screenshots//appsandtools.png)
- ExcelData(//Excel)
- News Contents(//newsText//News.txt)
```


## A Result folder is present where I placed all the results of Last run.


## Author

- Rishabh Yadav(2304092)