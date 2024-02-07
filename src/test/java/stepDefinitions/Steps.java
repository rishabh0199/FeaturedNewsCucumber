package stepDefinitions;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage;
import pageObjects.BeCognizantHome;
import testBase.BaseClass;
import testCases.TC_0001_VerifyUserDetail;
import testCases.TC_0002_NewsAndCount;

public class Steps extends BaseClass{

	
	@Given("User is already logined on the BeCognizant Homepage")
	public void user_is_already_logined_on_the_be_cognizant_homepage() throws IOException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the browser you want to use");
//		String br = sc.nextLine();
		BaseClass bs = new BaseClass();
		bs.driverSetup("chrome");
	}


	@Then("Capture and print User Name and Email")
	public void capture_and_print_user_name_and_email() {
		TC_0001_VerifyUserDetail d = new TC_0001_VerifyUserDetail();
		d.verify_User_Details();

	}

	@Then("Print and Verify all News")
	public void print_and_verify_all_news() {
		TC_0002_NewsAndCount d = new TC_0002_NewsAndCount();
		d.countNews();

	}

}
