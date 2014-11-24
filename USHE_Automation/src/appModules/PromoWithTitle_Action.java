package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Promo_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class PromoWithTitle_Action {
	
public static String promotitle;
	
	public static void PromoTitle(WebDriver driver) throws Exception{
				
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Promo");
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		   Application_Navigations.crtPromo_Navigate(driver);
		
		   Thread.sleep(20000);
		   if(driver.getTitle().contains("Create Promo"))
            {
		
		       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Promo dialog']")));

		       Promo_OR.btn_existingTitle(driver).click();
		       Thread.sleep(5000);
	       
      
		       //code start
		       
		       String owels[]={"a","e","i","o","u"};
				
				for(String element : owels) 
				{
				  Promo_OR.txtbx_existingTitle(driver).clear();
				  Promo_OR.txtbx_existingTitle(driver).sendKeys(element);
				  Thread.sleep(5000);
				  int Size=driver.findElements(By.xpath("//div[@id='autocomplete']/ul/li/div/div[contains(text(),element)]")).size();
				  for(int j=1;j<Size;j++)
		          {  
		    	      WebElement titleDropDown=driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li["+j+"]/div/div"));
		    	         if(titleDropDown.getText().contains(element))
		    	         {
		    	        	 titleDropDown.click();
		    		          break;
		    	         }
		    	  }
				   break;
				}
				Promo_OR.btn_addTitle(driver).click();
				Thread.sleep(4000);
				
			    promotitle=ExcelUtils.getCellData(i, 1);
			    Promo_OR.txtbx_pTitle(driver).sendKeys(promotitle);
	
				//Image upload starts
		
		       Promo_OR.btn_Image(driver).click();
		       Thread.sleep(9000);
        
		       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='media-modal-frame ui-dialog-content ui-widget-content']")));
		       Thread.sleep(9000);
		        
		       Promo_OR.btn_browse(driver).click();
		       
		       Thread.sleep(3000);
		       
		       String imagepath = ExcelUtils.getCellData(i, 2);
     
		       CommonFunctions.imgUpload(Constant.images_Path.concat(imagepath), Constant.imageUpcode_Path);
	     
		       Promo_OR.btn_Upload(driver).click();
		       Thread.sleep(20000);
        
		       Promo_OR.btn_Next(driver).click();
		       Thread.sleep(20000);
        
		       Promo_OR.btn_Next(driver).click();
		       Thread.sleep(10000);
        
		       Promo_OR.btn_imagSave(driver).click();
		       Thread.sleep(20000);
                                    
		       driver.switchTo().defaultContent();
		       
		       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Promo dialog']")));
                 
		       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
		       String titleBody = ExcelUtils.getCellData(i, 3);
		       Promo_OR.txtbx_Descrption(driver).sendKeys(titleBody);
        
		       driver.switchTo().defaultContent();
        
		       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Promo dialog']")));
     
		       String ModState = ExcelUtils.getCellData(i, 4);
		       Select mstate = new Select(Promo_OR.list_ModState(driver)); 
		       mstate.selectByVisibleText(ModState);
        
		       String assignTo = ExcelUtils.getCellData(i, 5);
		       Promo_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
		       String logMsg = ExcelUtils.getCellData(i, 6);
		       Promo_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
		       Promo_OR.btn_Save(driver).click();
		
		       Thread.sleep(20000);
		
		       if(driver.getTitle().contains(promotitle))
		       	{
		    	   Log.info("Promo "+promotitle+" has been created.");
    	       	}
		       CommonFunctions.scrShot(Constant.screenShots_Path, "PrmowithTitle");
            }
		   else
		   {
			   Log.info("Time Out");
		   }
		}
		
	}

}
