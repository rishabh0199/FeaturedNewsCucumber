package testCases;

import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0005_AppsAndTools extends BaseClass{
	@Test
	public void appsAndTools() throws InterruptedException
	{
		
		BeCognizantHome hm= new BeCognizantHome(driver);
		hm.allAppsTools();;
		
	}

}
