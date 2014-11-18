package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;
import pageObjects.Main_Nav_OR;
import utility.Constant;
import utility.ExcelUtils;

public class MainNavCreation_Action {
	
	public static String MainNavigation;
	
	public static void MainNavigationCreate(WebDriver driver) throws Exception{
				
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"MainNavigation");
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		Application_Navigations.crtMainNav_Navigate(driver);
		
		Thread.sleep(20000);
		//if(driver.getTitle().contains("Create MainNavigation"))
		if(driver.getTitle().contains("Navigation"))
        {
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Navigation dialog']")));
		
		MainNavigation = ExcelUtils.getCellData(i, 0);
		Main_Nav_OR.txtbx_MenuLinkTitle(driver).sendKeys(MainNavigation);
		                                      
        String titlePath = ExcelUtils.getCellData(i, 1);
        Main_Nav_OR.txtbx_Path(driver).sendKeys(titlePath);
        
       // Thread.sleep(20000);
        
		Main_Nav_OR.btn_Save(driver).click();
		
		Thread.sleep(20000);
		
		
		if(driver.findElement(By.cssSelector("body")).getText().contains(MainNavigation)){
	           
	          // System.out.println("MainNav "+MainNavigation+" has been created.");
	                     
	                     System.out.println("Your configuration has been saved.");
	           
	           
	        }
	              
	              Thread.sleep(20000);
	              
	              ApplicationLinks.link_CloseWindow(driver).click();
	              
	              Thread.sleep(20000);
	              
	              
	              if(driver.findElement(By.cssSelector("body")).getText().contains(MainNavigation)){
	                     System.out.println(MainNavigation +"link is on this page");
	                     }
	              
	              }
		
//		if(driver.getTitle().contains(MainNavigation))
//	    {
//           System.out.println("MainNav "+MainNavigation+" has been created.");
//           
//           
//        }
		
		//}
		
		else
		{
			driver.quit();
		}
		             
		
		}
		
	}





}
