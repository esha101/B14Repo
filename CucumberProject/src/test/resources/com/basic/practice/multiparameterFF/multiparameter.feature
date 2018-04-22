Feature: Create account of Facebook.
As a user you need to open facebook homepage and do the validations.

Scenario: Validate First name field
Given User needs to be on Faceboook login page
When User enters user "David" as first name and "Schwimmer" as last name
Then User checks user "David" first name is present

Scenario: Validate First name field
Given User needs to be on Faceboook login page
When User enters user "David" as first name
But User enters "Schwimmer" as last name
Then User checks user "David" first name is present