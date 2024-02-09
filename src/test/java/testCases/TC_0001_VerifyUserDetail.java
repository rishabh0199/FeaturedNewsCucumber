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
		BaseClass.getLogger().info("*****starting TC_0001_VerifyUserDetail******");
		try {
		BeCognizantHome user = new BeCognizantHome(driver);
		user.clickUserProfile();
		BaseClass.getLogger().info("**********Clicked on User Profile************");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("User Information:");
		UserProfile details = new UserProfile(driver);
		details.getUserInformation();
		
		BaseClass.getLogger().info("**********Get user Information************");
		}catch(Exception e)
		{
			BaseClass.getLogger().info("test Failed......");
		}
		BaseClass.getLogger().info("**********Finishes TC_001_VerifyUserDetail************");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	

}
