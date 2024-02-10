package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;
import utilities.WritingData;

public class TC_0005_AppsAndTools extends BaseClass{
	@Test
	public void appsAndTools() throws InterruptedException, IOException
	{
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Total Apps And Tools Available:");
		BeCognizantHome hm= new BeCognizantHome(driver);
		List<WebElement> allAppsTool=hm.allAppsTools();
		System.out.println("Total Apps and Tools: "+ allAppsTool.size());
		System.out.println();
		for(int i=0;i<allAppsTool.size();i++)
		{
			WebElement apptool= allAppsTool.get(i);
			System.out.println(apptool.getText());
		}
		WritingData.setAppsList(allAppsTool);//send to excel
		System.out.println("---------------------------------------------------------------------------");
	}

}
