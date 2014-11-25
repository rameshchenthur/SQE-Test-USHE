/*Handling title page objects in the application updated on 24-11-2014*/

package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import appModules.GenreCreation_Action;
import utility.Log;

public class Title_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Title_OR.class.getName());

	public static WebElement txtbx_Title(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-title"));

        Log.info("title text box found");

        return element;

        }
	
	public static WebElement txtbx_sortTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-sort-label-und-0-value"));

        Log.info("sort title text box found");

        return element;

        }
	
	
	
	public static WebElement txtbx_Descrption(WebDriver driver) {
		 
        element = driver.findElement(By.id("tinymce"));

        Log.info("Descrption text box found");

        return element;

        }
	
	public static WebElement list_Type(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-type-und"));

        Log.info("Type listbox found");

        return element;

        }
	
	public static WebElement btn_AddingImage(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-field-title-images-und-add-more"));
			
		   Log.info("Image button found");

	        return element;
	        
	    }
	
	
	
	public static WebElement btn_Next(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-next"));
			
		   Log.info("Next button found");

	        return element;
	        
	    }

	public static WebElement list_Genere(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-genre-und"));

        Log.info("Genere listbox found");

        return element;

        }
	
	public static WebElement checkBox_Genere(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-genre-und-"+GenreCreation_Action.genre_Node));

        Log.info("Genere checkbox found");

        return element;

        }
	
	
	public static WebElement list_Rating(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-rating-und"));

        Log.info("Rating listbox found");

        return element;

        }
	
	public static WebElement link_Foramts(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='title-node-form']/div/div[1]/ul/li[2]/a/strong"));

        Log.info("Formats link found");

        return element;

        }
	
	
	public static WebElement list_PurFormat(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-formats-und-0-field-format-und"));

        Log.info("PurchasbleFormat listbox found");

        return element;

        }
	
	
	public static WebElement list_Retailer(WebDriver driver) {
        
        element = driver.findElement(By.xpath(".//*[@id='edit_field_formats_und_0_field_retailers_und_chosen']/ul"));
                     
      Log.info("Retailer listbox found");

      return element;

      }
	
	
   public static WebElement txtbx_streetDate(WebDriver driver) {
        
       element = driver.findElement(By.xpath(".//*[@id='edit-field-formats-und-0-field-street-date-und-0-value-datepicker-popup-0']"));
                     
      Log.info("Street Date textbox found");

      return element;

      }

   public static WebElement txtbx_solicitataionDate(WebDriver driver) {
    
       element = driver.findElement(By.xpath(".//*[@id='edit-field-formats-und-0-field-solicitation-date-und-0-value-datepicker-popup-0']"));
                  
       Log.info("solicitation textbox found");

       return element;

       }
	 
	public static WebElement txtbx_bonusFeature(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-formats-und-0-field-bonus-features-und-0-field-feature-und-0-value"));

        Log.info("Bonusfeature text box found");

        return element;

        }
	
	
	public static WebElement list_TechType(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-formats-und-0-field-technical-information-und-0-field-feature-type-und"));

        Log.info("TechType listbox found");

        return element;

        }
	
	public static WebElement txtbx_techInfo(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-formats-und-0-field-technical-information-und-0-field-feature-und-0-value"));

        Log.info("Techinfo text box found");

        return element;

        }
	
	
	public static WebElement list_ReedFormat(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-format-und"));

        Log.info("RedeemableFormat listbox found");

        return element;

        }
	
	
	public static WebElement txtbx_Link(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-link-und-0-url"));

        Log.info("Link text box found");

        return element;

        }
	
	
	public static WebElement txtbx_FromDate(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-date-und-0-value-datepicker-popup-0"));

        Log.info("FormDate text box found");

        return element;

        }
	
	public static WebElement txtbx_FromTime(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-date-und-0-value-timeEntry-popup-1"));

        Log.info("FromTime text box found");

        return element;

        }
	
	public static WebElement txtbx_ToDate(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-date-und-0-value2-datepicker-popup-0"));

        Log.info("ToDate text box found");

        return element;

        }
	
	public static WebElement txtbx_ToTime(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-redeemable-formats-und-0-field-redeemable-date-und-0-value2-timeEntry-popup-1"));

        Log.info("ToTime text box found");

        return element;

        }
	
	
	public static WebElement link_People(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='title-node-form']/div/div[1]/ul/li[3]/a/strong"));

        Log.info("Peoples link found");

        return element;

        }
	
	
	public static WebElement list_Person(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-people-und-0-field-person-und"));

        Log.info("Modstate listbox found");

        return element;

        }
	
	public static WebElement list_Position(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-people-und-0-field-position-und"));

        Log.info("Modstate listbox found");

        return element;

        }
	
	
	public static WebElement txtbx_Role(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-people-und-0-field-role-und-0-value"));

        Log.info("ToTime text box found");

        return element;

        }
	
	
	public static WebElement link_Promos(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='title-node-form']/div/div[1]/ul/li[4]/a/strong"));

        Log.info("Promo link found");

        return element;

        }
	
	
	public static WebElement btn_AddExistingPromo(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-field-promos-und-actions-ief-add-existing"));
			
		   Log.info("AddExistingPromo button found");

	        return element;
	        
	        }
	
	public static WebElement txtbx_promoName(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-promos-und-form-entity-id"));

        Log.info("promo name text box found");

        return element;

        }
	
	public static WebElement btn_AddingPromo(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-field-promos-und-form-actions-ief-reference-save"));
			
		   Log.info("AddPromo button found");

	        return element;
	        
	        }
	
	
	
	public static WebElement link_PubOption(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='title-node-form']/div/div[1]/ul/li[5]/a/strong"));

        Log.info("Peoples link found");

        return element;

        }
		
	
	public static WebElement list_ModState(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-event"));

        Log.info("Modstate listbox found");

        return element;

        }
	
	public static WebElement txtbx_AssignTo(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-workbench-assigned-und-0-target-id"));

        Log.info("Assign to  text box found");

        return element;

        }
	
	public static WebElement txtbx_Logmess(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-event-comment"));

        Log.info("logmessage  text box found");

        return element;

        }
	
	public static WebElement btn_Save(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-submit"));
			
		   Log.info("Save button found");

	        return element;
	        
	        }
		
	
	
}
