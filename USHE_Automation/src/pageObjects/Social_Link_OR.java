package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Social_Link_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Social_Link_OR.class.getName());
	
	public static WebElement txtbx_menuLinkTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-link-title"));

        Log.info("Menu link title text box found");

        return element;

        }
	
	public static WebElement txtbx_path(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-link-path"));

        Log.info("path text box found");

        return element;

        }
	
	public static WebElement chkBox_imagIcon(WebDriver driver) {
		 
	    element = driver.findElement(By.id("edit-use-icon-logo"));
			
	    Log.info("checkbox found");

	    return element;
	        
	    }
	
	public static WebElement btn_browse(WebDriver driver) {
		 
	    element = driver.findElement(By.id("edit-icon-upload"));
			
	    Log.info("Browse button found");

	    return element;
	        
	    }
	
	public static WebElement btn_Save(WebDriver driver) {
		 
	    element = driver.findElement(By.id("edit-submit"));
			
	    Log.info("Save button found");

	    return element;
	        
	    }

}
