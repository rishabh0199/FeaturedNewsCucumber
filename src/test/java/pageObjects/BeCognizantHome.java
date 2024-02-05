package pageObjects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

@FindAll(@FindBy(xpath="//*[@role='listitem']/div/div/div/div/div/a"))
List<WebElement> listNews;



public void clickUserProfile()
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
	btnProfile.click();
}


public List<WebElement> getAllNews() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfAllElements(listNews));
    return listNews;
}




public void clickHomePage()
{
	txtURLHomePage.click();
}

}
