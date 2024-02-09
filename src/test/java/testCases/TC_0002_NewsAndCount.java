package testCases;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0002_NewsAndCount extends BaseClass {
	
	@Test(priority=2,groups= {"regression","master"})
	public void countNews()
	{
		BaseClass.getLogger().info("*****starting TC_0002_NewsAndCount******");
		BeCognizantHome news=new BeCognizantHome(driver);
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
		System.out.println();
		BaseClass.getLogger().info("*****Finished TC_0002_NewsAndCount******");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}
