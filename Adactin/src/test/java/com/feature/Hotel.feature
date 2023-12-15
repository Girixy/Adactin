Feature: Hotel Automaion

Scenario: Successful login with valid user name and password 

Given User Launch for Url
When User Enter the User name 
And User Enter the Password
And User click the login button
Then Next Page Shown

Scenario: 
When user fill all the details
|Melbourne|Hotel Hervey|Double|1|23/11/2023|26/11/2023|2|1|
And user click search button
Then next page shown 

Scenario: user enter the confirm button
When user click the agree button
And user click the continue button
Then next page3 shown 
 
Scenario: user enter the personal details
When user enter the details
|giri|prasath|chennai tamilnadu|1234567891234567|VISA|January|2029|123|
And user click booking button
