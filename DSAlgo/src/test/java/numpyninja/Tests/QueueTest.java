package numpyninja.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.QueuePage;
import numpyninja.Pages.SignInPage;
public class QueueTest extends BaseTest{
	    
	QueuePage objqueue;
	SignInPage SignIn;

    
//      @BeforeClass
//		public void queue() {
//    	  WebDriverManager.chromedriver().setup();
//		    driver= new ChromeDriver();
//				driver.get("https://dsportalapp.herokuapp.com/login");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//				SignIn =new SignInPage(driver);
//				SignIn.login("Nenyarajesh","Pinky1213");
//		       	SignIn.clickLogin();
//		       	objqueue =new QueuePage(driver);
//      }

      @BeforeClass
      public void setUp() throws IOException  {
  	    
    	initDriver();
  		driver.get(loginUrl);     
	      SignInPage SignIn =new SignInPage(driver);
	      SignIn.login(UserName, Password);
	      SignIn.clickLogin();
	      objqueue =new QueuePage(driver);

		       objqueue.getstartedqueue();
		       	
		}
				@Test(priority=0)
				public void impqueuebypython() {
					objqueue.impqueuebypython();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void impusingcollectionsdeque() {
					objqueue.impusingcollectionsdeque();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=2)
				public void impusingarray() {
					objqueue.impusingarray();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=3)
				public void queueoperations() {
					objqueue.queueoperations();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=4)
				public void practicequestions() {
					objqueue.queueoperations();
					objqueue.practice();
					String title = driver.getTitle();
			       	assertTrue(true, title);
			       	driver.navigate().back();
			       	//driver.navigate().back();
					
				}
				
				@AfterClass
				public void logout() {
					SignInPage SignIn =new SignInPage(driver);
					SignIn.clicklogout();
					driver.quit();
				}
}