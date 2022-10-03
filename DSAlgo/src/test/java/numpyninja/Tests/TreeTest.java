package numpyninja.Tests;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
import numpyninja.Pages.SignInPage;
import numpyninja.Pages.TreePage;
public class TreeTest extends BaseTest{
	    
	TreePage objtree;
	
	@BeforeClass
	public void setUp() throws IOException  {
    	
    	LandingPage landingPage = this.launchApplication();
		landingPage.getStarted();	
		
	   HomePage home= new HomePage(driver);
	    home.signinvalidation();
        
	    SignInPage signIn =new SignInPage(driver);
        signIn.login(UserName, Password);
        signIn.clickLogin(); 
          
        home.getstartedTreeclick();
        objtree = new TreePage(driver);
		       	
		}
				@Test(priority=0)
				public void getOverviewOfTreesLink() {
					objtree.getOverviewOfTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void getTerminologiesLink() {
					objtree.getTerminologiesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=2)
				public void getTypesOfTreesLink() {
					objtree.getTypesOfTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=3)
				public void getTreeTraversalsLink() {
					objtree.getTreeTraversalsLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=4)
				public void getTraversalsIllustrationLink() {
					objtree.getTraversalsIllustrationLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=5)
				public void getBinaryTreesLink() {
					objtree.getBinaryTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=6)
				public void getTypesOfBinaryTreesLink() {
					objtree.getTypesOfBinaryTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=7)
				public void getImplementaionInPythonLink() {
					objtree.getImplementaionInPythonLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=8)
				public void getBinaryTreeTraversalsLink() {
					objtree.getBinaryTreeTraversalsLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=9)
				public void getImplementationOfbinaryTreeLink() {
					objtree.getImplementationOfbinaryTreeLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=10)
				public void getApplicationOfbinaryTreeLink() {
					objtree.getApplicationOfbinaryTreeLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=11)
				public void getBinarySearchTreesLink() {
					objtree.getBinarySearchTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=12)
				public void getImplementationOfBSTLink() {
					objtree.getImplementationOfBSTLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@AfterClass
				public void logout() {
					
					teardown();
				}
}