Feature:  logın button

  @LoginTest

  Scenario: login every hour, if unsuccessful, warn
    Given Go tto bookzpro.com home page
    And Click on the user Account menu
    And Given user enters email address
    And enter the user Password
    Then user Clicks Login button