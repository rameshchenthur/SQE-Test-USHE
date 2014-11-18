package appModules;
/*Handling OR for sigin*/

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.LogIn_OR;
import utility.Constant;


public class SignIn_Action {
	private static Logger Log = Logger.getLogger(SignIn_Action.class.getName());//
	public static void Execute(WebDriver driver) throws Exception{
		
        LogIn_OR.txtbx_UserName(driver).sendKeys(Constant.Username);
        
        Log.info("usre name entered"+Constant.Username);

        LogIn_OR.txtbx_Password(driver).sendKeys(Constant.Password);
        
        Log.info("pwd name entered"+Constant.Password);

        LogIn_OR.btn_LogIn(driver).click();

    }
	
	
}
