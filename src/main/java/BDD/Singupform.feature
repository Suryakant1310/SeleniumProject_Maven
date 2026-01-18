#Gelerkin code of Signup form

Feature:to test the sign up form
Scenario: perfrom the smoke testing

Given User will click on the creat account button
When user will enter the firstname in firstname field
And user will enter the Surname in Surname field
When user will enter the Date of Birth in the Date of birth field
And user will select the Gender option as Male, Female, custom
When usre will enter the mobile number in mobile number field
And user will enter the New passoword in New password field
Then user will click on Sign Up button

