package testCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.BeCognizantHome;
import pageObjects.UserProfile;
import testBase.BaseClass;

public class TC_Combined extends BaseClass{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		@Test(priority=1,groups= {"sanity","master"})
		public void verify_User_Details()
		{
			//add all events(click and all) to log file
			//logger.info("*****starting TC_0001_VerifyUserDetail******");
			try {
			BeCognizantHome user = new BeCognizantHome(driver);
			user.clickUserProfile();
			//logger.info("*****Clicked on User Profile******");

			
			UserProfile details = new UserProfile(driver);
			details.getUserInformation();
			//logger.info("*****Get user Information******");
			}catch(Exception e)
			{
				//logger.error("test Failed......");
			}
		//	logger.info("*****Finishes TC_001_VerifyUserDetail******");
		}
		
		@Test(priority=2,groups= {"regression","master"})
		public void countNews()
		{
			//logger.info("*****starting TC_0002_NewsAndCount******");
			BeCognizantHome news=new BeCognizantHome(driver);
			List<WebElement> allnews=news.getAllNews();
			//logger.info("*****Printing Total News Count******");
			System.out.println("Total News: "+allnews.size());
			//logger.info("*****News:******");
			for(WebElement elem:allnews)
			{
				System.out.println(elem.getText());
			}
			System.out.println();
			//logger.info("******Finished TC_0002_NewsAndCount******");
		}
		@Test(priority=3,groups= {"sanity","master"})
		public void cmpTooltip(){
		System.out.println("=====================Comparing with Tool Tip============================");
		
		BeCognizantHome tt = new BeCognizantHome(driver);
		List<WebElement> allNews = tt.getAllNews(); 
		
		for(WebElement elem:allNews)
		{
			String news = elem.getText();
			System.out.println("News: " + news);
			String toolTip = elem.getAttribute("title");
			System.out.println("ToolTip: " + toolTip);
			if(news.equalsIgnoreCase(toolTip))
			{
				System.out.println("============News matching with Tool Tip===============");
			}
			else
			{
				System.out.println("==============News not matching with Tool Tip==========");
			}
		}
		}
		
		@Test(priority=4,groups= {"sanity","master"})
		public void clickEachNews() throws InterruptedException {
			System.out.println("========================Clicking each news and Verifying it==============================================");
			
			BeCognizantHome news = new BeCognizantHome(driver);
			List<WebElement> allnews=news.getAllNews();
			for(int i=0;i<allnews.size();i++)
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~opening news:"+(i+1)+"~~~~~~~~~~~~~~~~~~~~~~~~~~");
				WebElement eachnews=allnews.get(i);
				
				System.out.println("~~~~~~~~~~~~~~~~~~~Title of News :"+(i+1)+" Before Click~~~~~~~~~~~~~~~");
				String beforeClick=eachnews.getText();
				System.out.println(beforeClick);
				
				eachnews.click();
				//js.executeScript("argument[0].click();",eachnews);
				//Thread.sleep(7000);
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~Title of News :"+(i+1)+" After Click~~~~~~~~~~~~");
				String afterClick=news.titleOfNews();
				System.out.println(afterClick);
				
				
				if(beforeClick.equalsIgnoreCase(afterClick))
				{
					System.out.println("========>>>>Correct: Title Matching After open News Also<<<<<=========");
				}
				else
				{
					System.out.println("=======InCorrect: Title Not Matching After open News Also=============");
				}
				
				
				System.out.println(">>>>>>>Click Back to Home Page<<<<<<<<");
				//Thread.sleep(7000);
				news.clickHomePage();
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("Be.Cognizant - Home"))
				{
					System.out.println("!!!!!Successfully back to Home Page!!!!!!!");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}
		}
		
		
		@Test(priority=5,groups= {"sanity","master"})
		public void appsAndTools() throws InterruptedException, IOException
		{
			
			BeCognizantHome hm= new BeCognizantHome(driver);
			hm.allAppsTools();;
			
		}
	}

	
