package numpyninja.Tests;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.DataStructurePage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
import numpyninja.Pages.SignInPage;


public class DataStructureTest extends BaseTest {
	
	//WebDriver driver;
	DataStructurePage ds;

	
	@BeforeClass
	public void beforetest() throws IOException {
		
       LandingPage landingPage = this.launchApplication();
	   landingPage.getStarted();
		
	    HomePage home= new HomePage(driver);
	    home.signinvalidation();
        
	    SignInPage signIn =new SignInPage(driver);
        signIn.login(UserName, Password);
        signIn.clickLogin(); 
        
        home.getstartedDatastructureclick();
     }	
		
	@Test(priority=1)
	public void TimeComplexity() {
		
		ds=new DataStructurePage(driver);
		DataStructurePage.TimeComplexityClick();
		String title = driver.getTitle();
       	assertTrue(true, title);
	}
	
	@Test(priority=2)
	public void PracticeQuestion() {
		ds=new DataStructurePage(driver);
		DataStructurePage.PracticeQuestionclick();
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,900)");
	String title = driver.getTitle();
   	assertTrue(true, title);
	}
@Test(priority=3)
public void TryHere() {
	DataStructurePage.tryhereclick();
	String title = driver.getTitle();
   	assertTrue(true, title);
}

@Test(priority=4)
public void TryEditor() {
	DataStructurePage.TryEditorClick();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	String title = driver.getTitle();
   	assertTrue(true, title);
}

@AfterClass
public void logout() {
	
	//teardown();
}

}
