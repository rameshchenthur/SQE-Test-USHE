package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;
import pageObjects.Genre_OR;
import utility.CommonFunctions;
import utility.Constant;
import utility.ExcelUtils;

public class GenreCreation_Action {
	
	public static String GenreName;
	public static String genre_Node;
	
	public static void GenreCreation(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Genre");//Open the Data excel file and focus on to the particular sheet
		
		for(int i=1;i<=ExcelUtils.getRowCount();i++)
		{
			
			Application_Navigations.crtGenre_Navigation(driver);
			Thread.sleep(20000);
			
			if(driver.getTitle().contains("Genre")){

				GenreName = ExcelUtils.getCellData(i, 0);
				Genre_OR.txtbx_GenName(driver).sendKeys(GenreName);
								
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text AreaPress ALT-F10 for toolbar. Press ALT-0 for help']")));
				String GenDesc=ExcelUtils.getCellData(i, 1);
				Genre_OR.txtbx_GenDesc(driver).sendKeys(GenDesc);
				
				driver.switchTo().defaultContent();
				
				Genre_OR.btn_Save(driver).click();
				Thread.sleep(20000);
				
				if(driver.findElement(By.cssSelector("body")).getText().contains(GenreName)){
			           
			         System.out.println("Created new term "+GenreName+".");
			     }
				
				CommonFunctions.scrShot(Constant.screenShots_Path, "Genre");
				
				ApplicationLinks.link_Menu(driver).click();
				Thread.sleep(10000);
				
				ApplicationLinks.link_Structure(driver).click();
			    Thread.sleep(10000);
			    
			    ApplicationLinks.link_Taxonomy(driver).click();
			    Thread.sleep(10000);
		    
			    ApplicationLinks.link_listofGenre(driver).click();
			    Thread.sleep(10000);
   	    
	    	            ApplicationLinks.link_Genre(driver).click();
	    	            Thread.sleep(10000);
	    	    
	    	            ApplicationLinks.link_Edit(driver).click();
	    	            Thread.sleep(9000);
	    	    
	    	             genre_Node=CommonFunctions.extractNodeNumber();
	    	    
				
			}
		}
		
	}

}
