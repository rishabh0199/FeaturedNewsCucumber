package testCases;
import org.testng.annotations.Test;
import pageObjects.BeCognizantHome;
import pageObjects.UserProfile;
import testBase.BaseClass;

public class TC_0001_VerifyUserDetail extends BaseClass{
	@Test(priority=1,groups= {"sanity","master"})
	public void verify_User_Details()
	{
		//add all events(click and all) to log file
		logger.info("*****starting TC_0001_VerifyUserDetail******");
		try {
		BeCognizantHome user = new BeCognizantHome(driver);
		user.clickUserProfile();
		logger.info("*****Clicked on User Profile******");

		
		UserProfile details = new UserProfile(driver);
		details.getUserInformation();
		logger.info("*****Get user Information******");
		}catch(Exception e)
		{
			logger.error("test Failed......");
		}
		logger.info("*****Finishes TC_001_VerifyUserDetail******");
	}
	

}
