package numpyninja.Tests;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.TreePage;
public class TreeTest extends BaseTest{
	    
	TreePage objtree;
	
	@BeforeClass
	public void setUp() throws IOException  {
    	HomePage home= new HomePage(driver);
        home.getstartedTreeclick();
       	       	
		}
				@Test(priority=0)
				public void getOverviewOfTreesLink() {
					 objtree = new TreePage(driver);
					objtree.getOverviewOfTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=1)
				public void getTerminologiesLink() {
					 objtree = new TreePage(driver);
					objtree.getTerminologiesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=2)
				public void getTypesOfTreesLink() {
					 objtree = new TreePage(driver);
					objtree.getTypesOfTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=3)
				public void getTreeTraversalsLink() {
					 objtree = new TreePage(driver);
					objtree.getTreeTraversalsLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=4)
				public void getTraversalsIllustrationLink() {
					 objtree = new TreePage(driver);
					objtree.getTraversalsIllustrationLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=5)
				public void getBinaryTreesLink() {
					 objtree = new TreePage(driver);
					objtree.getBinaryTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=6)
				public void getTypesOfBinaryTreesLink() {
					 objtree = new TreePage(driver);
					objtree.getTypesOfBinaryTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=7)
				public void getImplementaionInPythonLink() {
					 objtree = new TreePage(driver);
					objtree.getImplementaionInPythonLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=8)
				public void getBinaryTreeTraversalsLink() {
					 objtree = new TreePage(driver);
					objtree.getBinaryTreeTraversalsLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=9)
				public void getImplementationOfbinaryTreeLink() {
					 objtree = new TreePage(driver);
					objtree.getImplementationOfbinaryTreeLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=10)
				public void getApplicationOfbinaryTreeLink() {
					 objtree = new TreePage(driver);
					objtree.getApplicationOfbinaryTreeLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=11)
				public void getBinarySearchTreesLink() {
					 objtree = new TreePage(driver);
					objtree.getBinarySearchTreesLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
					driver.navigate().back();
				}
				@Test(priority=12)
				public void getImplementationOfBSTLink() {
					 objtree = new TreePage(driver);
					objtree.getImplementationOfBSTLink();
					objtree.tryeditor();
					String title = driver.getTitle();
			       	assertTrue(true, title);
			       	driver.navigate().back();
			       	driver.navigate().back();
			       	driver.navigate().back();
					
					
				
				}
				@AfterClass
				public void logout() {
					
				}
}