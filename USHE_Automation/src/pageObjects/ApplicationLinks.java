package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import appModules.GenreCreation_Action;
import utility.Log;

public class ApplicationLinks {
	
static WebElement element = null;

    public static WebElement link_Home(WebDriver driver) {
	 
       element = driver.findElement(By.xpath(".//*[@id='admin-menu-icon']/li/a/span"));

       Log.info("home link found");

        return element;

        }

	public static WebElement link_MyWorBench(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("My Workbench"));

        Log.info("workbench link found");

        return element;

        }
	
	public static WebElement link_CrtContent(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Create content"));

        Log.info("Content link found");

        return element;

        }
	
	public static WebElement link_Content(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Content"));

        Log.info("Content link found");

        return element;

        }
	
	public static WebElement link_CrtPerson(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Person"));

        Log.info("Person link found");

        return element;

        }
	
	public static WebElement link_CrtTitle(WebDriver driver) { 
        
        element = driver.findElement(By.linkText("Title"));  

        Log.info("Title link found"); 

         return element; 

}
	public static WebElement link_AddContent(WebDriver driver) {

		element = driver.findElement(By.linkText("Add content"));

        Log.info("Add Content link found");

        return element;

        }
	

	public static WebElement link_CrtPromo(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Promo"));

        Log.info("Promo link found");

        return element;

        }
	
	public static WebElement link_CrtRetailer(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Retailer"));

        Log.info("Promo link found");

        return element;

        }
	
	public static WebElement link_CrtPost(WebDriver driver) {
		 
        element = driver.findElement(By.linkText("Post"));

        Log.info("Post link found");

        return element;

        }
	
	public static WebElement link_Structure(WebDriver driver) {      //common for main and Secondary Navigation
		 
        element = driver.findElement(By.linkText("Structure"));

        Log.info("Structure link found");

        return element;

        }
	
	public static WebElement link_Menus(WebDriver driver) {          //common for main and Secondary Navigation
		 
        element = driver.findElement(By.linkText("Menus"));

        Log.info("Menus link found");

        return element;

        }
	
	public static WebElement link_Taxonomy(WebDriver driver) {          
		 
        element = driver.findElement(By.linkText("Taxonomy"));

        Log.info("Taxonomy link found");

        return element;

        }
	
	public static WebElement link_AddLink(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='block-system-main']/div/table[2]/tbody/tr[4]/td[4]/a"));

        Log.info("Add link found for navigation");

        return element;

        }
	
	public static WebElement link_SecNavAddLink(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='block-system-main']/div/table[2]/tbody/tr[5]/td[4]/a"));

        Log.info("Add link found for Sec. navigation");

        return element;

        }
	
	
	public static WebElement link_CloseWindow(WebDriver driver) {
        
        element = driver.findElement(By.xpath(".//*[@id='overlay-close']"));
 
        Log.info("Close image found");
 
        return element;
 
        }
	
	
	public static WebElement link_AddTermForGenre(WebDriver driver){
		
		element=driver.findElement(By.xpath(".//*[@id='edit-6-add']"));
		
		Log.info("Addterm link found");
		
		return element;
	}
	
	
	
  public static WebElement link_listofGenre(WebDriver driver){
		
		element=driver.findElement(By.xpath(".//*[@id='edit-6-list']"));
		
		Log.info("listoff genere found");
		
		return element;
	  }
  
  
  public static WebElement link_ClickParticularGenre(WebDriver driver){
		
		element=driver.findElement(By.linkText(GenreCreation_Action.GenreName));
		
		Log.info("genere found");
		
		return element;
	  }
  
  
  public static WebElement link_Edit(WebDriver driver){
		
		element=driver.findElement(By.linkText("Edit"));
		
		Log.info("edit link found");
		
		return element;
	  }
  
  public static WebElement list_Month(WebDriver driver){
		
		element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		
		Log.info("Month listbox found");
		
		return element;
	  }
  
  
  public static WebElement list_Year(WebDriver driver){
		
		element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
 		
		Log.info("Year listbox found");
		
		return element;
	  }
  
  
  public static WebElement link_Genre(WebDriver driver){
		
		element=driver.findElement(By.linkText(GenreCreation_Action.GenreName));
		
		Log.info("GenreName link found");
		
		return element;
	  }
  
  
  public static WebElement link_Addfile(WebDriver driver) {
		 
      element = driver.findElement(By.id("edit-upload_browse"));
		
	   Log.info("add file link found");

        return element;
        
        }

  public static WebElement link_StartUpload(WebDriver driver) {
	 
      element = driver.findElement(By.xpath(".//*[@id='edit-upload_container']/div/div[2]/div[2]/div[1]/div/a[2]"));
		
	   Log.info("StartUpload link found");

        return element;
        
        }


  public static WebElement link_addSocial(WebDriver driver) {
	 
       element = driver.findElement(By.xpath(".//*[@id='block-system-main']/div/table[2]/tbody/tr[6]/td[4]/a"));
		
	   Log.info("addSocial link found");

       return element;
      
      }
  public static WebElement link_file(WebDriver driver) {
		 
      element = driver.findElement(By.xpath(".//*[@id='overlay-tabs']/li[3]/a"));
		
	   Log.info("file link found");

      return element;
     
     }
  
  public static WebElement link_mpxMedia(WebDriver driver) {
		 
      element = driver.findElement(By.xpath(".//*[@id='page']/div[1]/ul/li[4]/a"));
		
	   Log.info("mpxMedia link found");

      return element;
     
     }
  
  public static WebElement link_mpxMediaTitle(WebDriver driver) {
     
	  element = driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div[3]/table/tbody/tr[1]/td[3]/a"));
	   
	   Log.info("mpxMedia Title link found");

      return element;
     
     }
  
  public static WebElement edit_favTitle(WebDriver driver) {
	     
	  element = driver.findElement(By.xpath("//*[@id='ctools-button-2']/div[2]/ul/li[1]/a"));
	   
	   Log.info("edit for fav title link found");

      return element;
     
     }
  
  public static WebElement edit_recVideo(WebDriver driver) {
	     
	  element = driver.findElement(By.xpath("//*[@id='ctools-button-1']/div[2]/ul/li[1]/a"));
	   
	   Log.info("edit for rec video link found");

      return element;
     
     }
 
}
