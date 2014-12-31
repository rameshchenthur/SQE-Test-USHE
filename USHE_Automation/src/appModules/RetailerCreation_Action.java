package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Log;
import pageObjects.Retailer_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class RetailerCreation_Action {
	
  public static String retailerTitle;
	
  public static void RetailerCreate(WebDriver driver) throws Exception{
	
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Retailer");
			
	for(int i=1;i<=ExcelUtils.getRowCount();i++)
	{
			 
	     Application_Navigations.crtRetailer_Navigate(driver);
	     Thread.sleep(10000);
		
	     if(driver.getTitle().contains("Create Retailer"))
	     {
	    	 retailerTitle = ExcelUtils.getCellData(i, 0);
	    	 Retailer_OR.txtbx_Title(driver).sendKeys(retailerTitle);
		
	    	 String FormatOption = ExcelUtils.getCellData(i, 1);
	    	 Select foption = new Select(Retailer_OR.list_FormatOption(driver)); 
	    	 foption.selectByVisibleText(FormatOption);
        
	    	 String searUrl = ExcelUtils.getCellData(i, 2);
	    	 Retailer_OR.txtbx_SearUrl(driver).sendKeys(searUrl);
				
	    	 Retailer_OR.link_PubOption(driver).click();
				 
	    	 String ModState = ExcelUtils.getCellData(i, 3);
	    	 Select pstate = new Select(Retailer_OR.list_ModState(driver)); 
	    	 pstate.selectByVisibleText(ModState);
        	
	    	 String assignTo = ExcelUtils.getCellData(i, 4);
	    	 Retailer_OR.txtbx_AssignTo(driver).clear();
	    	 Retailer_OR.txtbx_AssignTo(driver).sendKeys(assignTo);
		
	    	 String logMsg = ExcelUtils.getCellData(i, 5);
	    	 Retailer_OR.txtbx_Logmess(driver).sendKeys(logMsg);
		
	    	 Retailer_OR.btn_Save(driver).click();
		
	    	 Thread.sleep(10000);
		
		  if(driver.getTitle().contains(retailerTitle))
		  	{
			  	Log.info("Retailer "+retailerTitle+" has been created.");
           
			  	CommonFunctions.scrShot(Constant.screenShots_Path, "Retailer");
		  	}
	    }
	}
		
  }

}
