package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Sec_Nav_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Main_Nav_OR.class.getName());

	public static WebElement txtbx_MenuLinkTitle(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-link-title"));

        Log.info("MenuLink title text box found");

        return element;

        }
	
	public static WebElement txtbx_Path(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-link-path"));

        Log.info("MenuLink path text box found");

        return element;

        }
	
	public static WebElement btn_Save(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-submit"));
			
		   Log.info("Save button found");

	        return element;
	        
	        }
		
	



}
