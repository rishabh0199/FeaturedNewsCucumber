package testCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class TC_0004_ClickEachNewsAndPrint extends BaseClass {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	@Test
	public void clickEachNews() throws InterruptedException, IOException {
		BaseClass.getLogger().info("**********Starting TC_0004_ClickEachNewsAndPrint***************");
		System.out.println("---------------------------------------------------------------------------");
		BaseClass.getLogger().info("**********Clicking and storing in text***************");
		System.out.println("Clicking each news and Verifying it:");
		System.out.println();
		System.out.println();
		BeCognizantHome news = new BeCognizantHome(driver);
		news.scrollpage();
		List<WebElement> allnews=news.getAllNews();
		for(int i=0;i<allnews.size();i++)
		{
			System.out.println("opening news:"+(i+1)+"");
			WebElement eachnews=allnews.get(i);
			
			System.out.println("Title of News :"+(i+1)+" Before Click:");
			BaseClass.getLogger().info("**********Printed title beofore click***************");
			String beforeClick=eachnews.getText();
			System.out.println(beforeClick);
			
			eachnews.click();
			//js.executeScript("argument[0].click();",eachnews);
			//Thread.sleep(7000);
			System.out.println();
			System.out.println();
			System.out.println("Title of News :"+(i+1)+" After Click:");
			BaseClass.getLogger().info("**********Printed title after click opend the news***************");
			String afterClick=news.titleOfNews();
			System.out.println(afterClick);
			
			BaseClass.getLogger().info("**********Matching if after and before click title matches***************");
			if(beforeClick.equalsIgnoreCase(afterClick))
			{
				System.out.println("Correct: Title Matching After open News Also:");
			}
			else
			{
				System.out.println("InCorrect: Title Not Matching After open News Also:");
			}
			System.out.println();
			System.out.println();
			System.out.println("News Content of :"+(i+1)+"th News:");
			captureAndStoreNewsContent("News"+(i+1));
			System.out.println();
			System.out.println();
			
			System.out.println("News Successfully written in text file inside testData Folder:");
			BaseClass.getLogger().info("**********Successfully stored news to text file***************");
			
			System.out.println();
			System.out.println();
			BaseClass.getLogger().info("**********Click back to home page***************");
			System.out.println("Click Back to Home Page........");
			//Thread.sleep(7000);
			news.clickHomePage();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("Be.Cognizant - Home"))
			{
				System.out.println("!!!!!Successfully back to Home Page!!!!!!!");
				BaseClass.getLogger().info("**********Successfully back to home**************");
			}
			news.scrollpage();
			System.out.println("---------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			
		}
	}
	
	public void captureAndStoreNewsContent(String newsName) throws IOException
	{
		BeCognizantHome news =new BeCognizantHome(driver);
		String txtNewsContents = news.newsContent();
		System.out.println(txtNewsContents);
		String filename= "NewsText\\" + newsName +".txt";
		BaseClass.writeToFile(filename, txtNewsContents);
		
	}

}
