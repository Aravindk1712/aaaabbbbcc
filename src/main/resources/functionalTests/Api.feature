Feature: Verify the API for practise

Scenario: verify first name and last name
Given visiting the API
When get response from API
Then validate the response code
Then verify series

Scenario: verify circuitID and circuitName and locality
Given visiting the API
When get response from API
Then validate the response code
Then verify circuitID
And verify the circuitName
Then verify the locality

Scenario: verify the country
Given visiting the API
When get response from API
Then validate the response code
Then verify the country

Scenario: verify the circuiName
Given visiting the API
When get response from API
Then validate the response code
Then verify the circuiName

Scenario: verify the url
Given visiting the API
When get response from API
Then validate the response code
Then validate the url


Scenario: verify the name
Given visiting the API
When get response from API
Then validate the response code
Then validate the name


Scenario: verify the name2
Given visiting the API
When get response from API
Then validate the response code
Then validate the name2

Scenario: verify the url2
Given visiting the API
When get response from API
Then validate the response code
Then validate the url2

Scenario: verify the name3
Given visiting the API
When get response from API
Then validate the response code
Then validate the name

Scenario: verify the name4
Given visiting the API
When get response from API
Then validate the response code
Then validate the name






