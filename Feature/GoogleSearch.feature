@google
Feature: Google Search

Scenario Outline: Simple Search

Given I am on the goole homepage
When I enter search "<term>"
And I click on google search button
Then I receive related search results

Examples:
		|term             |
		|Quality Assurance|
		|Software Testing |
