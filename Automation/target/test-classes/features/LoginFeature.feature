Feature: Application Login

Background:
Given User is on the login page
Then user lands on the home page
| Background | check | Mine | kaden | 

@Smoke
Scenario: Home page login functionality
Given User is on the login page
When user logins with the username and password
Then user lands on the home page
| Smoke1 | 

@Smoke
Scenario: Home page login functionality
Given User is on the login page
When user logins with the username and password
Then user lands on the home page
| Smoke2 |

@RegTest
Scenario Outline: Scenarios outline example
Given User is on the login page
When user logins with the username and password
Then user lands on the home page for <UserName> and <Password>
Examples:
| UserName  | Password 	|
| Karan     | Rahul		|
| Diksha	| Mishra	|
