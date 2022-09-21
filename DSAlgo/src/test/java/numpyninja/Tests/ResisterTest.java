package numpyninja.Tests;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Base.BaseTest;
import numpyninja.Pages.RegisterPage;


public class ResisterTest extends BaseTest {
	
	 WebDriver driver;
	 RegisterPage Reg;  
		
	 String user = "Varsha15";
	 String pass = "ninja@30";
	 String diffconfirmpass = "ninja@45";
	 String sameconfirmpass = "ninja@30";
	    
	   @BeforeTest
		public void beforeTest()  {
	    
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  } 
       @Test(priority = 0)
       public void RegisterWithEmptyField() {
       	Reg =new RegisterPage(driver);
       	Reg.RegisterButtton();
      	 	assertEquals(Reg.validationMessage(), "Please fill out this field.");
       }
       @Test(priority = 1)
       public void EmptyPasswordTest() {
       	 Reg =new RegisterPage(driver);
            Reg.EmptyPassword(user);
            Reg.RegisterButtton(); 
            assertEquals(Reg.validationMessage(), "Please fill out this field.");
       }
       @Test(priority = 2)
       public void EmptyConfirmPassword() {
       	Reg =new RegisterPage(driver);
       	Reg.EmptyConfirmPassword(user,pass);
       	Reg.RegisterButtton();
       	assertEquals(Reg.validationMessage(), "Please fill out this field.");
       }
       @Test(priority = 3)
       public void DiffPassword() {
       	Reg =new RegisterPage(driver);
       	Reg.DiffPassword(user,pass,diffconfirmpass);
       	Reg.RegisterButtton();
       	String alert= Reg.alertMessage("passmismatch");
       	assertEquals(alert, "password_mismatch:The two password fields didn’t match.");
       }   
       @Test(priority = 4)
       public void Register() {
       	Reg =new RegisterPage(driver);
       	Reg.Register(user,pass,sameconfirmpass);
       	Reg.RegisterButtton();
       	String login = Reg.alertMessage("accountcreated");
       	assertEquals(login,"New Account Created. You are logged in as "+user);     	
       }     
}
