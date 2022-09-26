package numpyninja.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("meenu18");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dsalgo123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		homePage.getstartedTreeclick();
		//treePage.getGetStartedTreeBtn();
		
	}
	
	
}
