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
		BaseClass.getLogger().info("**********Starting Tc_0005_ClickEachNewsAndPrint***************");
		System.out.println("Total Apps And Tools Available:");
		BaseClass.getLogger().info("**********Click back to home page***************");
		BeCognizantHome hm= new BeCognizantHome(driver);
		List<WebElement> allAppsTool=hm.allAppsTools();
		System.out.println("Total Apps and Tools: "+ allAppsTool.size());
		System.out.println();
		for(int i=0;i<allAppsTool.size();i++)
		{
			WebElement apptool= allAppsTool.get(i);
			System.out.println(apptool.getText());
		}
		BaseClass.getLogger().info("**********Sucessfully printed all Apps and Tools***************");
		WritingData.setAppsList(allAppsTool);//send to excel
		BaseClass.getLogger().info("**********Sucessfully Stored Apps and tools to Excel***************");
		BaseClass.getLogger().info("**********End Tc_0005_ClickEachNewsAndPrint***************");
		System.out.println("---------------------------------------------------------------------------");
	}

}
