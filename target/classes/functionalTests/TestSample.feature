Feature: Validating the Cyclo page


@test25
Scenario Outline: verify the cyclos  Edit profile  and add mobile number

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the edit profile   button
And User should change the name and add mobile number and click save button
Examples:
|User|pass| 
|arav|1994|



@sanity
Scenario Outline: verify the cyclos switch theme

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the switch theme button new  button

Examples:
|User|pass| 
|arav|1994|


@sanity
Scenario Outline: verify the cyclos in payment user

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the payment button
And User should enter the value and click confirm button
Examples:
|User|pass| 
|arav|1994|




@sanity
Scenario Outline: verify the cyclos  directory

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the directory button
And User should click My vouchers and click Buy vouchers and send button
Examples:
|User|pass| 
|arav|1994|


@sanity
Scenario Outline: verify the scheduled payments

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment
Examples:
|User|pass|
|arav|1994|

@sanity
Scenario Outline: verify the cyclos switch theme rechk

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the switch theme button new  button

Examples:
|User|pass| 
|arav|1994|

@sanity
Scenario Outline: verify the cyclos  directory voucher

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the directory button
And User should click My vouchers and click Buy vouchers and send button
Examples:
|User|pass| 
|arav|1994|

@sanity
Scenario Outline: verify the cyclos member account

Given User launch open the url
When User should enter the "<User>" and "<pass>"
And User should click the member account button
And User should click car repair details and validate that
Examples:
|User|pass| 
|arav|1994|






