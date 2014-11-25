/*Handling video page objects in the application updated on 24-11-2014*/

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class Video_OR {
	public static WebElement element = null;
	
	public static WebElement txtbx_TitleName(WebDriver driver)
	{
		element=driver.findElement(By.id("edit-field-ushe-title-und-0-target-id"));
		Log.info("Title textbox found");
		
		return element;
	}
	
	public static WebElement btn_Save(WebDriver driver){
		
		element=driver.findElement(By.id("edit-submit"));
		Log.info("Save button found");
		return element;
		
	}

}
