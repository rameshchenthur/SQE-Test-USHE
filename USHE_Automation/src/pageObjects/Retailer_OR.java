package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Retailer_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Retailer_OR.class.getName());

	
	public static WebElement txtbx_Title(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-title"));

        Log.info("title text box found");

        return element;

        }
	
	public static WebElement list_FormatOption(WebDriver driver){
		
		element=driver.findElement(By.id("edit-field-format-settings-und-0-field-format-und"));
		
		Log.info("Format list box found");
		
		return element;
	}
	
	public static WebElement txtbx_SearUrl(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-field-format-settings-und-0-field-search-url-und-0-url"));

        Log.info("search url text box found");

        return element;

        }
	
	public static WebElement link_PubOption(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='retailer-node-form']/div/div[1]/ul/li[2]/a/strong"));

        Log.info("puboption link found");

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
