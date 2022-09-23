package numpyninja.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.LandingPage;
import numpyninja.util.ReadConfig;

public class BaseTest {
	
	ReadConfig readConfig = new ReadConfig();
	public String baseUrl =readConfig.getApplication();
	public String UserName = readConfig.getUserName();
	public String Password = readConfig.getPassword();
	public String loginUrl = readConfig.getLoginUrl();
	public String homeUrl = readConfig.gethomeUrl();
	public String registerUrl = readConfig.getregisterUrl();
		
		public WebDriver driver;
		private String browserName;
		
		public WebDriver initDriver() throws IOException {
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\numpyninja\\Resources\\config.properties");
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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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

