Feature: Update user details in salesforce developers portal

Scenario Outline: Update user details in lightning web components data table 
Given user is on salesforce developers portal
When go to component reference page
Then component reference page is loaded
When user enters datatable in Quick Find textbox
And selects datatable option under Lightning Web Components
Then datatable is loaded
When user selects data table with inline edit option under example
And clicks run button

