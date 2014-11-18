package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Genre_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Genre_OR.class.getName());
	
	public static WebElement txtbx_GenName(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-name"));

        Log.info("Name text box found");

        return element;

        }
	
	public static WebElement txtbx_GenDesc(WebDriver driver) {
		 
        element = driver.findElement(By.id("tinymce"));

        Log.info("Descrption text box found");

        return element;

        }
	
	public static WebElement btn_Save(WebDriver driver) {
		 
	      element = driver.findElement(By.id("edit-submit"));
			
		   Log.info("Save button found");

	        return element;
	        
	        }
		


}
