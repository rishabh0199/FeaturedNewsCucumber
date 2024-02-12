package testCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.BeCognizantHome;
import testBase.BaseClass;
import utilities.WritingData;

public class TC_0002_NewsAndCount extends BaseClass {
	
	
	@Test(priority=2,groups= {"regression","master"})
	public void countNews() throws IOException
	{
		BaseClass.getLogger().info("*****starting TC_0002_NewsAndCount******");
		BeCognizantHome news=new BeCognizantHome(driver);
		news.scrollpage();
		List<WebElement> allnews=news.getAllNews();
		System.out.println("---------------------------------------------------------------------------");
		BaseClass.getLogger().info("*****Printing Total News Count******");
		System.out.println("Total Available News:");
		System.out.println("Total News: "+allnews.size());
		BaseClass.getLogger().info("**********News:************");
		System.out.println();
		System.out.println();
		System.out.println("News Headings:");
		for(WebElement elem:allnews)
		{
			System.out.println(elem.getText());
		}
		WritingData.setNewsList(allnews);//send to excel
		BaseClass.getLogger().info("**********Sucessfully Stored all news to Excel***************");
		System.out.println();
		BaseClass.getLogger().info("*****Finished TC_0002_NewsAndCount******");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}
