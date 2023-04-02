Feature: Validating the demoqa&Cyclo page

@smokecheck
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
And User should click the edit option and change lastname











