package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeCognizantHome extends BasePage {
	
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

@FindBy(xpath="//span[contains(text(),'Announcements')]")
WebElement txtAnnouncements;

@FindBy(xpath="//div[contains(text(),'GenAI training & more: visit the GenAI Hub')]")
WebElement txtGenAI;

@FindAll(@FindBy(xpath="//div[@id='89c5ffca-2ffb-4052-a723-e99c8c9a14ef']//div[@id='QuicklinksItemTitle']"))
//@FindBy(xpath="//div[@id=\"89c5ffca-2ffb-4052-a723-e99c8c9a14ef\"]//div[@class=\"css-252\"]")
List<WebElement> listAllAppsTools;


public void clickUserProfile() throws InterruptedException
{
	Thread.sleep(9000);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
	btnProfile.click();
}


public List<WebElement> getAllNews() 
{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOfAllElements(listNews));
    return listNews;
}

public String titleOfNews()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOf(txtTitleAfterOpenNews));
	String title= txtTitleAfterOpenNews.getText();
	return title;
}

public void clickHomePage()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.elementToBeClickable(txtURLHomePage));
	txtURLHomePage.click();
}

public void allAppsTools() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait1.until(ExpectedConditions.visibilityOfAllElements(txtAnnouncements));
    
    js.executeScript("arguments[0].scrollIntoView(true);", txtAnnouncements);
    
    
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait2.until(ExpectedConditions.visibilityOfAllElements(txtGenAI));
    
    js.executeScript("arguments[0].scrollIntoView(true);", txtGenAI);

    
    Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOfAllElements(listAllAppsTools));
    Thread.sleep(5000);
	System.out.println("Total Apps and Tools: "+ listAllAppsTools.size());
	//TotalAppsAndTools=listAllAppsTools.size();
	Thread.sleep(5000);
	for(int i=0;i<listAllAppsTools.size();i++)
	{
		WebElement apptool= listAllAppsTools.get(i);
		System.out.println(apptool);
	}
}

}
