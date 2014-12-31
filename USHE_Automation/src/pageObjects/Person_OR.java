/*Handling person page objects in the application updated on 24-11-2014*/

package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Person_OR {
	
	   static WebElement element = null;
	   public static Logger logger = Logger.getLogger(Person_OR.class.getName());
	   
	   public static WebElement txtbx_PerTitle(WebDriver driver) {
		 
	         element = driver.findElement(By.id("edit-title"));

	         Log.info("Person_Title textbox found");

	         return element;

	    	}
		
		public static WebElement txtbx_PerDesc(WebDriver driver) {
			 
	        element = driver.findElement(By.id("tinymce"));

	        Log.info("Desc text box found");

	        return element;

			}
		
		public static WebElement btn_PerImage(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-field-person-images-und-add-more"));

	        Log.info("image button found");

	        return element;

	        }
		
		public static WebElement txtbx_imgPath(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-upload-upload"));

	        Log.info("image path text box found");

	        return element;

			}
		
		
		public static WebElement btn_Upload(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-upload-upload-button"));

	        Log.info("uplaod button found");

	        return element;

			}
		
		public static WebElement btn_Next(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-next"));

	        Log.info("next button found");

	        return element;

			}
		
		public static WebElement btn_imagSave(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-submit"));

	        Log.info("save button found");

	        return element;

	        }
		
		
		public static WebElement list_ModStat(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-event"));

	        Log.info("ModStatus list box found");

	        return element;

	        }
		
		public static WebElement txtbx_AssingTo(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-field-workbench-assigned-und-0-target-id"));

	        Log.info("Assign to textbox found");

	        return element;

	        }
		
		public static WebElement txtbx_Logmsg(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-event-comment"));

	        Log.info("log msg textbox found");

	        return element;

	        }
		
		public static WebElement btn_Save(WebDriver driver) {
			 
	        element = driver.findElement(By.id("edit-submit"));

	        Log.info("Save button found");

	        return element;

	        }

     }
