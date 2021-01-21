$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/resources/FeatureFiles/DX_QA.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sreenath.Deshagani@gmail.com"
    }
  ],
  "line": 3,
  "name": "MassMutual Written test",
  "description": "",
  "id": "massmutual-written-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Navigate to exercise page",
  "description": "",
  "id": "massmutual-written-test;navigate-to-exercise-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the user to navigate to the Test url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the title of url is DX_QA test page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login page",
  "keyword": "And "
});
formatter.match({
  "location": "DX_QA.the_user_to_navigate_to_the_Test_url()"
});
formatter.result({
  "duration": 33868899700,
  "status": "passed"
});
formatter.match({
  "location": "DX_QA.the_title_of_url_is_DX_QA_testpage()"
});
formatter.result({
  "duration": 13954600,
  "status": "passed"
});
formatter.match({
  "location": "DX_QA.user_enters_username_and_password()"
});
formatter.result({
  "duration": 66463900,
  "status": "passed"
});
formatter.match({
  "location": "DX_QA.user_clicks_on_login_page()"
});
formatter.result({
  "duration": 22110800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verifying Results of Values given in problem statement",
  "description": "",
  "id": "massmutual-written-test;verifying-results-of-values-given-in-problem-statement",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "verify user is on exercise page with values displayed on screen",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "verify \tthe right count of values appear on screen",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify values on screen are greater than zero",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify total balance is equal to all individual values",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify values are formatted to currencies",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify total balance matches sum of the values",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the Webdriver",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestResults.verify_user_is_on_exercise_page_with_values_displayed_on_screen()"
});
formatter.result({
  "duration": 276600,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.verify_the_right_count_of_values_appear_on_screen()"
});
formatter.result({
  "duration": 278500,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.verify_values_on_screen_are_greater_than_zero()"
});
formatter.result({
  "duration": 260700,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.verify_total_balance_is_equal_to_all_individual_values()"
});
formatter.result({
  "duration": 266600,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.verify_values_are_formatted_to_currencies()"
});
formatter.result({
  "duration": 170900,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.verify_total_balance_matches_sum_of_the_values()"
});
formatter.result({
  "duration": 143600,
  "status": "passed"
});
formatter.match({
  "location": "MainTestResults.close_the_driver()"
});
formatter.result({
  "duration": 184200,
  "status": "passed"
});
});