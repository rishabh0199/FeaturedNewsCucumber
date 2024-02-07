Feature: Verifying User and all News

  Scenario: User Information and News
    Given User is already logined on the BeCognizant Homepage
    When Click on Profile
    Then Capture and print User Name and Email
    And Print and Verify all News
