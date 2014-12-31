package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Log;
import pageObjects.ApplicationLinks;
import pageObjects.Person_OR;
import pageObjects.Title_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class PersonCreation_Action {
	
	public static String per_Title;
	public static void PersonCreate(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Person");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			Application_Navigations.crtPerson_Navigate(driver);
			
			Thread.sleep(10000);
					
			if(driver.getTitle().contains("Create Person"))
			{							
			        per_Title = ExcelUtils.getCellData(i, 0);
				Person_OR.txtbx_PerTitle(driver).sendKeys(per_Title);
				
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
				
				String desc = ExcelUtils.getCellData(i, 1);
				Person_OR.txtbx_PerDesc(driver).sendKeys(desc);
				
				driver.switchTo().defaultContent();
										
				jse.executeScript("scroll(0, 500)");
				
				Person_OR.btn_PerImage(driver).click();
				
				Thread.sleep(20000);
							
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='media-modal-frame ui-dialog-content ui-widget-content']")));
				                                                                         
				ApplicationLinks.link_Addfile(driver).click();
		                Thread.sleep(2000);
		        
		                String imagName=ExcelUtils.getCellData(i, 2);
		      
		                CommonFunctions.imgUpload(Constant.images_Path.concat(imagName), Constant.imageUpcode_Path);
		        
		                ApplicationLinks.link_StartUpload(driver).click();
		                Thread.sleep(9000);
		        
		                Title_OR.btn_Next(driver).click();
		                Thread.sleep(10000);
		        
		                driver.switchTo().defaultContent();
		       			
				String modstat= ExcelUtils.getCellData(i, 3);
				Select ModStatus=new Select(Person_OR.list_ModStat(driver));
	     		        ModStatus.selectByVisibleText(modstat);
	     		
	     		        String assignto = ExcelUtils.getCellData(i, 4);
	     		        Person_OR.txtbx_AssingTo(driver).clear();
	     		        Person_OR.txtbx_AssingTo(driver).sendKeys(assignto);
				
				String logmsg = ExcelUtils.getCellData(i, 5);
				Person_OR.txtbx_Logmsg(driver).sendKeys(logmsg);
				
				Person_OR.btn_Save(driver).click();
				
				Thread.sleep(10000);
							
				if(driver.getTitle().contains(per_Title))
			         {
		                     Log.info("Person "+per_Title+" has been created.");
		                     CommonFunctions.scrShot(Constant.screenShots_Path, "Person"); 
		                 }
								
			}else{
			      Log.info("Time out");
			     }
		}
		
	}

}


