package utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import mainFlows.USHE_RegMain;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
		
	public static void scrShot(String filePath,String scrName) throws IOException
	{
            File scrFile = ((TakesScreenshot)USHE_RegMain.driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File(filePath.concat(scrName)+".png"));
	}
	
	public static void dateTime(String date){
		WebElement dateWidget = USHE_RegMain.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));
		List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

		for (WebElement cell: columns)
		{
		    if (cell.getText().equals(date))
		    {
		         cell.findElement(By.linkText(date)).click();
		         break;
		    }
		} 
	}
	
	public static String extractNumber(){
		String url=USHE_RegMain.driver.getCurrentUrl();
		String num=url.replaceAll("[^0-9]", "");
		String node=num.substring(1);
		return node;
	}
	
	public static void selRetailer(String retailer){
	    int retailerSize=USHE_RegMain.driver.findElements(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li")).size();
        for(int i=1;i<retailerSize;i++)
          {  
    	      WebElement retailerDropDown=USHE_RegMain.driver.findElement(By.xpath(".//*[@id='edit_field_formats_und_0_field_retailers_und_chosen']/div/ul/li["+i+"]"));
    	      if(retailerDropDown.getText().equals(retailer))
    	         {
    		          retailerDropDown.click();
    		          break;
    	         }
          }
	}
	
	public static void imgUpload(String imgpath,String autoItpath) throws IOException, InterruptedException{
		
		String[] command = new String[]{};
		String absoluteImagePath = imgpath;
		String duplicateImageAutoItExe = autoItpath;
		command = new String[]{duplicateImageAutoItExe,absoluteImagePath}; 
		Thread.sleep(9000); 
		Runtime.getRuntime().exec(command);
		Thread.sleep(5000); 
	}
	
	public static void titleSelect(String title)
	{
		int Size=USHE_RegMain.driver.findElements(By.xpath("//div[@id='autocomplete']/ul/li/div/div[contains(text(),'"+title+"')]")).size();
		for(int j=1;j<Size;j++)
         {  
 	      WebElement titleDropDown=USHE_RegMain.driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li["+j+"]/div/div"));
 	         if(titleDropDown.getText().contains(title))
 	         {
 	        	 titleDropDown.click();
 		          break;
 	         }
 	    }
	}
	
}
	
	
//	public static File getScreenshot(String methodName) throws IOException {
//        File screenshot = null;
//        // to prevent "browser died" if there are too many issues and screenshots
//        try {Thread.sleep(3000);} catch (InterruptedException e1) {}
//        try {
//                screenshot = File.createTempFile(methodName + "_screenshot"
//                                + getCurrentDate(), ".png", new File("test-output"));
//                if (configuration.getDriverMode().equals("remote")) {
//                        TakesScreenshot augmentedDriver = (TakesScreenshot) new Augmenter()
//                                        .augment(driver);
//                        Files.copy(augmentedDriver.getScreenshotAs(OutputType.FILE),
//                                        screenshot);
//                } else {
//                        File scrFile = ((TakesScreenshot) driver)
//                                        .getScreenshotAs(OutputType.FILE);
//                        Files.copy(scrFile, screenshot);
//                }
//                
//        }catch(Exception e)
//        {
//        	
//        }
	//}

