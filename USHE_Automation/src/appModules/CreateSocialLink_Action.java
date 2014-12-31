package appModules;

import mainFlows.USHE_RegMain;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;
import pageObjects.Social_Link_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class CreateSocialLink_Action {
	
	public static String socialTitle;
	public static String socialLink;
	
	public static void socialCreation(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Social");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
			Application_Navigations.crtSocail_Navigate(driver);
			Thread.sleep(20000);
			
			if(driver.getTitle().contains("Social")){
	
				socialTitle=ExcelUtils.getCellData(i, 0);
				Social_Link_OR.txtbx_menuLinkTitle(driver).sendKeys(socialTitle);
				
				socialLink=ExcelUtils.getCellData(i, 1);
				Social_Link_OR.txtbx_path(driver).sendKeys(socialLink);
    
				jse.executeScript("scroll(0, 700)");
				if(!Social_Link_OR.chkBox_imagIcon(driver).isSelected())
				{
				     Social_Link_OR.chkBox_imagIcon(driver).click();
				     Thread.sleep(1000);
				}
				
				Social_Link_OR.btn_browse(driver).click();
				Thread.sleep(3000);
								
				String imagName=ExcelUtils.getCellData(i, 2);
			     
			    CommonFunctions.imgUpload(Constant.images_Path.concat(imagName), Constant.imageUpcode_Path);
			    
			    Social_Link_OR.btn_Save(driver).click();
			    Thread.sleep(10000);
			    
			    if(driver.findElement(By.cssSelector("body")).getText().contains(socialTitle))
		        {
		                    
		             Log.info("Your configuration has been saved.");
		             CommonFunctions.scrShot(Constant.screenShots_Path, "Social");
	   	        }
			    
			    ApplicationLinks.link_Home(driver).click();
			    Thread.sleep(10000);
			    
			    if(driver.findElement(By.cssSelector("body")).getText().contains(socialTitle) & driver.getTitle().equals("Site-Install"))
		        {
		            System.out.println(socialTitle+" present in the home page");
		            
		            driver.findElement(By.linkText(socialTitle)).click();
		            Thread.sleep(10000);
		            
		            if(USHE_RegMain.driver.getCurrentUrl().contains(socialLink)){
		            	
		            	System.out.println("url verified");
		            	USHE_RegMain.driver.navigate().back();
		            	Thread.sleep(10000);
		            }
	   	        }
			}
			
		}
		
	}

}
