Feature: Fill basic form
As a user u need to open demo website and fill basic form



Scenario: Validate registration form
Given User needs to be on Demo website page
When Enter the following data
	|Firstname	|Lastname	|Emailadd 			|Phone       |Gender	 |Conuntry      |
	|Tom				|Hanks		|tom@gmail.com	|123456789   |Male		 |India		      |
	|Meg				|Ryan			|megs@gmail.com	|123456789   |Female  |United States | 		
	
Then Click on submit 


