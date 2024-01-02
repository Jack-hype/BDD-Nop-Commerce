Feature: verify login functionality

@sanity
Scenario: validate the login page
Given user luanch the browser 
And open the url "https://admin-demo.nopcommerce.com/login"
When user enter email as "admin@yourstore.com" and password as "admin"
And click on login button
Then user is navigated on homepage 
And page title should be "Dashboard / nopCommerce administration"
When user click on logout option
Then page title should be "Your store. Login"
And close the browser

@smoke
Scenario Outline: validate the login page with data driven
Given user luanch the browser 
And open the url "https://admin-demo.nopcommerce.com/login"
When user enter email as "<Email>" and password as "<Password>"
And click on login button
Then user is navigated on homepage 
And page title should be "Dashboard / nopCommerce administration"
When user click on logout option
Then page title should be "Your store. Login"
And close the browser

Examples:
| Email | Password |
| admin@yourstore.com | admin |
| admin@yourstore.com | admin123 |





