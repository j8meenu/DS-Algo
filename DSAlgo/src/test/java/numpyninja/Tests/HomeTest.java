package numpyninja.Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.DataStructurePage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;

public class HomeTest  {
	
	WebDriver driver;
	HomePage home;
	DataStructurePage ds;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	@Test(priority=0)
	public void dropdownclick() {
		//Homepage page=new Homepage(driver);
		//		page.dropdown();
		home=new HomePage(driver);
		home.dropdown();
		String actualurl= "https://dsportalapp.herokuapp.com/home";
		String expectedurl="https://dsportalapp.herokuapp.com/home";
				Assert.assertEquals(actualurl, expectedurl);
	   	if(actualurl.equalsIgnoreCase(expectedurl)) { 
	   		System.out.println("you are not logged in"); }
	   	else { System.out.println("you are  logged in"); }
	}
	
//	@Test(priority=1)
//	public void GetStartedValid() {
//		
//		home=new HomePage(driver);
//		home.getstartedclick();
//		
		
	//}
	@Test(priority=1)
	public void DSgetstarted() {
	home=new HomePage(driver);
	home.getstartedDatastructureclick();;
		String actualurl= "https://dsportalapp.herokuapp.com/home";
	String expectedurl="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(actualurl, expectedurl);
   	if(actualurl.equalsIgnoreCase(expectedurl)) { 
   		System.out.println("you are not logged in"); }
   	else { System.out.println("you are  logged in"); }

		
	}
	@Test(priority=2)
	public void Arraygetstarted() {
	home=new HomePage(driver);
	home.getStartedArrayClick();
	}
	
	@Test(priority=3)
	public void linkedListgetstarted() {
	home=new HomePage(driver);
	home.getstartedLinkedlistclick();
	}
	
	@Test(priority=4)
	public void stackGetstarted() {
	home=new HomePage(driver);
	home.getstartedStackclick();
	}
	
	@Test(priority=5)
	public void queueGetstarted() {
	home=new HomePage(driver);
	home.getstartedQueueclick();
	}
	
	@Test(priority=6)
	public void treeGetstarted() {
	home=new HomePage(driver);
	home.getstartedTreeclick();
	}
	
	
	@Test(priority=7)
	public void graphGetstarted() {
	home=new HomePage(driver);
	home.getstartedGraphclick();
	}
	
		
	@Test(priority=8)
	public void SigninValidation() {
		home= new HomePage(driver);
		home.signinvalidation();
		
	}
	@Test(priority=9)
	public void RegisterValidation() {
		home= new HomePage(driver);
		home.registervalidation();
		
	}

}
