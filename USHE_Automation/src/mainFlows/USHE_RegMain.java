package mainFlows;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import utility.Log;
import utility.Result_Excel;
import utility.TestCaseNames;
import appModules.CreateSocialLink_Action;
import appModules.FavouriteTitle_Action;
import appModules.GenreCreation_Action;
import appModules.LogOut_Action;
import appModules.MainNavCreation_Action;
import appModules.PersonCreation_Action;
import appModules.PostCreation_Action;
import appModules.PromoCreation_Action;
import appModules.PromoWithTitle_Action;
import appModules.RecentVideoTitles_Action;
import appModules.RetailerCreation_Action;
import appModules.SecNavCreation_Action;
import appModules.SignIn_Action;
import appModules.TitleCreation_Action;
import appModules.TitleRegression_Action;
import appModules.TitleToVideo_Action;
import appModules.TitleWithBonusandTechinical_Action;
import appModules.TitleWithSolicitationDate_Action;
import appModules.TitleWithStreetDate_Action;

public class USHE_RegMain {

	public static WebDriver driver=null;
	public static Logger logger = Logger.getLogger(USHE_RegMain.class.getName());
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		        PropertyConfigurator.configure(Constant.Path_Logfile);
				
				Result_Excel.setExcelFile(Constant.Path_TestData + Constant.File_Result,"Result");
     
				driver=new FirefoxDriver();
		     	        driver.manage().window().maximize();

				Log.startTestCase("Create_Title");
				
				//call the url and launching
				driver.get(Constant.URL);
				
				//print the log message
				 Log.info("Url launched");
				 
				 Thread.sleep(7000);
		 	
				//verify the title then logged into the page
			        if(driver.getTitle().contains("Site-Install"))
			        {
			        	  //print the log message
			               Log.info("entered into if cond");
			               
			               //enter the username and pwd
			               SignIn_Action.Execute(driver);
			               
			               //print the log message
			               Log.info("Logged to home page");
			        }
			        else
			        {
			        	//condition failed...then print the log message
			        	   Log.info("exited into if cond");
			        	
			        	//quit the driver
			        	   driver.quit();
			        }
			        
			            		        			            		        
			            for(int i=1;i<=Result_Excel.getRowCount();i++)
			    		{
			            	
			            	String TestCase=Result_Excel.getCellData(i, 0);
			            	String Flag=Result_Excel.getCellData(i, 1);
			            	
			            	if(TestCase.equals(TestCaseNames.Person_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		PersonCreation_Action.PersonCreate(driver);
			            		System.out.println(PersonCreation_Action.per_Title);
			            		
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.Promo_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		PromoCreation_Action.PromoCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.PostCreation_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		PostCreation_Action.PostCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	
			            	if(TestCase.equals(TestCaseNames.Title_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleCreation_Action.TitleCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.Retailer_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		RetailerCreation_Action.RetailerCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.Genre_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		GenreCreation_Action.GenreCreation(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            				            	
			            	if(TestCase.equals(TestCaseNames.MainNav_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		MainNavCreation_Action.MainNavigationCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.SecNav_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		SecNavCreation_Action.SecNavigationCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	

			            	if(TestCase.equals(TestCaseNames.Titlewithbonusretailer_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleWithBonusandTechinical_Action.TitlewithBonusTechincalinfo(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.Titlewithstreetdate_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleWithStreetDate_Action.TitleWithStreetDate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.Titlewithsolicitataiondate_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleWithSolicitationDate_Action.TitleWithSolicitataionDate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.PromowithTitle_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		PromoWithTitle_Action.PromoTitle(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.TitleRegresssion_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleRegression_Action.TitleCreate(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.SocailLink_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		CreateSocialLink_Action.socialCreation(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.TitleToVideo_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		TitleToVideo_Action.titleToVideo(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.FavTitle_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		FavouriteTitle_Action.favTitle(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	if(TestCase.equals(TestCaseNames.RecentVideoTitle_TestCase) & Flag.equals(TestCaseNames.Flag_Yes))
			            	{
			            		RecentVideoTitles_Action.recVideoTitle(driver);
			            		Result_Excel.setResultData("Pass", i, 2);
			            	}
			            	
			            	
			    		}
			            
			               if(driver.getTitle().contains("Site-Install"))
				   	        {
				   	        	  //print the log message
				   	               Log.info("entered into if cond");
				   	               
				   	              //log out the application
				   		           LogOut_Action.SignOut(driver);  
				   		           
				   		           Thread.sleep(10000);
				   		        
				   	               //print the log message
				   	               Log.info("Logged out from home page");
				   	        }
				                        
				        //quit the driver              
				        driver.quit();

	}

}
