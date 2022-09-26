package numpyninja.Tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.ArrayPage;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.SignInPage;

public class ArrayTest extends BaseTest {
	ArrayPage array;
	HomePage home;
	SignInPage SignIn;
	
	@BeforeClass
	public void beforetest() throws IOException {
		
			initDriver();
	      driver.get(homeUrl);
	}
	
	@Test(priority=0)
	public void introArrayPage() {
	home=new HomePage(driver);
home.signinvalidation();
SignIn=new SignInPage(driver);
	SignIn.login(UserName, Password);
	SignIn.clickLogin();
home.getStartedArrayClick();
String title = driver.getTitle();
	assertTrue(true, title);
}
	
	@Test(priority=1)
	public void ArraysInPythonClick() {
		 array=new ArrayPage(driver);
		 array.ArraysInPython();
		 driver.navigate().back();
			driver.navigate().back();
			String title = driver.getTitle();
		   	assertTrue(true, title);	 
		 }
	
		 

	@Test(priority=2)
	public void ArraysusinglistClick() {
		 array=new ArrayPage(driver);
		 array.Arraysusinglist();
		 driver.navigate().back();
			driver.navigate().back();	
			String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
//
	@Test(priority=3)
	public void BasicoperationsClick() {
		 array=new ArrayPage(driver);
		 array.Basicoperations();
		 driver.navigate().back();
			driver.navigate().back();	
			String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
//	
	@Test(priority=4)
	public void ApplicationofarraysClick() {
		 array=new ArrayPage(driver);
		 array.Applicationofarrays();
		 
		 driver.navigate().back();
		 String title = driver.getTitle();
		   	assertTrue(true, title);
				 
		 }
//
//
	@Test(priority=5)
	public void PracticequestionsClick() {
		 array=new ArrayPage(driver);
		 array.Practicequestions();
		 String title = driver.getTitle();
		   	assertTrue(true, title);
		
		 }
//	
	@Test(priority=6)
	public void SearchTheArrayClick() {
		 array=new ArrayPage(driver);
		 array.SearchTheArray();
		 driver.navigate().back();	
		 String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
	
	@Test(priority=7)
	public void MaxConsecutiveOnesClick() {
		 array=new ArrayPage(driver);
		 array.MaxConsecutiveOnes();
		 driver.navigate().back();	
		 String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
	
	@Test(priority=8)
	public void FindNumbersClick() {
		 array=new ArrayPage(driver);
		 array.FindNumbers();
		 driver.navigate().back();
		 String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
	
	@Test(priority=9)
	public void SquaresTabClick() {
		 array=new ArrayPage(driver);
		 array.SquaresTab();
		 driver.navigate().back();
		 driver.navigate().back();
		 driver.navigate().back();
		 driver.navigate().back();
		 String title = driver.getTitle();
		   	assertTrue(true, title);
		 }
	@AfterClass
	public void logout() {
		
		SignIn.clicklogout();
		driver.quit();
	}

	}


