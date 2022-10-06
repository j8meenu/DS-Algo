
package numpyninja.Tests;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.GraphPage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.SignInPage;

public class GraphTest extends BaseTest{
	
	GraphPage objGraph;
	
      @BeforeClass
	public void Graph() throws IOException {

 		 HomePage home= new HomePage(driver);
         
         home.getstartedGraphclick();
     }
@Test(priority=0)
				public void graphtopic() {
	objGraph = new GraphPage(driver);
					objGraph.graphtopic();
					objGraph.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void graphRep() {
					objGraph = new GraphPage(driver);
					objGraph.graphRep();
					objGraph.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				
				@Test(priority=2)
				public void practicequestions() {
					objGraph = new GraphPage(driver);
					objGraph.graphRep();
					objGraph.practice();
					String title = driver.getTitle();
			       	assertTrue(true, title);
			       	driver.navigate().back();
								
					
				}
				@AfterClass
				public void logout() {
					SignInPage SignIn =new SignInPage(driver);
					SignIn.clicklogout();
					driver.quit();
									
				}
}