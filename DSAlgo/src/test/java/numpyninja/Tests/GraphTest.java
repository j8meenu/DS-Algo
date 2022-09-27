
package numpyninja.Tests;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.GraphPage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
import numpyninja.Pages.SignInPage;

public class GraphTest extends BaseTest{
	
	GraphPage objGraph;
	
      @BeforeClass
		public void Graph() throws IOException {
    	  
    	  
       LandingPage landingPage = this.launchApplication();
   	   landingPage.getStarted();
   		
   	    HomePage home= new HomePage(driver);
   	    home.signinvalidation();
           
   	    SignInPage signIn =new SignInPage(driver);
           signIn.login(UserName, Password);
           signIn.clickLogin(); 
           
           home.getstartedGraphclick();
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
					 teardown();
				}
}