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


