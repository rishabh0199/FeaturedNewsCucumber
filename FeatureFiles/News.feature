Feature: Verifying User and all News
	#@sanity
  Scenario: User Information and News
    Given User is already logined on the BeCognizant Homepage
    Then Capture and print User Name and Email
    Then Print and Verify all News
    Then Compare News With Tool Tip
    Then Click Each News and Print and back to home page verify home page
    Then Print All Apps and Tools Available On Home Page
