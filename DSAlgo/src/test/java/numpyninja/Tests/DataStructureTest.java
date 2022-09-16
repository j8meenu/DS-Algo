package numpyninja.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.DataStructurePage;


public class DataStructureTest {
	
	WebDriver driver;
	DataStructurePage pagefactory;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	@Test
	public void dropdownclick() {
		
		pagefactory=new DataStructurePage(driver);
		pagefactory.Datastructure();
	}

}
