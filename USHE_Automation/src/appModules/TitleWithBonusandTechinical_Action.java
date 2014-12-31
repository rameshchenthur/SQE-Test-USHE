package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Title_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class TitleWithBonusandTechinical_Action {
	
	public static void TitlewithBonusTechincalinfo(WebDriver driver) throws Exception{
		
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Title");
		
	for(int i=1;i<=ExcelUtils.getRowCount();i++)
	{
			
	Application_Navigations.crtTitle_Navigate(driver);
	Thread.sleep(10000);
	if(driver.getTitle().contains("Create Title"))
        {
	String title = ExcelUtils.getCellData(i, 0);
	Title_OR.txtbx_Title(driver).sendKeys(title);
	        
        String Type = ExcelUtils.getCellData(i, 2);
        Select type = new Select(Title_OR.list_Type(driver));
        type.selectByVisibleText(Type);
                    
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(1000, 0)");
        
        Title_OR.link_Foramts(driver).click();
         
        String PurFormat = ExcelUtils.getCellData(i, 3);
        Select pformat = new Select(Title_OR.list_PurFormat(driver)); 
        pformat.selectByVisibleText(PurFormat); 
        
        jse.executeScript("scroll(0, 250)");
        
        CommonFunctions.selRetailer(RetailerCreation_Action.retailerTitle);
  
       
        String bonusInfo=ExcelUtils.getCellData(i, 16);
        Title_OR.txtbx_bonusFeature(driver).sendKeys(bonusInfo);
        
        String techType = ExcelUtils.getCellData(i, 17);
        Select tType = new Select(Title_OR.list_TechType(driver)); 
        tType.selectByVisibleText(techType);
        
        String techInfo=ExcelUtils.getCellData(i, 18);
        Title_OR.txtbx_techInfo(driver).sendKeys(techInfo);
 
        String ReeFormat = ExcelUtils.getCellData(i, 4);
        Select rformat = new Select(Title_OR.list_ReedFormat(driver)); 
        rformat.selectByVisibleText(ReeFormat);
        
        String link = ExcelUtils.getCellData(i, 5);
	Title_OR.txtbx_Link(driver).sendKeys(link);
		
	jse.executeScript("scroll(1000, 0)");
				
	Title_OR.link_People(driver).click();
		
        Select tpeople = new Select(Title_OR.list_Person(driver)); 
        tpeople.selectByIndex(1);
                
        Select tposition = new Select(Title_OR.list_Position(driver)); 
        tposition.selectByIndex(1);
        
        String role = ExcelUtils.getCellData(i, 12);
	Title_OR.txtbx_Role(driver).sendKeys(role);
		
		
        Title_OR.link_Promos(driver).click();
        
        Title_OR.btn_AddExistingPromo(driver).click();
        
        Thread.sleep(4000);
        
        String promoName=ExcelUtils.getCellData(i, 19);
        Title_OR.txtbx_promoName(driver).sendKeys(promoName);
        
        Title_OR.btn_AddingPromo(driver).click();
        Thread.sleep(4000);
		
	Title_OR.link_PubOption(driver).click();
                        
        String ModState = ExcelUtils.getCellData(i, 13);
        Select mstate = new Select(Title_OR.list_ModState(driver)); 
        mstate.selectByVisibleText(ModState);
        
        String assignTo = ExcelUtils.getCellData(i, 14);
        Title_OR.txtbx_AssignTo(driver).clear();
	Title_OR.txtbx_AssignTo(driver).sendKeys(assignTo.trim());
		
	String logMsg = ExcelUtils.getCellData(i, 15);
	Title_OR.txtbx_Logmess(driver).sendKeys(logMsg.trim());
		
	Title_OR.btn_Save(driver).click();
	Thread.sleep(20000);
		
	if(driver.getTitle().contains(title))
	      {
                   System.out.println("Title "+title+" has been created.");
              }
	}
	
	}
		
	}
}
