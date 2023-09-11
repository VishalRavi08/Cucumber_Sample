@performance1
Feature: Create New Facebook Account

@sanity
Scenario: New Facebook Account Creation
Given user Launches The Browser
When user Launches The Application
And user Clicks The Create New Account
And user Enters The First Name
|Ash|Ben|Candy|Brook|
And user Enters The Second Name
|abc|def|ghi|
|xyz|654|152|
|258|471|lara|
And User Enters The Email Or Mobile
|email1|abc@gmail.com|
|email2|xyz@gmail.com|
|email3|iop@gmail.com|
And user Enters The Passord
|password1|password2|password3|
|132|4568|87789|
|65|6|846844|
|3215|3519|35168|
Then user Closes The Browser

@smoke
Scenario Outline:
Given user Initiates The Browser
When user Launches The Webapplication
And user Enters The "<email>" Username
And user Enters The "<password>" Password
And user Clicks The Login
Then user Ends The Browser

Examples:
|email					|password|
|abc@gmail.com	|poiu|
|xyz@gmail.com	|ijjsj|
|hfueh@gmail.com|su@516|