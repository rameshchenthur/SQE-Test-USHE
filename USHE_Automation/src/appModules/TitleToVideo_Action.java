package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ApplicationLinks;
import pageObjects.Video_OR;

public class TitleToVideo_Action {
	public static void titleToVideo(WebDriver driver) throws InterruptedException
	{
		
		Application_Navigations.video_Navigation(driver);
		
		ApplicationLinks.link_Edit(driver).click();
		Thread.sleep(30000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='overlay-element overlay-active']")));
		
		jse.executeScript("scroll(0, 1400)");
	
		String owels[]={"a","e","i","o","u"};
		
		for(String element : owels) 
		{
		  Video_OR.txtbx_TitleName(driver).clear();
		  Video_OR.txtbx_TitleName(driver).sendKeys(element);
		  Thread.sleep(5000);
		  int Size=driver.findElements(By.xpath("//div[@id='autocomplete']/ul/li/div/div[contains(text(),'"+element+"')]")).size();
		  for(int j=1;j<Size;j++)
          {  
    	      WebElement titleDropDown=driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li["+j+"]/div/div"));
    	         if(titleDropDown.getText().contains(element))
    	         {
    	        	 titleDropDown.click();
    		          break;
    	         }
    	  }
		   break;
		}
		
		Thread.sleep(10000);
		Video_OR.btn_Save(driver).click();
		Thread.sleep(20000);
	}

}
