package numpyninja.Tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Pages.SignInPage;

public class SignInTest {
	 
	WebDriver driver;
	 SignInPage SignIn;
	 String Uname = "Nenyarajesh";
	 String Upwd ="Pinky1213";
	 @BeforeTest
		public void SignIn() {
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://dsportalapp.herokuapp.com/login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
				 @Test(priority=0)
			       public void SignInwithoutentries() {
			       	SignIn =new SignInPage(driver);
			       	SignIn.clickLogin();
			      	assertEquals(SignIn.nousername(), "Please fill out this field.");
			       }
			       @Test(priority=1)
			       public void EmptyPassword() {
			       	 SignIn =new SignInPage(driver);
			            SignIn.nopwd(Uname);
			            SignIn.clickLogin(); 
			            assertEquals(SignIn.nopwd(Uname), "Please fill out this field.");
			       }
			       @Test(priority=2)
			       public void dslogin() {
			       	
			       	SignIn.login(Uname,Upwd);
			       	SignIn.clickLogin();
			       	String actualUrl= "https://dsportalapp.herokuapp.com/home";
			       	String expectedUrl= driver.getCurrentUrl();
			       	Assert.assertEquals(actualUrl, expectedUrl);
			       	if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
			       		System.out.println("Test passed"); }
			       	else { System.out.println("Invalid credentials"); }


			       	SignIn.clicklogout();

			       }
			       			      
			       @AfterTest
			       public void logout() {

			    	 	driver.close();
			       }

}
