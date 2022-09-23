package numpyninja.Tests;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.RegisterPage;

public class ResisterTest extends BaseTest {
	
	 RegisterPage Reg;  
	 
	 String diffconfirmpass = "ninja@70";
	 String sameconfirmpass = "ninja@90";
	    
	    @BeforeTest
		public void setUp() throws IOException 
	    {
	           initDriver();
	           driver.get(registerUrl);
	    } 	    
	    
	    @Test(priority = 0)
        public void RegisterWithEmptyField()  {
	   
			System.out.println("Executing RegisterPageTest");
        	Reg =new RegisterPage(driver);
        	Reg.RegisterButtton();
       	 	assertEquals(Reg.validationMessage(), "Please fill out this field.");
        }
        @Test(priority = 1)
        public void EmptyPasswordTest() {
             Reg.EmptyPassword(UserName);
             Reg.RegisterButtton(); 
             assertEquals(Reg.validationMessage(), "Please fill out this field.");
        }
        @Test(priority = 2)
        public void EmptyConfirmPassword() {
        	Reg.EmptyConfirmPassword(UserName,Password);
        	Reg.RegisterButtton();
        	assertEquals(Reg.validationMessage(), "Please fill out this field.");
        }
        
        
        @Test(priority = 3)
        public void DiffPassword() throws InterruptedException {
        	Reg =new RegisterPage(driver);
        	Reg.DiffPassword(UserName,Password,diffconfirmpass);
        	Reg.RegisterButtton();
        	String alert= Reg.alertMessage("passmismatch");
        	assertEquals(alert, "password_mismatch:The two password fields didn’t match.");
        
        }   
        
         
     /*   @Test(priority = 4)
       public void Register() {
        	Reg.Register(UserName,Password,sameconfirmpass);
        	Reg.RegisterButtton();
        	String login = Reg.alertMessage("accountcreated");
        	assertEquals(login,"New Account Created. You are logged in as "+UserName); 	
        	
        }  */


        
}