Feature: Create account of Facebook.
As a user you need to open facebook homepage and do the validations.

Scenario: Validate First name field
Given User needs to be on Faceboook login page
When User enters user "David" as first name
Then User checks user "David" first name is present


#Scenario: