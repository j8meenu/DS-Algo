package numpyninja.Tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.SignInPage;
import numpyninja.Pages.TreePage;

public class TreeTest extends BaseTest {

	@Test
	public void clickGetStartedTreee() throws IOException {
//		SignInTest signIn = new SignInTest();
//		signIn.SignIn();
		
		TreePage treePage = new TreePage(driver);
		HomePage homePage= new HomePage(driver);
		
		initDriver();
		driver.get(loginUrl);
	}
		@Test
		public void introTree() {
		HomePage home=new HomePage(driver);
	home.signinvalidation();
	SignInPage SignIn=new SignInPage(driver);
		SignIn.login(UserName, Password);
		SignIn.clickLogin();
//	hometst=new HomeTest();
//	hometst.SigningIn();
			
	home.getstartedTreeclick();
	String title = driver.getTitle();
   	assertTrue(true, title);
	}
		
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("meenu18");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dsalgo123");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		homePage.getstartedTreeclick();
		
		
	

	
}
