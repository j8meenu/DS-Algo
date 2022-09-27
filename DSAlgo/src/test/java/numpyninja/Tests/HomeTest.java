package numpyninja.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;


public class HomeTest extends BaseTest {
	
	//WebDriver driver;
	HomePage home;
	
	@BeforeClass
	public void beforetest() throws IOException {
		LandingPage landingPage = this.launchApplication();
		home = landingPage.getStarted();
	
	}

	@Test(priority=1)
	public void dropdownclick() {
		
		home=new HomePage(driver);
		home.dropdown();
		String title = driver.getTitle();
    	Assert.assertEquals(title,"NumpyNinja");
	}
	
	@Test(priority=2)
	public void DSgetstarted() {
	     
		home=new HomePage(driver);
	    home.getstartedDatastructureclick();
	    Assert.assertTrue(home.dataStructureAlert());
	}
	/*
	@Test(priority=3)
	public void Arraygetstarted() {
	home=new HomePage(driver);
	home.getStartedArrayClick();
	}
	
	@Test(priority=4)
	public void linkedListgetstarted() {
	home=new HomePage(driver);
	home.getstartedLinkedlistclick();
	}
	
	@Test(priority=5)
	public void stackGetstarted() {
	home=new HomePage(driver);
	home.getstartedStackclick();
	}
	
	@Test(priority=6)
	public void queueGetstarted() {
	home=new HomePage(driver);
	home.getstartedQueueclick();
	}
	
	@Test(priority=7)
	public void treeGetstarted() {
	home=new HomePage(driver);
	home.getstartedTreeclick();
	}
	
	
	@Test(priority=8)
	public void graphGetstarted() {
	home=new HomePage(driver);
	home.getstartedGraphclick();
	}
	*/
		
	@Test(priority=9)
	public void SigninValidation() {
		home= new HomePage(driver);
		home.signinvalidation(); 
		
	}
	@Test(priority=10)
	public void RegisterValidation() {
		home= new HomePage(driver);
		home.registervalidation();
		//driver.navigate().back();
	}
	
	@AfterClass
	public void logout() {
		
		//SignIn.clicklogout();
		teardown();
	}
}



























//initDriver();
		//driver.get(homeUrl);



//String actualurl= "https://dsportalapp.herokuapp.com/data-structures-introduction/";
//String expectedurl="https://dsportalapp.herokuapp.com/home";
//		Assert.assertEquals(actualurl, expectedurl);


//	if(actualurl.equalsIgnoreCase(expectedurl)) { 
//	System.out.println("you are not logged in"); }
//else { System.out.println("you are  logged in"); }



//@Test(priority=11)
//public void SigningIn() {
//	home=new HomePage(driver);
//home.signinvalidation();
//SignIn=new SignInPage(driver);
//	SignIn.login(UserName, Password);
//	SignIn.clickLogin();
//}
//@Listeners({listnerclass.class})


