package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfile extends BasePage {
	public UserProfile(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='mectrl_accountDetails']//div[@id='mectrl_currentAccount_primary']")
	public static WebElement textUsername;
	
	@FindBy(xpath="//div[@class='mectrl_accountDetails']//div[@id='mectrl_currentAccount_secondary']")
	public static WebElement textUserEmail;

	
public void getUserInformation() {
	try {
		
		System.out.println("Username: " +textUsername.getText() + "Email: " +textUserEmail.getText());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
