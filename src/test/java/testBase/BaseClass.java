package testBase;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	static public  WebDriver driver;
	//public Logger logger;//pre defined class come from Log4j2 dependency 
	
	public Properties p;//to import properties file
	
	@BeforeClass(groups= {"sanity","regression","master"})
	@Parameters({"browser"})
	public void driverSetup(String br) throws IOException
	{
		
		
		//loading properties file
		FileReader file = new FileReader(".//src/test/resources/config.properties");//class
		p=new Properties();//creating obj of Properties
		p.load(file);//load properties file
		
		
		//Loading Log4j2 file
			//logger=LogManager.getLogger(this.getClass());//this.getClass will get current test class name running use logj4
			
			//launch based on condition
			switch(br.toLowerCase())
			{
			case "chrome":driver = new ChromeDriver();break;
			case "edge":driver = new EdgeDriver();break;
			default:System.out.println("not matching browser");
			return;
			}

			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("appURL"));
			driver.manage().window().maximize();
}
	@AfterClass(groups= {"sanity","regression","master"})
	public void tearDown()
	{
		driver.quit();
	}
	
	public String captureScreen(String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath= System.getProperty("user.dir")+"\\screenshots\\" + tname +"_" + timeStamp + ".png";
		File targetFile= new File(targetFilePath);
	//	FileUtils.copyFile(sourceFile, targetFilePath);
		sourceFile.renameTo(targetFile);//copy source file to target file
		
		return targetFilePath;
	}
	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	


}
