Feature: Testing the Bigsmall

Scenario Outline: Test Validation
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And click on sign link in home page to land on secure sign in page
When User enters <email> and <password> and sign in
And Close the driver



Examples: 
|email  					|password	|
|ksangee210@gmail.com		|sangee		|
|sangeethak343@gmail.com	|sangee		|

Scenario: WishList Testing
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And Click on wish list
And Click on settings
Then Enter "ksangee210@gmail.com" in the box
And click on connect
And Close the driver

Scenario: pincode checking
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And Click on Gift Card 
Then enter "635109" 
And check the COD availability
And Close the driver