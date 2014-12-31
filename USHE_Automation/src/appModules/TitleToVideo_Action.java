package appModules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;
import pageObjects.Video_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class TitleToVideo_Action {
	public static void titleToVideo(WebDriver driver) throws Exception
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"SampleTitles");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
		   Application_Navigations.video_Navigation(driver);
		
		   ApplicationLinks.link_Edit(driver).click();
		   Thread.sleep(30000);
	       	
		   jse.executeScript("scroll(0, 1400)");
         
		   String vTitle=ExcelUtils.getCellData(i, 0);
		   
		   Video_OR.txtbx_TitleName(driver).clear();
		   Video_OR.txtbx_TitleName(driver).sendKeys(vTitle);
		   Thread.sleep(5000);
		   
		   CommonFunctions.titleSelect(vTitle);

    	           Thread.sleep(5000);
		   Video_OR.btn_Save(driver).click();
		   Thread.sleep(20000);
	   }
	}
}
