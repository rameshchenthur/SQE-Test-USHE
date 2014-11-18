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
import utility.Log;

public class TitleRegression_Action {
	
	public static String Title;
	
	public static void TitleCreate(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Title");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
		  Application_Navigations.crtTitle_Navigate(driver);
		
		Thread.sleep(10000);
		if(driver.getTitle().contains("Create Title"))
        {
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Title dialog']")));
		
		Title = ExcelUtils.getCellData(i, 0);
		Title_OR.txtbx_Title(driver).sendKeys(Title);
		
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
        String titleBody = ExcelUtils.getCellData(i, 1);
        Title_OR.txtbx_Descrption(driver).sendKeys(titleBody);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Title dialog']")));
        
        Title_OR.btn_AddingImage(driver).click();
        Thread.sleep(5000);
        
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
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Create Title dialog']")));
       
        String Type = ExcelUtils.getCellData(i, 3);
        Select type = new Select(Title_OR.list_Type(driver));
        type.selectByVisibleText(Type);
       
        Title_OR.checkBox_Genere(driver).click();
                       
        Select tRating = new Select(Title_OR.list_Rating(driver));
        tRating.selectByIndex(1);
       
        jse.executeScript("scroll(1000, 0)");
                       
        Title_OR.link_Foramts(driver).click();
         
        String PurFormat = ExcelUtils.getCellData(i, 4);
        Select pformat = new Select(Title_OR.list_PurFormat(driver)); 
        pformat.selectByVisibleText(PurFormat); 
        
        jse.executeScript("scroll(0, 250)");
        
        CommonFunctions.selRetailer(RetailerCreation_Action.retailerTitle);
        
        Title_OR.txtbx_streetDate(driver).click();
        
        String streetyear=ExcelUtils.getCellData(i, 5);
        Select streetYear=new Select(ApplicationLinks.list_Year(driver));
        streetYear.selectByVisibleText(streetyear);
        
        String streetmonth=ExcelUtils.getCellData(i, 6);
        Select streetMonth=new Select(ApplicationLinks.list_Month(driver));
        streetMonth.selectByVisibleText(streetmonth);
           
        String streetdate=ExcelUtils.getCellData(i, 7);
        CommonFunctions.dateTime(streetdate.toString());
        
        Title_OR.txtbx_solicitataionDate(driver).click();
        
        String solicitationyear=ExcelUtils.getCellData(i, 8);
        Select solicitationYear=new Select(ApplicationLinks.list_Year(driver));
        solicitationYear.selectByVisibleText(solicitationyear);
        
        String solicitationmonth=ExcelUtils.getCellData(i, 9);
        Select soliciMonth=new Select(ApplicationLinks.list_Month(driver));
        soliciMonth.selectByVisibleText(solicitationmonth);
  
        String solicitationdate=ExcelUtils.getCellData(i, 10);
        CommonFunctions.dateTime(solicitationdate.toString());
    
        String bonusInfo=ExcelUtils.getCellData(i, 11);
        Title_OR.txtbx_bonusFeature(driver).sendKeys(bonusInfo);
        
        String techType = ExcelUtils.getCellData(i, 12);
        Select tType = new Select(Title_OR.list_TechType(driver)); 
        tType.selectByVisibleText(techType);
        
        String techInfo=ExcelUtils.getCellData(i, 13);
        Title_OR.txtbx_techInfo(driver).sendKeys(techInfo);
 
        String ReeFormat = ExcelUtils.getCellData(i, 14);
        Select rformat = new Select(Title_OR.list_ReedFormat(driver)); 
        rformat.selectByVisibleText(ReeFormat);
        
        String link = ExcelUtils.getCellData(i, 15);
		Title_OR.txtbx_Link(driver).sendKeys(link);
		
		jse.executeScript("scroll(1000, 0)");
		
		Title_OR.link_People(driver).click();
		
        Select tpeople = new Select(Title_OR.list_Person(driver)); 
        tpeople.selectByVisibleText(PersonCreation_Action.per_Title);
        
        String position=ExcelUtils.getCellData(i, 16);
        Select tposition = new Select(Title_OR.list_Position(driver)); 
        tposition.selectByVisibleText(position);
        
        String role = ExcelUtils.getCellData(i, 17);
		Title_OR.txtbx_Role(driver).sendKeys(role);
 
		Title_OR.link_PubOption(driver).click();
                        
        String ModState = ExcelUtils.getCellData(i, 18);
        Select mstate = new Select(Title_OR.list_ModState(driver)); 
        mstate.selectByVisibleText(ModState);
        
        String assignTo = ExcelUtils.getCellData(i, 19);
		Title_OR.txtbx_AssignTo(driver).sendKeys(assignTo);
		
		String logMsg = ExcelUtils.getCellData(i, 20);
		Title_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
		Title_OR.btn_Save(driver).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(20000);
		
		if(driver.getTitle().contains(Title))
	     {
           Log.info("Title "+Title+" has been created.");
           CommonFunctions.scrShot(Constant.screenShots_Path, "TitleRegression");       
           
         }
		}
		
		else
		{
			Log.info("Time out");
		}
		             
		
	 }
		
  }

}
