package numpyninja.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
import numpyninja.Pages.QueuePage;
import numpyninja.Pages.SignInPage;
public class QueueTest extends BaseTest{
	    
	QueuePage objqueue;
    
      @BeforeClass
      public void setUp() throws IOException  {
  	    
       LandingPage landingPage = this.launchApplication();
   	   landingPage.getStarted();
   		
   	    HomePage home= new HomePage(driver);
   	    home.signinvalidation();
           
   	    SignInPage signIn =new SignInPage(driver);
           signIn.login(userName, password);
           signIn.clickLogin(); 
           
           home.getstartedQueueclick();
		       	
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
					
				}
				
				@AfterClass
				public void logout() {
					teardown();
				}
}