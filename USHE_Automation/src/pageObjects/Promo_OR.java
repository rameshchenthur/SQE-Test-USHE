/*Handling Promo objects in the application updated on 24-11-2014*/

package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Promo_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Promo_OR.class.getName());
    
	public static WebElement btn_existingTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-associated-title-und-actions-ief-add-existing"));

        Log.info("Existing title button found");

        return element;

        }
	
	public static WebElement txtbx_existingTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-associated-title-und-form-entity-id"));

        Log.info("title text box found");

        return element;

        }
	
	public static WebElement btn_addTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-associated-title-und-form-actions-ief-reference-save"));

        Log.info("Add title button found");

        return element;

        }
	
	public static WebElement txtbx_pTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-title"));

        Log.info("title text box found");

        return element;

        }
	
	public static WebElement txtbx_Descrption(WebDriver driver) {
		 
        element = driver.findElement(By.id("tinymce"));

        Log.info("Body text box found");

        return element;

        }
	
	public static WebElement btn_Image(WebDriver driver) { 
        
        element = driver.findElement(By.id("edit-field-promo-image-und-0-select"));  

        Log.info("Image Button found"); 

        return element; 

        } 
	
	public static WebElement btn_browse(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-upload-upload"));

        Log.info("Browse button found");

        return element;

        }
	 

	public static WebElement btn_Upload(WebDriver driver) { 
    
		element = driver.findElement(By.id("edit-upload-upload-button"));  

		Log.info("Image Upload Button found"); 

		return element; 

		}  

	public static WebElement btn_Next(WebDriver driver) { 
    
		element = driver.findElement(By.id("edit-next"));  

		Log.info("Image Next Button found"); 

		return element; 

    	}    

	public static WebElement btn_imagSave(WebDriver driver) { 

		element = driver.findElement(By.id("edit-submit"));  

		Log.info("Image Save Button found"); 

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

