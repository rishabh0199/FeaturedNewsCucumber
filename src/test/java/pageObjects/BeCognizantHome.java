package pageObjects;

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


@FindBy(xpath="//strong[text()='Around Cognizant']")
WebElement txtScrollTill;


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

public void clickHomePage()
{
	bclass.ExplicitlyWait(txtURLHomePage);
	txtURLHomePage.click();
}

public void allAppsTools() throws InterruptedException
{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	bclass.ExplicitlyWait(txtScrollTill);
    js.executeScript("arguments[0].scrollIntoView(true);",txtScrollTill);
    
    Thread.sleep(5000);
	
     bclass.ExplicitlyWaitList(listAllAppsTools);
	System.out.println("Total Apps and Tools: "+ listAllAppsTools.size());
	
	Thread.sleep(5000);
	for(int i=0;i<listAllAppsTools.size();i++)
	{
		WebElement apptool= listAllAppsTools.get(i);
		System.out.println(apptool.getText());
	}
}

}
