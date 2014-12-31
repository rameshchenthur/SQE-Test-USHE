/* handling Queue to titles and videos in the application updated on 24-11-2014*/

package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Queue_Title_Video_OR {
	
	static WebElement element = null;
	public static Logger logger = Logger.getLogger(Queue_Title_Video_OR.class.getName());
	
	public static WebElement txtbx_TitleName(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-title"));

        Log.info("Title text box found");

        return element;

        }
	
	public static WebElement btn_titleAddMore(WebDriver driver) {
		 
	    element = driver.findElement(By.name("field_qt_titles_add_more"));
			
		Log.info("Addmore for title button found");

	    return element;
	        
	    }
	
	public static WebElement btn_videoAddMore(WebDriver driver) {
		 
	    element = driver.findElement(By.name("field_qt_videos_add_more"));
			
		Log.info("Addmore for video button found");

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
	
	public static WebElement btn_SaveQueue(WebDriver driver) {
		 
	    element = driver.findElement(By.id("edit-submit"));
			
	    Log.info("Save button found");

	    return element;
	        
	    }

}
