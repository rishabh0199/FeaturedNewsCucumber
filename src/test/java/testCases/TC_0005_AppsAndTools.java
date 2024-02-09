package testCases;

import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0005_AppsAndTools extends BaseClass{
	@Test
	public void appsAndTools() throws InterruptedException
	{
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Total Apps And Tools Available:");
		BeCognizantHome hm= new BeCognizantHome(driver);
		hm.allAppsTools();;
		System.out.println("---------------------------------------------------------------------------");
	}

}
