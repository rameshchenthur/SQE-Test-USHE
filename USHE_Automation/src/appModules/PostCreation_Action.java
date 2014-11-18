package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Post_OR;
import utility.Constant;
import utility.ExcelUtils;

public class PostCreation_Action {
	
	public static String posttitle;
	
	public static void PostCreate(WebDriver driver) throws Exception{
				
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Post");
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		Application_Navigations.crtPost_Navigate(driver);
		
		Thread.sleep(20000);
		if(driver.getTitle().contains("Create Post"))
        {
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Post dialog']")));
		
		posttitle = ExcelUtils.getCellData(i, 0);
		Post_OR.txtbx_Title(driver).sendKeys(posttitle);
		
                                   
          
// Description iFrame starts
       
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
        String titleBody = ExcelUtils.getCellData(i, 1);
        Post_OR.txtbx_Descrption(driver).sendKeys(titleBody);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Post dialog']")));
 
        
        String ModState = ExcelUtils.getCellData(i, 2);
        Select mstate = new Select(Post_OR.list_ModState(driver)); 
        mstate.selectByVisibleText(ModState);
        
        String assignTo = ExcelUtils.getCellData(i, 3);
        Post_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
		String logMsg = ExcelUtils.getCellData(i, 4);
		Post_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
		Post_OR.btn_Save(driver).click();
		
		Thread.sleep(20000);
		
		if(driver.getTitle().contains(posttitle))
	    {
           System.out.println("Post "+posttitle+" has been created.");
           
           
        }
		}
		
		else
		{
			driver.quit();
		}
		             
		
		}
		
	}



}
