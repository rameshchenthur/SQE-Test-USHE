package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Post_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class PostCreation_Action {
	
	public static String posttitle;
	
	public static void PostCreate(WebDriver driver) throws Exception{
				
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Post");
		
	for(int i=1;i<=ExcelUtils.getRowCount();i++)
	{
			
	Application_Navigations.crtPost_Navigate(driver);
	Thread.sleep(10000);
	if(driver.getTitle().contains("Create Post"))
        {
	    posttitle = ExcelUtils.getCellData(i, 0);
	    Post_OR.txtbx_Title(driver).sendKeys(posttitle);
      
             driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
             String titleBody = ExcelUtils.getCellData(i, 1);
             Post_OR.txtbx_Descrption(driver).sendKeys(titleBody);
        
             driver.switchTo().defaultContent();
        
             String ModState = ExcelUtils.getCellData(i, 2);
             Select mstate = new Select(Post_OR.list_ModState(driver)); 
             mstate.selectByVisibleText(ModState);
        
             String assignTo = ExcelUtils.getCellData(i, 3);
             Post_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
             String logMsg = ExcelUtils.getCellData(i, 4);
             Post_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
             Post_OR.btn_Save(driver).click();
		
             Thread.sleep(10000);
		
             if(driver.getTitle().contains(posttitle))
             	{
            	    Log.info("Post "+posttitle+" has been created.");
            	 	CommonFunctions.scrShot(Constant.screenShots_Path, "Post");
             	}
           }else{	  {
			Log.info("Time out");
		  }
		}
		
	}
}
