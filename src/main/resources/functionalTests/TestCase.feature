Feature: Validating the demoqa&Cycl& website page

@smoke
Scenario Outline: verify the elements in Demoqa 

Given User should open the url
When User should click the element button
And User should click the text box and enter all the details
And User should click the submit button

@smoke
Scenario Outline: verify the checkbox in Demoqa 

Given User should open the url
When User should click the element button
And User should click the check box
And User should click the home  button and click workfile.doc


@smoke
Scenario Outline: verify the radiobutton in Demoqa 

Given User should open the url
When User should click the element button
And User should click the radiobutton option
And User should click the yes for the answer



@smokecheck2
Scenario Outline: verify the buttonn in Demoqa 

Given User should open the url
When User should click the element button
And User should click the button option
And User should click the double click



@smoke
Scenario Outline: verify the webtable and edit in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and submit


@smoke
Scenario Outline: verify the rad_button in Demoqa 

Given User should open the url
When User should click the element button
And User should click the radio_button option
And User should click the Impressive

@smoke
Scenario Outline: verify the webtable and delete table in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the delete button


@smoke
Scenario Outline: verify the Demoqa Right_click option 

Given User should open the url
When User should click the element button
And User should click the button option
And User should click the Rightclick option 


@smoke
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the notfound option 



@smokecheck3
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the brokenlink option
And User should click the brokenlink  

@sanity
Scenario Outline: verify the Demoqa  valid link option 

Given User should open the url
When User should click the element button
And User should click the brokenlink option
And User should click the validlink  


@sanity
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the forbidden option

@sanity
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the unauthorized option

@sanity
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the created option


@sanity
Scenario Outline: verify the Demoqa link option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the nocontent option


@sanity
Scenario Outline: verify the Demoqa move option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the moved option


@sanity
Scenario Outline: verify the Demoqa badrequest option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the badrequest option



@sanity
Scenario Outline: verify the Demoqa Home  option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the home option


@sanity
Scenario Outline: verify the homevPSkr Home  option 

Given User should open the url
When User should click the element button
And User should click the link option
And User should click the homevPSkr option

@sanity
Scenario Outline: verify the webtable and edit salary in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and edit salary


@sanity
Scenario Outline: verify the Age and  able to edit age  in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and edit age



@sanity
Scenario Outline: verify the Email and  able to edit Email  in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and edit email


@sanity
Scenario Outline: verify the Email and  able to edit department  in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
And User should click the edit option and change department



@sanity
Scenario Outline: verify the lastname and  able to edit lastname  in Demoqa 

Given User should open the url
When User should click the element button
And User should click the webtable option
#And User should click the edit option and change lastname
#
#@sanitycheck
#Scenario Outline: verify the cyclos  Edit profile  and add mobile number
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the edit profile   button
#And User should change the name and add mobile number and click save button
#Examples:
#|User|pass| 
#|arav|1994|
#
#
#
#@sanity
#Scenario Outline: verify the cyclos switch theme
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the switch theme button new  button
#
#Examples:
#|User|pass| 
#|arav|1994|
#
#
#@sanity
#Scenario Outline: verify the cyclos in payment user
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the payment button
#And User should enter the value and click confirm button
#Examples:
#|User|pass| 
#|arav|1994|
#
#
#
#
#@sanity
#Scenario Outline: verify the cyclos  directory
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the directory button
#And User should click My vouchers and click Buy vouchers and send button
#Examples:
#|User|pass| 
#|arav|1994|
#
#
#@sanity
#Scenario Outline: verify the scheduled payments
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payment
#Examples:
#|User|pass|
#|arav|1994|
#
#@sanity
#Scenario Outline: verify the cyclos switch theme rechk
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the switch theme button new  button
#
#Examples:
#|User|pass| 
#|arav|1994|
#
#@sanity
#Scenario Outline: verify the cyclos  directory voucher
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the directory button
#And User should click My vouchers and click Buy vouchers and send button
#Examples:
#|User|pass| 
#|arav|1994|
#
#@sanity
#Scenario Outline: verify the cyclos member account
#
#Given User launch open the url
#When User should enter the "<User>" and "<pass>"
#And User should click the member account button
#And User should click car repair details and validate that
#Examples:
#|User|pass| 
#|arav|1994|

Scenario: login the application
    Given User get the title
    When User should enter the username
    And User should enter the password
    Then User should login the application

  Scenario: Choose the fish
    Given User launch the url
    When User choose the fish
    Then User should choose the product

  Scenario: Choose the Dog
    Given User get the current url
    When User choose the Dos
    Then User should choose the Dog

  Scenario: Choose the Cats
    Given User Get the url
    When User choose the Cats
    Then User should choose the Cat

  Scenario: Choose the Reptiles
    Given User Get the title and url
    When User choose the Reptiles
    Then User should choose the Reptiles

  Scenario: Choose the Birds
    Given User should get the title
    When User choose the Birds
    Then User should choose the Birds

  Scenario: Add the fish to cart
    Given User get the title for the application
    When User choose the fish in the front page
    Then User should choose add the fish to cart

  Scenario: Add the Dog to cart
    Given User launch the application
    When User choose the Dog in the front page
    Then User should choose add the Dog to cart

  Scenario: Add the Cats to cart
    Given User launching the url
    When User choose the Cats in the front page
    Then User should add the cat to cart

  Scenario: Add the Reptiles to cart
    Given User launch the url app
    When User choose the Reptiles in the front page
    Then User should add the Reptiles to cart

  Scenario: Add the Birds to cart
    Given User launching the application url
    When User choose the Birds in the front page
    Then User should add the Birds to cart

  Scenario: Remove the fish to cart
    Given Choose the fish to cart
    When User Add the fish to cart
    Then User Remvoe the fish to cart

  Scenario: Remove the Dog to cart
    Given Choose the Dog to cart
    When User Add the Dog to cart
    Then User Remvoe the Dog to cart

  Scenario: Remove the Cat to cart
    Given Choose the Cat to cart
    When User Add the Cat to cart
    Then User Remvoe the Cat to cart

  Scenario: Remove the Reptiles to cart
    Given Choose the Reptiles to cart
    When User Add the Reptiles to cart
    Then User Remvoe the Reptiles to cart

  Scenario: Remove the Birds to cart
    Given Choose the Birds to cart
    When User Add the Birds to cart
    Then User Remvoe the Birds to cart

  Scenario: search the fish
    Given Launch the app
    When Enter the fish name
    Then click the search button

  Scenario: search the Dog
    Given Launch the jpet app
    When Enter the Dog name
    Then click the search

  Scenario: search the cat
    Given Launch the pet app
    When Enter the Cat name
    Then click the search the

  Scenario: Search the Reptiles
    Given Launch the pet application
    When Enter the Reptiles name
    Then click search button

  Scenario: Search the Birds
    Given Launch the Jpet application
    When Enter the Birds name
    Then click search button
    
    @katalonsmoke
  Scenario Outline: verify login at katalon website
    Given user should open the browser
    When user should enter the "<User>" and "<pass>"
    Then user should click login  and logout
  Examples: 
  |User    |pass              |
  |John Doe|ThisIsNotAPassword|
    
    @katalonsmoke
    Scenario Outline: verify Appoinment at katalon website
    Given user should open the browser
    When user should enter the "<User>" and "<pass>"
    When user should click login
    Then user should enter all the details and book appoinment
  Examples: 
  |User    |pass              |
  |John Doe|ThisIsNotAPassword|
  
  @katalonsmoke
   Scenario Outline: verify Home page at katalon website
    Given user should open the browser
    When user should enter the "<User>" and "<pass>"
    When user should click login
    Then user should click home button
  Examples: 
  |User    |pass              |
  |John Doe|ThisIsNotAPassword|
  
@katalonsmoke
   Scenario Outline: verify history at katalon website
    Given user should open the browser
    When user should enter the "<User>" and "<pass>"
    When user should click login
    Then user should click history button
  Examples: 
  |User    |pass              |
  |John Doe|ThisIsNotAPassword|
  
  @katalonsmoke
    Scenario Outline: verify prifile at katalon website
    Given user should open the browser
    When user should enter the "<User>" and "<pass>"
    When user should click login
    Then user should click profile button
  Examples: 
  |User    |pass              |
  |John Doe|ThisIsNotAPassword|
    
  @smoke
    Scenario Outline:
Given user launch the browser and open the Url
When user enter the username and password
And user should click add to cart option 
Then User should enter all the details and click checkout button

   















