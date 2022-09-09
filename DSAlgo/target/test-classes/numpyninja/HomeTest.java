package numpyninja.Tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.HomePage;

public class HomeTest {
	WebDriver driver;
	HomePage pagefactory;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	@Test
	public void dropdownclick() {
		//Homepage page=new Homepage(driver);
		//		page.dropdown();
		pagefactory=new HomePage(driver);
		pagefactory.dropdown();
	}
	
	

}
