package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;
import pageObjects.Sec_Nav_OR;
import utility.Constant;
import utility.ExcelUtils;

public class SecNavCreation_Action {
	
	public static String SecondaryNavigation;
	
	public static void SecNavigationCreate(WebDriver driver) throws Exception{
				
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"SecNavigation");
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		Application_Navigations.crtSecNav_Navigate(driver);
		
		Thread.sleep(20000);
		if(driver.getTitle().contains("Navigation"))
        {
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Secondary Navigation dialog']")));
		
		SecondaryNavigation = ExcelUtils.getCellData(i, 0);
		Sec_Nav_OR.txtbx_MenuLinkTitle(driver).sendKeys(SecondaryNavigation);
		                                      
        String titlePath = ExcelUtils.getCellData(i, 1);
        Sec_Nav_OR.txtbx_Path(driver).sendKeys(titlePath);
        
        //Thread.sleep(20000);
        
        Sec_Nav_OR.btn_Save(driver).click();
		
		Thread.sleep(20000);
		
		if(driver.findElement(By.cssSelector("body")).getText().contains(SecondaryNavigation))
        {
                    
                  System.out.println("Your configuration has been saved.");
   
       }
           
           ApplicationLinks.link_CloseWindow(driver).click();
           
           }

		
		
		else
		{
			driver.quit();
		}
		             
		
		}
		
	}







}
