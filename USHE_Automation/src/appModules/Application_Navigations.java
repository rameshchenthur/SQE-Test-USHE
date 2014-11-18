
/*Handling OR for All the navigations of application*/

package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.ApplicationLinks;

public class Application_Navigations {
	
//	public static void crtPerson_Navigate(WebDriver driver) throws Exception{
//	     
//		Actions action = new Actions(driver);
//        action.moveToElement(ApplicationLinks.link_MyWorBench(driver)).click().perform();
//        action.moveToElement(ApplicationLinks.link_CrtContent(driver)).click().perform();
//        action.moveToElement(ApplicationLinks.link_CrtPerson(driver)).click().perform();
//	}
//
//	
//	public static void crtTitle_Navigate(WebDriver driver) throws Exception{
//	     
//		Actions action = new Actions(driver);
//        action.moveToElement(ApplicationLinks.link_MyWorBench(driver)).click().perform();
//        action.moveToElement(ApplicationLinks.link_CrtContent(driver)).click().perform();
//        action.moveToElement(ApplicationLinks.link_CrtTitle(driver)).click().perform();
//	}
	
	public static void crtTitle_Navigate(WebDriver driver) throws Exception{
		
		
//		  ApplicationLinks.link_Content(driver).click();
//		  Thread.sleep(20000);
//		  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Content dialog']")));
          ApplicationLinks.link_AddContent(driver).click();
          Thread.sleep(20000);
          driver.switchTo().defaultContent();
          driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Add content dialog']")));
          ApplicationLinks.link_CrtTitle(driver).click();
          Thread.sleep(40000);
          driver.switchTo().defaultContent();

	}
	
	public static void crtPromo_Navigate(WebDriver driver) throws Exception{
		
//		  ApplicationLinks.link_Content(driver).click();
//		  Thread.sleep(20000);
//		  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Content dialog']")));
          ApplicationLinks.link_AddContent(driver).click();
          Thread.sleep(20000);
          driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Add content dialog']")));
          ApplicationLinks.link_CrtPromo(driver).click();
          Thread.sleep(40000);
          driver.switchTo().defaultContent();

	}
	
	public static void crtPerson_Navigate(WebDriver driver) throws Exception{

           ApplicationLinks.link_AddContent(driver).click();
           Thread.sleep(20000);
           driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Add content dialog']")));
           ApplicationLinks.link_CrtPerson(driver).click();
           Thread.sleep(40000);
           driver.switchTo().defaultContent();

	}
	
	public static void crtRetailer_Navigate(WebDriver driver) throws Exception{

           ApplicationLinks.link_AddContent(driver).click();
           Thread.sleep(20000);
           driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Add content dialog']")));
           ApplicationLinks.link_CrtRetailer(driver).click();
           Thread.sleep(40000);
           driver.switchTo().defaultContent();

	}
	
	public static void crtPost_Navigate(WebDriver driver) throws Exception{

          ApplicationLinks.link_AddContent(driver).click();
          Thread.sleep(20000);
          driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Add content dialog']")));
          ApplicationLinks.link_CrtPost(driver).click();
          Thread.sleep(40000);
          driver.switchTo().defaultContent();

	}
	
                          /*-----------Code for Main Nav. starts here----------------*/

	public static void crtMainNav_Navigate(WebDriver driver) throws Exception{
	     
       ApplicationLinks.link_Structure(driver).click();
       Thread.sleep(20000);
       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Structure dialog']")));
       ApplicationLinks.link_Menus(driver).click();
       Thread.sleep(40000);
       driver.switchTo().defaultContent();
       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Menus dialog']")));
       Thread.sleep(20000);
       ApplicationLinks.link_AddLink(driver).click();
       driver.switchTo().defaultContent();
       
	}
	
	                   /*-----------Code for Secondary Nav. starts here----------------*/
	
	public static void crtSecNav_Navigate(WebDriver driver) throws Exception{
		
		   ApplicationLinks.link_Structure(driver).click();
	       Thread.sleep(20000);
	       
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Structure dialog']")));
	       ApplicationLinks.link_Menus(driver).click();
	       Thread.sleep(20000);
	       driver.switchTo().defaultContent();
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Menus dialog']")));
	       Thread.sleep(20000);
	       ApplicationLinks.link_SecNavAddLink(driver).click();
	       driver.switchTo().defaultContent();
	     
		
	}
	
	/*-----------Code for Secondary Nav. ends here----------------*/
	
	/*-----------Code for genre. starts here----------------*/
	
	public static void crtGenre_Navigation(WebDriver driver) throws Exception{
		
		   ApplicationLinks.link_Structure(driver).click();
	       Thread.sleep(20000);
	       
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Structure dialog']")));
	       ApplicationLinks.link_Taxonomy(driver).click();
	       Thread.sleep(20000);
	       driver.switchTo().defaultContent();
	       
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Taxonomy dialog']")));
	       ApplicationLinks.link_AddTermForGenre(driver).click();
	       Thread.sleep(20000);
	       driver.switchTo().defaultContent();
		
	}
	
	/*-----------Code for genre. ends here----------------*/
	
	
	public static void video_Navigation(WebDriver driver) throws InterruptedException{
		
		ApplicationLinks.link_Content(driver).click();
		Thread.sleep(20000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Content dialog']")));
		ApplicationLinks.link_file(driver).click();
		Thread.sleep(20000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='overlay-element overlay-active']")));
		ApplicationLinks.link_mpxMedia(driver).click();
		Thread.sleep(20000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='overlay-element overlay-active']")));
		ApplicationLinks.link_mpxMediaTitle(driver).click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
	}
	
	public static void crtSocail_Navigate(WebDriver driver) throws Exception{
	     
	       ApplicationLinks.link_Structure(driver).click();
	       Thread.sleep(20000);
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Structure dialog']")));
	       ApplicationLinks.link_Menus(driver).click();
	       Thread.sleep(40000);
	       driver.switchTo().defaultContent();
	       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Menus dialog']")));
	       Thread.sleep(20000);
	       ApplicationLinks.link_addSocial(driver).click();
	       driver.switchTo().defaultContent();
	       
		}
	
	
}
