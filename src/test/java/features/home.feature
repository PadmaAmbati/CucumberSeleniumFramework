Feature: validating Search  and add vegetables functionality 


@test
Scenario Outline: validate search functionality
Given User is on Greencart home page
When User enter the <vegetable> in serachbox
Then <vegetable> is displayed

Examples:
|vegetable|
|Cucumber|

@smoke
Scenario Outline: validate adding vegetables to cart
Given User is on Greencart home page
When User enter the <vegetable> in serachbox
Then <vegetable> is displayed
And Add the vegitable to cart
And Click onCartBag
Then added <vegetable> is present in cart

Examples:
|vegetable|
|Beetroot|