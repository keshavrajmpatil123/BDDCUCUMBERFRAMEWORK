Feature:Test Login Functionality
Scenario Outline:check login is successful with valid credentials
Given browser is open
And user is on login page
When user enters "<username>" and "<password>"
And user click on login page
Then user navigated to home page

Examples:
| username | password |
| Admin | admin123 |

