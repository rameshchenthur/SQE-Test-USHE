package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.Queue_Title_Video_OR;
import utility.Constant;
import utility.ExcelUtils;

public class RecentVideoTitles_Action {
	public static String videoTitle;
	
	public static void recVideoTitle(WebDriver driver) throws Exception
	{
		    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"VideoTitle");
		    Application_Navigations.navigate_RecVideo(driver);
		    
			for(int i=0;i<=ExcelUtils.getRowCount();i++)
			{
				videoTitle=ExcelUtils.getCellData(i, 0);
				driver.findElement(By.id("edit-field-qt-videos-und-"+i+"-target-id")).sendKeys(videoTitle);
				Thread.sleep(5000);
		 
				  int Size=driver.findElements(By.xpath("//div[@id='autocomplete']/ul/li/div/div[contains(text(),'"+videoTitle+"')]")).size();
				  for(int j=1;j<=Size;j++)
		          {  
		    	      WebElement titleDropDown=driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li["+j+"]/div/div"));
		    	      if(titleDropDown.getText().contains(videoTitle))
		    	         {
		    	    	      titleDropDown.click();
		    		          break;
		    	         }
		    	  }
				  Thread.sleep(1000);
				  Queue_Title_Video_OR.btn_videoAddMore(driver).click();
				  Thread.sleep(4000);
		    	   
			}
			
			      Queue_Title_Video_OR.btn_SaveQueue(driver).click();
			      Thread.sleep(10000);
			
	}

}
