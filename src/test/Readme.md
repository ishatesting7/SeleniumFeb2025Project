Package
-------
A collection of (.java)

public 
------
Access Modifier

class
-----
A block which will consist of Variables and Method

static
------
A keyword, responsible for calling the methods/variable without
creating an instance

void
----
void, will make to return nothing

System
------
predefined class which is providing access 

out
---
it is a static field

println
-------
It is a method

Comments
--------
1. Single Line
2. Multi Line

Datatypes in Java
-----------------

int
float
double
long
int
short
byte
boolean

final
-----
 - variable
 - method 
 - class

methods
-------



static
------
- You do not need to define object of a particular class
- static varible


GIT
---
git add .
git commit -m "Java Project"
git push remote origin

2 Programs(28th Feb)
-------------------

1. To check weather String is Anagram or Not (LISTEN, SILENT)
2. To check weather String is Palindrome (RADAR, MOM)


2 Programs(3rd March)
--------------------
1. Display all the leap year from today till 2300

2. To Display 
        * * * * *
        * * * *
        * * * 
        * *
        * 
3 Programs
   - Collections Topic with 10 Methods
   - HashMap - 10 Methods
   - HashTable - 10 Methods
   - HashSet - 10 Methods
   - LinkedList - 10 Method
   - ArrayList - 10 Methods

4 Programs (7th March)
   - Fibonacci
   - Swapping Number without using 3rd Number
   - Reverse of String
   - Reverse of a Word of Complete Sentence

Assignment - 3 Test Cases - 13th March 2024 (SauceDemo)
1. Add 1 Product and Do a checkout Including assertion
2. Add 6 Product and Do a checkout Including assertion
3. Add 1 Product and Keep 'Checkout Information Empty' and Validate the Error message

Assignment - Xpath - https://tutorialsninja.com/demo/
1. Use all the Xpath axes in the checkout flow
   Child Axis
   Parent Axis
   Self Axis
   Ancestor Axis
   Ancestor-or-self Axis
   Descendant Axis
   Descendant-or-self Axis
   Following Axis
   Following-sibling Axis
   Preceding Axis
   Preceding-sibling Axis
   Attribute Axis
   Namespace Axis

DataDriven Testing
------------------
1. Apache POI/Apache POI - OOXML
2. Test Data - Read

.xlsx - XSSF
.xls - HSSF

log4J2
------

log4j2.properties
log4j2.xml

Trace < Debugs < Info < Warn < Error < Fatals < Off

PAGE OBJECT MODEL
----------------

- PageFactory
- Without PageFactory

Ecommerce Application
    - Login
    - Registration

loginPage.java
//Page Elements
//Page Actions -- User Actions

homePage.java
//Page Elements
//Page Actions -- User Actions

loginTest.java
//It will use methods from loginPage.java

homeTest.java
//It will use methods from homePage.java







<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Properties>
        <Property name="log-path">./logs</Property>
        <Property name="log-pattern">%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n</Property>
    </Properties>

    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="${log-pattern}"/>
        </Console>

        <RollingFile name="File" fileName="${log-path}/automation.log"
                     filePattern="${log-path}/automation-%d{MM-dd-yyyy}-%i.log.gz">
            <PatternLayout pattern="${log-pattern}"/>
            <Policies>
                <TimeBasedTriggeringPolicy/>
                <SizeBasedTriggeringPolicy size="1MB"/>
            </Policies>
            <DefaultRolloverStrategy max="10"/>
        </RollingFile>
    </Appenders>

    <Loggers>
        <Root level="INFO">
            <!--<AppenderRef ref="Console"/>-->
            <AppenderRef ref="File"/>
        </Root>
    </Loggers>
</Configuration>



package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
public ExtentSparkReporter sparkReporter;
public ExtentReports extent;
public ExtentTest test;

	String repName;

	public void onStart(ITestContext testContext) {
		
		/*SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Date dt=new Date();
		String currentdatetimestamp=df.format(dt);
		*/
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report

		sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of report
		sparkReporter.config().setReportName("opencart Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "opencart");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("Sub Module", "Customers");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environemnt", "QA");
		
		String os = testContext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
		extent.setSystemInfo("Groups", includedGroups.toString());
		}
	}

	public void onTestSuccess(ITestResult result) {
	
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.PASS,result.getName()+" got successfully executed");
		
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL,result.getName()+" got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try {
			String imgPath = new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName()+" got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
	}

	public void onFinish(ITestContext testContext) {
		
		extent.flush();
		
		String pathOfExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;
		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		 
	}

}


<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">


<suite name="Master Suite">

  <listeners>
	  <listener class-name="utilities.ExtentReportManager" />
  </listeners>

  <test thread-count="5" name="Test">
    <parameter name="os" value="Windows"/>
    <parameter name="browser" value="chrome"/>

    <classes>
      <class name="testCases.TC001_AccountRegistrationTest"/> 
      <class name="testCases.TC002_LoginTest"/> 
      <!--<class name="testCases.TC003_LoginDDT"/>-->
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->