package numpyninja.Tests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.GraphPage;
import numpyninja.Pages.SignInPage;

public class GraphTest {
	WebDriver driver;
	
	GraphPage objGraph;
	SignInPage SignIn;
	
      @BeforeTest
		public void Graph() {
    	  WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
	    driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				SignIn =new SignInPage(driver);
				SignIn.login("Nenyarajesh","Pinky1213");
		       	SignIn.clickLogin();
		       	objGraph =new GraphPage(driver);
		       objGraph.getstartedgraph();
		       	
		}
				@Test(priority=0)
				public void graphtopic() {
					objGraph.graphtopic();
					objGraph.tryeditor();
					driver.navigate().back();
				}
				@Test(priority=1)
				public void graphRep() {
					objGraph.graphRep();
					objGraph.tryeditor();
					driver.navigate().back();
				}
				
				@Test(priority=2)
				public void practicequestions() {
					objGraph.graphRep();
					objGraph.practice();
					
				}
				@AfterTest
				public void logout() {
					SignIn.clicklogout();
					driver.quit();
				}
}