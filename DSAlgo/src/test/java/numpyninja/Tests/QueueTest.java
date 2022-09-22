package numpyninja.Tests;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.QueuePage;
import numpyninja.Pages.SignInPage;
public class QueueTest extends BaseTest {
	
	QueuePage objqueue;
	
      @BeforeTest
		public void setUp() throws IOException  {
	    
         initDriver();
	      driver.get(loginUrl);
	      
	      SignInPage SignIn =new SignInPage(driver);
	      SignIn.login("Nenyarajesh","Pinky1213");
		       	SignIn.clickLogin();
		       	objqueue =new QueuePage(driver);
		       objqueue.getstartedqueue();
		       	
		}
				@Test(priority=0)
				public void impqueuebypython() {
					objqueue.impqueuebypython();
					objqueue.tryeditor();
				}
				@Test(priority=1)
				public void impusingcollectionsdeque() {
					objqueue.impusingcollectionsdeque();
					objqueue.tryeditor();
				}
				@Test(priority=2)
				public void impusingarray() {
					objqueue.impusingarray();
					objqueue.tryeditor();
				}
				@Test(priority=3)
				public void queueoperations() {
					objqueue.queueoperations();
					objqueue.tryeditor();
				}
				@Test(priority=4)
				public void practicequestions() {
					//objqueue.getstartedqueue();
					objqueue.impqueuebypython();
					objqueue.practice();
				}
}