package numpyninja.Tests;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Pages.SignInPage;
import numpyninja.util.ExcelReader;

public class SignInTest {
	
	 WebDriver driver;
	 SignInPage SignIn;  
	 @BeforeTest		  
		public void SignIn()  {
	    
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
	    driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  } 
			 @Test
			       public void dslogin() {
			    	   SignIn =new SignInPage(driver);
			    	   String xl = "./src/test/resources/Excel/SignInTest.xlsx";
			           String Sheet = "Login";
			          int rowCount = 5;
			          String Uname = ""; 
			          String Upwd = "";
			            for (int i=1;i<=rowCount;i++)
			            {
			                  	
				                        Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
				                        System.out.println("the username==" +Uname);
				                        Upwd=ExcelReader.getCellValue(xl, Sheet, i, 1);
				                        System.out.println("the password==" +Upwd);
				                        
				                        if(Uname==null) {
				                        	Uname="";
				                        	SignIn =new SignInPage(driver);
				                        	SignIn.nousername();
					                        SignIn.clickLogin();
					                        assertEquals(SignIn.nousername(), "Please fill out this field.");
					                        System.out.println("no username");
				                        	  }
			
				                        else if(Upwd==null) {
						                        	Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
							                        System.out.println("the username==" +Uname);
								            		//Upwd = "";
								            		SignIn=new SignInPage(driver);
								            		SignIn.nopwd(Uname);
								            		SignIn.clickLogin();
								            		assertEquals(SignIn.nopwd(Uname), "Please fill out this field.");
								            		System.out.println("no pwd");
								            	
						                        }
				                        
				                        	
				                        
			                SignIn =new SignInPage(driver);
			                Uname=ExcelReader.getCellValue(xl, Sheet, i, 0);
	                        Upwd=ExcelReader.getCellValue(xl, Sheet, i, 1);
	                        SignIn.login(Uname, Upwd);
	                        SignIn.clickLogin();
	                        
}

			 }
			 

@AfterTest
public void logout() {
	
	SignIn.clicklogout();
	driver.quit();
}}
			 