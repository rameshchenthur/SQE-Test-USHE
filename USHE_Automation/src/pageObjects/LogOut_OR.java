package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class LogOut_OR {
	
	static WebElement element = null;
	
	public static WebElement link_LogOut(WebDriver driver) {
		 
        element = driver.findElement(By.xpath(".//*[@id='admin-menu-account']/li[1]/a"));

        Log.info("log out success");

        return element;

        }

}
