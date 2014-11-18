package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.ApplicationLinks;
import pageObjects.Title_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class TitleWithStreetDate_Action {
	
public static void TitleWithStreetDate(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Title");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
			
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		Application_Navigations.crtTitle_Navigate(driver);
		
		Thread.sleep(10000);
		if(driver.getTitle().contains("Create Title"))
        {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Title dialog']")));
		
		String title = ExcelUtils.getCellData(i, 0);
		Title_OR.txtbx_Title(driver).sendKeys(title);
	        
        String Type = ExcelUtils.getCellData(i, 2);
        Select type = new Select(Title_OR.list_Type(driver));
        type.selectByVisibleText(Type);
 
        jse.executeScript("scroll(1000, 0)");
        
        Title_OR.link_Foramts(driver).click();
         
        String PurFormat = ExcelUtils.getCellData(i, 3);
        Select pformat = new Select(Title_OR.list_PurFormat(driver)); 
        pformat.selectByVisibleText(PurFormat); 
        
        Title_OR.txtbx_streetDate(driver).click();
         
        String streetmonth=ExcelUtils.getCellData(i, 7);
        Select streetMonth=new Select(ApplicationLinks.list_Month(driver));
        streetMonth.selectByVisibleText(streetmonth);
        
        String streetyear=ExcelUtils.getCellData(i, 6);
        Select streetYear=new Select(ApplicationLinks.list_Year(driver));
        streetYear.selectByVisibleText(streetyear);
              
        String streetdate=ExcelUtils.getCellData(i, 8);
        CommonFunctions.dateTime(streetdate.toString());
               
        jse.executeScript("scroll(1000, 0)");
                
        Title_OR.link_PubOption(driver).click();
        
        String ModState = ExcelUtils.getCellData(i, 15);
        Select mstate = new Select(Title_OR.list_ModState(driver)); 
        mstate.selectByVisibleText(ModState);
        
        String assignTo = ExcelUtils.getCellData(i, 16);
      	Title_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
		String logMsg = ExcelUtils.getCellData(i, 17);
		Title_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
		Title_OR.btn_Save(driver).click();
		
		Thread.sleep(20000);
		
		if(driver.getTitle().contains(title))
	      {
           System.out.println("Title "+title+" has been created.");
          }
		
		CommonFunctions.scrShot(Constant.screenShots_Path, "titlewithstreetdate");
		
		ApplicationLinks.link_Home(driver);
		Thread.sleep(10000);
		
		if(driver.findElement(By.cssSelector("body")).getText().contains(title))
		  {
              System.out.println(title +"link is on this page");
          }else{
        	  
        	  System.out.println(title +"link is not present on this page");
          }
     
         }
    
        }
	  }
    }


