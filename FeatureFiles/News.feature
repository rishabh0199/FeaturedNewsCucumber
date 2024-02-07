Feature: Verifying User and all News
	#@sanity
  Scenario: User Information and News
    Given User is already logined on the BeCognizant Homepage
    Then Capture and print User Name and Email
    Then Print and Verify all News
