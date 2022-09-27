package numpyninja.Tests;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
import numpyninja.Pages.SignInPage;
import numpyninja.util.ExcelReader;


public class SignInTest extends BaseTest {

	@BeforeClass
	public void goToPage() throws IOException {
				
		LandingPage landingPage = this.launchApplication();
		landingPage.getStarted();
		HomePage home= new HomePage(driver);
		home.signinvalidation();
	  } 
			 @Test
			  public void dslogin() {
			    	  SignInPage SignIn =new SignInPage(driver);
			    	   String xl ="./src/test/java/Excel/SignInTest.xlsx";
			           String Sheet = "Login";
			          int rowCount = 5;
			          String Uname = ""; 
			          String Upwd = "";
			            for (int i=1;i<=rowCount;i++)
			            {
			                  	
				                        Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
				                        System.out.println("the username==" +Uname);
				                        Upwd=ExcelReader.getCellValue(xl, Sheet, i, 1);
				                        System.out.println("the password==" +Upwd);
				                        
				                        if(Uname==null) {
				                        	
				                        	Uname="";
				                        	SignIn =new SignInPage(driver);
				                        	SignIn.nousername();
					                        SignIn.clickLogin();
					                        assertEquals(SignIn.nousername(), "Please fill out this field.");
					                        System.out.println("no username");
//					                        listnerclass lc=new listnerclass();
//					                       lc.takeSnapShot("SnapShot", driver);
//					                       File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//					           			FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen2.png"));
					                       // lc.f();
				                        	  }
		
				                        else if(Upwd==null) {
						                        	Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
							                        System.out.println("the username==" +Uname);
								            		//Upwd = "";
								            		SignIn=new SignInPage(driver);
								            		SignIn.nopwd(Uname);
								            		SignIn.clickLogin();
								            		assertEquals(SignIn.nopwd(Uname), "Please fill out this field.");
								            		System.out.println("no pwd");
								            	
						                        }
				                        
				                        	
				                        
			                SignIn =new SignInPage(driver);
			                Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
	                        Upwd=ExcelReader.getCellValue(xl, Sheet, i, 1);
	                        SignIn.login(Uname, Upwd);
	                        SignIn.clickLogin();
	                        
}

			 }
			 

@AfterClass
public void logout() {
	teardown();
}}