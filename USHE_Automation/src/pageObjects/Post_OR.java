package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Post_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Promo_OR.class.getName());

	public static WebElement txtbx_Title(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-title"));

        Log.info("title text box found");

        return element;

        }
	
	public static WebElement txtbx_Descrption(WebDriver driver) {
		 
        element = driver.findElement(By.id("tinymce"));

        Log.info("Body text box found");

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
