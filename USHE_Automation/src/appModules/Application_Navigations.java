
/*Handling OR for All the navigations of application*/
package appModules;
import org.openqa.selenium.WebDriver;
import pageObjects.ApplicationLinks;

public class Application_Navigations {
	
	public static void crtTitle_Navigate(WebDriver driver) throws Exception
	{
		  ApplicationLinks.link_Menu(driver).click();
		  Thread.sleep(1000);
		  ApplicationLinks.link_Content(driver).click();
		  Thread.sleep(1000);
          	  ApplicationLinks.link_AddContent(driver).click();
                  Thread.sleep(20000);
          	  ApplicationLinks.link_CrtTitle(driver).click();
                  Thread.sleep(40000);
	}
	
	public static void crtPromo_Navigate(WebDriver driver) throws Exception
	{
		
		  ApplicationLinks.link_Menu(driver).click();
		  Thread.sleep(1000);
		  ApplicationLinks.link_Content(driver).click();
		  Thread.sleep(1000);
                  ApplicationLinks.link_AddContent(driver).click();
                  Thread.sleep(10000);
                  ApplicationLinks.link_CrtPromo(driver).click();
                  Thread.sleep(10000);
	}
	
	public static void crtPerson_Navigate(WebDriver driver) throws Exception
	{

		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Content(driver).click();
		   Thread.sleep(1000);
                   ApplicationLinks.link_AddContent(driver).click();
                   Thread.sleep(10000);
                   ApplicationLinks.link_CrtPerson(driver).click();
                   Thread.sleep(20000);
	}
	
	public static void crtRetailer_Navigate(WebDriver driver) throws Exception
	{

		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Content(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_AddContent(driver).click();
                   Thread.sleep(10000);
                   ApplicationLinks.link_CrtRetailer(driver).click();
                  Thread.sleep(10000);
        }
	
	public static void crtPost_Navigate(WebDriver driver) throws Exception{

		  ApplicationLinks.link_Menu(driver).click();
		  Thread.sleep(1000);
		  ApplicationLinks.link_Content(driver).click();
		  Thread.sleep(1000);
		  ApplicationLinks.link_AddContent(driver).click();
                  Thread.sleep(10000);
                  ApplicationLinks.link_CrtPost(driver).click();
                  Thread.sleep(10000);

	}
	
	public static void crtMainNav_Navigate(WebDriver driver) throws Exception
	{
		  ApplicationLinks.link_Menu(driver).click();
		  Thread.sleep(1000); 
		  ApplicationLinks.link_Structure(driver).click();
		  Thread.sleep(20000);
		  ApplicationLinks.link_Menus(driver).click();
		  Thread.sleep(20000);
		  ApplicationLinks.link_AddLink(driver).click();
		  Thread.sleep(10000);
     
	}
	

	public static void crtSecNav_Navigate(WebDriver driver) throws Exception
	{
		  ApplicationLinks.link_Menu(driver).click();
		  Thread.sleep(1000); 
		  ApplicationLinks.link_Structure(driver).click();
	          Thread.sleep(20000);
	          ApplicationLinks.link_Menus(driver).click();
	          Thread.sleep(20000);
	          ApplicationLinks.link_SecNavAddLink(driver).click();
	          Thread.sleep(10000);
	          
	}
	
	public static void crtGenre_Navigation(WebDriver driver) throws Exception{
		
		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Structure(driver).click();
	           Thread.sleep(20000);
	           ApplicationLinks.link_Taxonomy(driver).click();
	           Thread.sleep(20000);
	           ApplicationLinks.link_AddTermForGenre(driver).click();
	           Thread.sleep(20000);
	
	}
	
	public static void video_Navigation(WebDriver driver) throws InterruptedException
	{
		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Content(driver).click();
		   Thread.sleep(20000);
		   ApplicationLinks.link_file(driver).click();
		   Thread.sleep(20000);
		   ApplicationLinks.link_mpxMedia(driver).click();
		   Thread.sleep(20000);
		   ApplicationLinks.link_mpxMediaTitle(driver).click();
		   Thread.sleep(10000);
	}
	
	public static void crtSocail_Navigate(WebDriver driver) throws Exception
	{
		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
	           ApplicationLinks.link_Structure(driver).click();
	           Thread.sleep(20000);
	           ApplicationLinks.link_Menus(driver).click();
	           Thread.sleep(20000);
	           ApplicationLinks.link_addSocial(driver).click();
	       	       
	}
	
	public static void navigate_FavTitle(WebDriver driver) throws InterruptedException
	{
                   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Content(driver).click();
		   Thread.sleep(20000);
		   ApplicationLinks.link_Queues(driver).click();
		   Thread.sleep(10000);
		   ApplicationLinks.edit_favTitle(driver).click();
		   Thread.sleep(20000);
		
	}
	
	public static void navigate_RecVideo(WebDriver driver) throws InterruptedException
	{
		   ApplicationLinks.link_Menu(driver).click();
		   Thread.sleep(1000);
		   ApplicationLinks.link_Content(driver).click();
		   Thread.sleep(10000);
		   ApplicationLinks.link_Queues(driver).click();
		   Thread.sleep(10000);
		   ApplicationLinks.edit_recVideo(driver).click();
		   Thread.sleep(10000);
	   
	}
	
	
}
