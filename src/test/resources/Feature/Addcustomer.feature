Feature: Add new customer

Scenario: verify that the user should be added
Given user luanch the browser 
And open the url "https://admin-demo.nopcommerce.com/login"
When user enter email as "admin@yourstore.com" and password as "admin"
And click on login button
Then user is navigated on Dashboard page
When user click on customers menu
And click on customers option
And click on Addnew option
Then user can see add new customer page
When user enter customer info
And user click on save buttion
Then user can see configuration msg "The new customer has been added successfully."
And close the browser