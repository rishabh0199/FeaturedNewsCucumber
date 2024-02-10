package utilities;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;

import pageObjects.BeCognizantHome;
import testBase.BaseClass;

public class WritingData extends BaseClass{
		BeCognizantHome tt = new BeCognizantHome(driver);
		List<WebElement> NewsToolTip = tt.getAllNews();

		static String path = System.getProperty("user.dir")+ ".\\Excel\\Data.xlsx";
		
		public static void setNewsList(List<WebElement> myList) throws IOException {
			int size = myList.size();
			for(int i = 1; i<=size; i++) {
				ExcelUtilFile.setCellData(path, "Sheet1", i, 1, myList.get(i-1).getText());
			}
	
		}
		
		
		public static void setToolTip(String[] myToolTip) throws IOException
		{
			for(int i=1;i<=5;i++)
			{
				
				ExcelUtilFile.setCellData(path, "sheet1", i, 2, myToolTip[i-1]);
			}
		
		}
		public static void setAppsList(List<WebElement> myAppList) throws IOException {
			int size = myAppList.size();
			for(int i = 1; i<=size; i++) {
				ExcelUtilFile.setCellData(path, "Sheet1", i, 3, myAppList.get(i-1).getText());
			}
	
		}
}
