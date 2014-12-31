package appModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Promo_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class PromoCreation_Action {
	
	public static String promotitle;
	
	public static void PromoCreate(WebDriver driver) throws Exception{
				
	        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Promo");
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
		
    	          	Application_Navigations.crtPromo_Navigate(driver);
    		        Thread.sleep(9000);

			if(driver.getTitle().contains("Create Promo"))
			{
		
				promotitle = ExcelUtils.getCellData(i, 1);
				Promo_OR.txtbx_pTitle(driver).sendKeys(promotitle);
		
				Promo_OR.btn_Image(driver).click();
				Thread.sleep(9000);
				
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='media-modal-frame ui-dialog-content ui-widget-content']")));
				Thread.sleep(9000);
				
				Promo_OR.btn_browse(driver).click();
				Thread.sleep(3000);
	       
				String imagName = ExcelUtils.getCellData(i, 2);
	       
				CommonFunctions.imgUpload(Constant.images_Path.concat(imagName), Constant.imageUpcode_Path);
 
				Promo_OR.btn_Upload(driver).click();
				Thread.sleep(20000);
 
				Promo_OR.btn_Next(driver).click();
				Thread.sleep(20000);
 
				Promo_OR.btn_Next(driver).click();
				Thread.sleep(10000);
 
				Promo_OR.btn_imagSave(driver).click();
				Thread.sleep(20000);
                             
				driver.switchTo().defaultContent();
       
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
				String promoBody = ExcelUtils.getCellData(i, 3);
				Promo_OR.txtbx_Descrption(driver).sendKeys(promoBody);
        
				driver.switchTo().defaultContent();
     
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
		                CommonFunctions.scrShot(Constant.screenShots_Path, "Prmo");
                       }else{
		           Log.info("Time Out");
			 }
		}		
		
	}

}
