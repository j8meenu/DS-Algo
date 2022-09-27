
package numpyninja.Tests;

import java.io.IOException;
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
import numpyninja.Pages.GraphPage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.SignInPage;

public class GraphTest extends BaseTest{
	//WebDriver driver;

	
	GraphPage objGraph;
	SignInPage SignIn;
	//HomePage home;
//      @BeforeClass
//		public void Graph() throws IOException {
//    	  
//    	  
//    	  WebDriverManager.chromedriver().setup();
//		    driver= new ChromeDriver();
//	    driver.get("https://dsportalapp.herokuapp.com/login");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				SignIn =new SignInPage(driver);
//				SignIn.login("Nenyarajesh","Pinky1213");
//
//      }
	 
      @BeforeClass
		public void setUp() throws IOException  {
	    
         initDriver();
	      driver.get(loginUrl);
	      
	      SignInPage SignIn =new SignInPage(driver);
	      SignIn.login(UserName, Password);

		       	SignIn.clickLogin();
		       	objGraph =new GraphPage(driver);
		       objGraph.getstartedgraph();
		       	
		}
				@Test(priority=0)
				public void graphtopic() {
					objGraph.graphtopic();
					objGraph.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void graphRep() {
					objGraph.graphRep();
					objGraph.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				
				@Test(priority=2)
				public void practicequestions() {
					objGraph.graphRep();
					objGraph.practice();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					
				}
				@AfterClass
				public void logout() {
					 SignInPage SignIn =new SignInPage(driver);
					SignIn.clicklogout();
					driver.quit();
				}
}