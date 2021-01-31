Feature: Automate Local page


Scenario Outline: Tc01 Login

Given Launch browser and Load URL
Given Click Log In link
Given Enter email as <eml>
Given Enter password <pwd>
When Click Login Button
Then Navigate to Local phone page

Examples:

|eml|pwd|
|rhchowdhury@hotmail.com|rayhan73|




Scenario: Tc02 Add Contact
Given Launch browser and Load URL
Given Click Log In link
Given Enter email as rhchowdhury@hotmail.com
Given Enter password rayhan73
When Click Login Button
Then Click on Add Contact
Then Enter Name
Then Enter Country
Then Enter Phone Number
Then Click on Add a new Contact Button

@WIP
Scenario: Tc03 Delete a Name

Given Launch browser and Load URL
Given Click Log In link
Given Enter email as rhchowdhury@hotmail.com
Given Enter password rayhan73
When Click Login Button

Then Click Edit
Then Click Delete data

