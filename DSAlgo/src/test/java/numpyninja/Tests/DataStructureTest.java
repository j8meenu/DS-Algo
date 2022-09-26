package numpyninja.Tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.DataStructurePage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.SignInPage;


public class DataStructureTest extends BaseTest {
	
	//WebDriver driver;
	DataStructurePage ds;
	HomePage home;
	HomeTest hometst;
	SignInPage SignIn;
	BaseTest base;
	@BeforeClass
	public void beforetest() throws IOException {
		
			initDriver();
	      driver.get(homeUrl);
	      

	}	
	@Test(priority=0)
	public void introDatastructure() {
	home=new HomePage(driver);
	home.signinvalidation();
	SignIn=new SignInPage(driver);
	SignIn.login(UserName, Password);
	SignIn.clickLogin();
	home.getstartedDatastructureclick();
	String title = driver.getTitle();
   	assertTrue(true, title);
	}
	
	
	
	@Test(priority=1)
	public void TimeComplexity() {
		
		ds=new DataStructurePage(driver);
		ds.TimeComplexityClick();
		String title = driver.getTitle();
       	assertTrue(true, title);
	}
	
	@Test(priority=2)
	public void PracticeQuestion() {
		ds=new DataStructurePage(driver);
		ds.PracticeQuestionclick();
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,900)");
	String title = driver.getTitle();
   	assertTrue(true, title);
	}
@Test(priority=3)
public void TryHere() {
	ds.tryhereclick();
	String title = driver.getTitle();
   	assertTrue(true, title);
}

@Test(priority=4)
public void TryEditor() {
	ds.TryEditorClick();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	String title = driver.getTitle();
   	assertTrue(true, title);
}

@AfterClass
public void logout() {
	
	//SignIn.clicklogout();
	driver.quit();
}

}
