Feature:check home page functionality
Background:user is logged in
Given user is on login page
When user enters username and password
And user clicks on login button
Then user is navigated to homepage


Scenario:checkout logout link

When user clicks on welcome link
Then logout link is displayed

Scenario:verify quick launch toolbar is present

When  user clicks on dashbaord link
Then quick launch toolbar is displayed

