Feature: Fill basic form
As a user u need to open demo website and fill basic form



Scenario Outline: Validate registration form
Given User needs to be on Demo website page
When Firstname is entered as "<Firstname>"
And Lastname is entered as "<Lastname>"
And emailadd is entered as "<Emailadd>"
And Phone is entered as "<Phone>"
And Gender is entered as "<Gender>"
And Country is entered as "<Country>"
Then Click on submit 
Examples: 
	|Firstname	|Lastname	|Emailadd 			|Phone       |Gender	 |Country      |
	|Tom				|Hanks		|tom@gmail.com	|123456789   |Male		 |India		      |
	|Meg				|Ryan			|megs@gmail.com	|123456789   |Female   |United States | 		


