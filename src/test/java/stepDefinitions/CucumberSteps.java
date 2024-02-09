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
import testCases.TC_0003_CompareHeadingwithToolTip;
import testCases.TC_0004_ClickEachNewsAndPrint;
import testCases.TC_0005_AppsAndTools;

public class CucumberSteps{

	
	@Given("User is already logined on the BeCognizant Homepage")
	public void user_is_already_logined_on_the_be_cognizant_homepage() throws IOException {

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
	
	@Then("Compare News With Tool Tip")
	public void compare_news_with_tool_tip() {
		TC_0003_CompareHeadingwithToolTip d = new TC_0003_CompareHeadingwithToolTip();
		d.cmpTooltip();
	}

	@Then("Click Each News and Print and back to home page verify home page")
	public void click_each_news_and_print_and_back_to_home_page_verify_home_page() throws InterruptedException, IOException {
		TC_0004_ClickEachNewsAndPrint d = new TC_0004_ClickEachNewsAndPrint();
		d.clickEachNews();
	}

	@Then("Print All Apps and Tools Available On Home Page")
	public void print_all_apps_and_tools_available_on_home_page() throws InterruptedException {
		TC_0005_AppsAndTools d = new TC_0005_AppsAndTools();
		d.appsAndTools();
	
	}

}
