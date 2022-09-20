package numpyninja.Tests;

<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> 466bc3b924ea5f80d7992feec4715bcaa6d1a8aa
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
<<<<<<< HEAD
import numpyninja.Pages.HomePage;
=======
import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LandingPage;
>>>>>>> 466bc3b924ea5f80d7992feec4715bcaa6d1a8aa

public class HomeTest  {
	
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
