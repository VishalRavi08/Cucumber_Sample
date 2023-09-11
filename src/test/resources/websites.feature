@performance2
Feature: Search A Product In Amazon

Background:
Given user Starts The Browser

@regression
Scenario: Look For A Mobile

When user Enters The Url
And user Enters The Product
And user Clicks The Search Icon
Then user Quits The Browser

@unit
Scenario: Check Seat Availability

When user Gives The Url
Then user Enters From
Then user Enters To
Then user Gives The Date
Then user Searches Availability
And user Closes The Application