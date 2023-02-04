google
Feature: Google Search - Feeling Lucky

Scenario Outline: Simple Search

Given I am on the goole homepage
When I enter search "<term>"
And I click on feeling lucky button
Then I land on the first result homepage

Examples:
		|term             |
		|Quality Assurance|
		|Software Testing |