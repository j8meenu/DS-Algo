package numpyninja.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.LandingPage;


public class BaseTest {
	
	private WebDriver driver;
	private String browserName;
	public String expectedTitleLandingPage = "NumpyNinja";
	
	public WebDriver initDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//numpyninja//Resources//Properties.properties");
		prop.load(fis);
		browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else
		{
			System.out.println("browser not installed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public LandingPage launchApplication() throws IOException {
		driver = initDriver();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}
	

}
