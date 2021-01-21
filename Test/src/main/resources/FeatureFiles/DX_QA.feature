#Author: Sreenath.Deshagani@gmail.com
#Date : 21/01/2021

Feature: MassMutual Written test


  Scenario: Navigate to exercise page
    Given the user to navigate to the Test url
    When the title of url is DX_QA test page
    Then user enters username and password
    And user clicks on login page
  
  
  Scenario: Verifying Results of Values given in problem statement
     Given  verify user is on exercise page with values displayed on screen
     Then verify 	the right count of values appear on screen
     Then verify values on screen are greater than zero
     Then verify total balance is equal to all individual values
     Then verify values are formatted to currencies
     Then verify total balance matches sum of the values
     And Close the Webdriver

