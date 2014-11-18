package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_OR {
	
	static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-name"));

        Log.info("Username text box found");

        return element;

        }
	
	public static WebElement txtbx_Password(WebDriver driver) {
		 
        element = driver.findElement(By.id("edit-pass"));

        Log.info("Password text box found");

        return element;

        }

    public static WebElement btn_LogIn(WebDriver driver) {

        element = driver.findElement(By.id("edit-submit"));

        Log.info("Submit button found");

        return element;

        }

}
