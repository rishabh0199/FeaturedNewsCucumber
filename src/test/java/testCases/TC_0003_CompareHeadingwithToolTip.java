package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0003_CompareHeadingwithToolTip extends BaseClass {
	
	@Test
	public void cmpTooltip(){
		BaseClass.getLogger().info("**********Starting TC_0003_CompareHeadingwithToolTip***************");
		System.out.println("---------------------------------------------------------------------------");
	System.out.println("Comparing with Tool Tip:");
	
	BeCognizantHome tt = new BeCognizantHome(driver);
	List<WebElement> allNews = tt.getAllNews(); 
	BaseClass.getLogger().info("************");
	for(WebElement elem:allNews)
	{
		String news = elem.getText();
		System.out.println("News: " + news);
		String toolTip = elem.getAttribute("title");
		System.out.println("ToolTip: " + toolTip);
		if(news.equalsIgnoreCase(toolTip))
		{
			System.out.println("News matching with Tool Tip:");
			System.out.println();
			System.out.println();
		}
		else
		{
			System.out.println("News not matching with Tool Tip:");
		}
	}
	BaseClass.getLogger().info("**********Finished TC_0003_CompareHeadingwithToolTip***************");
	System.out.println("---------------------------------------------------------------------------");
	System.out.println();
	System.out.println();
	}

}
