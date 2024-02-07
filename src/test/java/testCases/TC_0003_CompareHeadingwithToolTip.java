package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0003_CompareHeadingwithToolTip extends BaseClass {
	
	@Test
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

}
