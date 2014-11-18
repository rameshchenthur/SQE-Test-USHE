
/*Handling OR for logouts*/
package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LogOut_OR;

public class LogOut_Action {
	
	public static void SignOut(WebDriver driver) throws Exception{
		 
		LogOut_OR.link_LogOut(driver).click();
		
    }

}
