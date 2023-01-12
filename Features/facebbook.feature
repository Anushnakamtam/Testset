Feature: This is for facebook 

#Scenario: Test facebook login 
#	Given launch the browser 
#	When user enters username and password 
#	Then click on login button 
	
	
#Scenario: This facebook login 
#	Given This browser 
#	When This user enters <"anu@gmail.com"> and <"Admin@123"> 
#	Then This click on login button 
	
	
Scenario Outline: Test facebook login 
	Given Testlaunch the browser 
	When Test user enters username and password "<DATA>" 
	Then Test click on login button 
	
	Examples: 
		|DATA|
		|Test-Sheet1|
		 