package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Title_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class TitleCreation_Action {

	public static void TitleCreate(WebDriver driver) throws Exception{
				
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Title");
		
	for(int i=1;i<=ExcelUtils.getRowCount();i++)
	{
	
	Application_Navigations.crtTitle_Navigate(driver);
	Thread.sleep(10000);
	if(driver.getTitle().contains("Create Title"))
        {
				
	String title = ExcelUtils.getCellData(i, 0);
        Title_OR.txtbx_Title(driver).sendKeys(title);
		
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
        
        String titleBody = ExcelUtils.getCellData(i, 1);
        Title_OR.txtbx_Descrption(driver).sendKeys(titleBody);
        
        driver.switchTo().defaultContent();
                     
        String Type = ExcelUtils.getCellData(i, 2);
        Select type = new Select(Title_OR.list_Type(driver));
        type.selectByVisibleText(Type);
       
        Select tGenere = new Select(Title_OR.list_Genere(driver));
        tGenere.selectByIndex(1);
               
        Select tRating = new Select(Title_OR.list_Rating(driver));
        tRating.selectByIndex(1);
        
        Thread.sleep(1000);
        
        Title_OR.link_Foramts(driver).click();
         
        String PurFormat = ExcelUtils.getCellData(i, 3);
        Select pformat = new Select(Title_OR.list_PurFormat(driver)); 
        pformat.selectByVisibleText(PurFormat); 

        String ReeFormat = ExcelUtils.getCellData(i, 4);
        Select rformat = new Select(Title_OR.list_ReedFormat(driver)); 
        rformat.selectByVisibleText(ReeFormat);
        
        String link = ExcelUtils.getCellData(i, 5);
	Title_OR.txtbx_Link(driver).sendKeys(link);
	Thread.sleep(1000);
	Title_OR.link_People(driver).click();
	
	Select tpeople = new Select(Title_OR.list_Person(driver)); 
        tpeople.selectByIndex(1);
        
        String position = ExcelUtils.getCellData(i, 11);
        Select tposition = new Select(Title_OR.list_Position(driver)); 
        tposition.selectByVisibleText(position);
        
        String role = ExcelUtils.getCellData(i, 12);
	Title_OR.txtbx_Role(driver).sendKeys(role);
		
	Title_OR.link_PubOption(driver).click();
                        
        String ModState = ExcelUtils.getCellData(i, 13);
        Select mstate = new Select(Title_OR.list_ModState(driver)); 
        mstate.selectByVisibleText(ModState);
        
        String assignTo = ExcelUtils.getCellData(i, 14);
	Title_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
	String logMsg = ExcelUtils.getCellData(i, 15);
	Title_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
	Title_OR.btn_Save(driver).click();
	Thread.sleep(20000);
		
	if(driver.getTitle().contains(title))
	     {
		   Log.info("Title "+title+" has been created.");
                   CommonFunctions.scrShot(Constant.screenShots_Path, "Title");
              }
	}else{
			Log.info("Time Out");
	     }
		             
		
	}
		
	}

}
