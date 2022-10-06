package numpyninja.Tests;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.QueuePage;

public class QueueTest extends BaseTest{
	    
	QueuePage objqueue;
	
      @BeforeClass
      public void setUp() throws IOException  {  	    
    	  HomePage home= new HomePage(driver);
		       home.getstartedQueueclick();
		       	
		}
				@Test(priority=0)
				public void impqueuebypython() {
					objqueue = new QueuePage(driver);
					objqueue.impqueuebypython();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void impusingcollectionsdeque() {
					objqueue = new QueuePage(driver);
					objqueue.impusingcollectionsdeque();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=2)
				public void impusingarray() {
					objqueue = new QueuePage(driver);
					objqueue.impusingarray();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=3)
				public void queueoperations() {
					objqueue = new QueuePage(driver);
					objqueue.queueoperations();
					objqueue.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=4)
				public void practicequestions() {
					objqueue = new QueuePage(driver);
					objqueue.queueoperations();
					objqueue.practice();
					String title = driver.getTitle();
			       	assertTrue(true, title);
			       	driver.navigate().back();
			       	driver.navigate().back();
			       	driver.navigate().back();
					
				}
				
				@AfterClass
				public void logout() {
					/*SignInPage SignIn =new SignInPage(driver);
					SignIn.clicklogout();
					driver.quit();*/
				}
}