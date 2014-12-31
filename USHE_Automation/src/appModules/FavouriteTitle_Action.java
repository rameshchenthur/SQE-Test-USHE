package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ApplicationLinks;
import pageObjects.Queue_Title_Video_OR;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class FavouriteTitle_Action {
 
	public static String favTitle;
	public static void favTitle(WebDriver driver) throws Exception
	{
		    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"FavTitle");
		    Application_Navigations.navigate_FavTitle(driver);
		    
			for(int i=0;i<=ExcelUtils.getRowCount();i++)
			{
				favTitle=ExcelUtils.getCellData(i, 0);
				driver.findElement(By.id("edit-field-qt-titles-und-"+i+"-target-id")).sendKeys(favTitle);
				Thread.sleep(5000);
		 
				  int Size=driver.findElements(By.xpath("//div[@id='autocomplete']/ul/li/div/div[contains(text(),'"+favTitle+"')]")).size();
				  for(int j=1;j<=Size;j++)
		          {  
		    	      WebElement titleDropDown=driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li["+j+"]/div/div"));
		    	      if(titleDropDown.getText().contains(favTitle))
		    	         {
		    	    	      titleDropDown.click();
		    		          break;
		    	         }
		    	  }
				  Thread.sleep(1000);
				  Queue_Title_Video_OR.btn_titleAddMore(driver).click();
				  Thread.sleep(4000);
		    	   
			}
			
			Queue_Title_Video_OR.btn_SaveQueue(driver).click();
			Thread.sleep(10000);
	
			ApplicationLinks.link_Home(driver).click();
			Thread.sleep(10000);
			
			for(int k=0;k<=ExcelUtils.getRowCount();k++)
			{
				favTitle=ExcelUtils.getCellData(k, 0);
				if(driver.findElement(By.cssSelector("body")).getText().contains(favTitle))
		        {
                  Log.info(favTitle+" present on home page.");
		        }
			}
			
		}

}
