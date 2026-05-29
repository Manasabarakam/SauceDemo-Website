Feature: Automating the SauceDemo E-commerce website

Scenario: Successful checkout workflow
  Given the user is on the Sauce Demo Page
  When user logs in with the correct credentials
  And adds items to the cart 
  And the user click checkout
  And enters checkout information with first name "Manasa" last name "Barakam" and zip code "600040"
  Then the order confirmation message "Thank you for your order!" should be displayed
