package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;
import utilities.WritingData;

public class TC_0003_CompareHeadingwithToolTip extends BaseClass {
	
	public String[] toolTips = new String[5];//for send tooltip to excel
	@Test
	public void cmpTooltip() throws IOException{
		BaseClass.getLogger().info("**********Starting TC_0003_CompareHeadingwithToolTip***************");
		System.out.println("---------------------------------------------------------------------------");
	System.out.println("Comparing with Tool Tip:");
	
	BeCognizantHome tt = new BeCognizantHome(driver);
	tt.scrollpage();
	List<WebElement> allNews = tt.getAllNews(); 
	BaseClass.getLogger().info("************printing news and comparing with tool tip checking weather its match with tool tip********");
	int i = 0;
	for(WebElement elem:allNews)
	{
	
		String news = elem.getText();
		System.out.println("News: " + news);
		String toolTip = elem.getAttribute("title");
		toolTips[i] = toolTip;//for send tooltip to excel
		i++;//for send tooltip to excel
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
	WritingData.setToolTip(toolTips);//send tooltip to excel
	BaseClass.getLogger().info("**********Sucessfully Stored tool tip to Excel***************");

	BaseClass.getLogger().info("**********Finished TC_0003_CompareHeadingwithToolTip***************");
	System.out.println("---------------------------------------------------------------------------");
	System.out.println();
	System.out.println();
	}

}
