package numpyninja.Tests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Pages.QueuePage;
import numpyninja.Pages.SignInPage;
public class QueueTest {
	WebDriver driver;
	 SignInPage SignIn;
	 QueuePage objqueue;
	 String Uname = "Nenyarajesh";
	 String Upwd ="Pinky1213";
	 	@BeforeTest
		public void queue() {
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://dsportalapp.herokuapp.com/login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				SignIn.login("Nenyarajesh","Pinky1213");
		       	SignIn.clickLogin();
		       objqueue.getstartedqueue();
		       	
		}
				@Test(priority=0)
				public void impqueuebypython() {
					objqueue.impqueuebypython();
					objqueue.tryeditor();
				}
				@Test(priority=1)
				public void impusingcollectionsdeque() {
					objqueue.impusingcollectionsdeque();
					objqueue.tryeditor();
				}
				@Test(priority=2)
				public void impusingarray() {
					objqueue.impusingarray();
					objqueue.tryeditor();
				}
				@Test(priority=3)
				public void queueoperations() {
					objqueue.queueoperations();
					objqueue.tryeditor();
				}
				@Test(priority=4)
				public void practicequestions() {
					//objqueue.getstartedqueue();
					objqueue.impqueuebypython();
					objqueue.practice();
				}
}
