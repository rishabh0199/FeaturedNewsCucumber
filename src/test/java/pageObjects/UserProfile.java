package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;
import utilities.ExcelUtilFile;

public class UserProfile extends BasePage {
	static String path = System.getProperty("user.dir")+ ".\\Excel\\Data.xlsx";
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
		ExcelUtilFile.setCellData(path, "Sheet1", 1, 0, textUsername.getText());//send to excel
		ExcelUtilFile.setCellData(path, "Sheet1", 2, 0, textUserEmail.getText());//send to excel
		BaseClass.getLogger().info("**********Sucessfully Stored user details to to Excel***************");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
