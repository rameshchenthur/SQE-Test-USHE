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

import appModules.RetailerCreation_Action;


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
	
}


