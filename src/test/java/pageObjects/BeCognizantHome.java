package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BaseClass;
import utilities.WritingData;

public class BeCognizantHome extends BasePage {
	BaseClass bclass= new BaseClass();
	
	public BeCognizantHome(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(id="O365_MainLink_MePhoto")
WebElement btnProfile;


@FindBy(xpath="//span[contains(text(),'be.cognizant')]")
WebElement txtURLHomePage;

@FindAll(@FindBy(xpath="//*[@role='listitem']//div//div//div//div//div//a"))
List<WebElement> listNews;

//@FindAll(@FindBy(xpath="//a[@style=\"-webkit-line-clamp: 3;\"]"))
//List<WebElement> listNews;

@FindBy(xpath="//*[@id='title_text']")
WebElement txtTitleAfterOpenNews;


@FindBy(xpath="//div[@data-automation-id=\"textBox\"]")
WebElement txtNewsContent;

@FindBy(xpath="//strong[text()='Around Cognizant']")
WebElement txtScrollTill;

@FindBy(xpath="//div[@id=\"4f7e87d5-f184-4501-8008-0ee4b0a38fcf\"]")
WebElement txtScrollEach;

@FindBy(xpath="//div[@id='89c5ffca-2ffb-4052-a723-e99c8c9a14ef']//div[@id='QuicklinksItemTitle']")
//@FindBy(xpath="//div[@id=\"89c5ffca-2ffb-4052-a723-e99c8c9a14ef\"]//div[@class=\"css-252\"]")
List<WebElement> listAllAppsTools;


public void clickUserProfile() throws InterruptedException
{
	Thread.sleep(9000);
	bclass.ExplicitlyWait(btnProfile);
	btnProfile.click();
}


public List<WebElement> getAllNews() 
{
	bclass.ExplicitlyWaitList(listNews);
    return listNews;
}


public String titleOfNews()
{
	bclass.ExplicitlyWait(txtTitleAfterOpenNews);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//    wait.until(ExpectedConditions.visibilityOf(txtTitleAfterOpenNews));
	String title= txtTitleAfterOpenNews.getText();
	return title;
}




public String newsContent()
{
	bclass.ExplicitlyWait(txtNewsContent);
	String NewsContent = txtNewsContent.getText();
	return NewsContent;
}

public void clickHomePage()
{
	bclass.ExplicitlyWait(txtURLHomePage);
	txtURLHomePage.click();
}


public List<WebElement> allAppsTools() throws InterruptedException, IOException
{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	bclass.ExplicitlyWait(txtScrollTill);
    js.executeScript("arguments[0].scrollIntoView(true);",txtScrollTill);
    Thread.sleep(5000);
     bclass.ExplicitlyWaitList(listAllAppsTools);
	//System.out.println("Total Apps and Tools: "+ listAllAppsTools.size());
     bclass.screenshot("apssandtools");
	return listAllAppsTools;
}

public void scrollpage()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	bclass.ExplicitlyWait(txtScrollEach);
    js.executeScript("arguments[0].scrollIntoView(true);",txtScrollEach);
}

}
