#GherkinMultipleScenarios


Feature: To perfrom multiple scenarios

Background: To automate login form
Given when we are on the login page
When we will enter the valid username in username field
And when will  enter the password in password field
Then will click on the login button

Scenario: to perfrom the mouse hover on every menu point
 When we will mouse hover Admin option
 And we will mouse hover PIM option
 When we will mouse hover Leave option
 And we will mouse hover Time option
 Then we will mouse hover Recruitment option
 
 
 Scenario: To add multiple employee in PIM option
 
 When we will navigate to PIM option and click on the add button
 And we will enter the <firstname> in the firstname field
 When we will enter the <middlename> in the middlename field
 And we will enter the <lastname> in the lastname field
 Then we will click on the save button
 
 Examples:
 
 |firstname| middlename| lastname|
 |Rid1| abc1| test1|
 |Sid1|Naik1|test1| 