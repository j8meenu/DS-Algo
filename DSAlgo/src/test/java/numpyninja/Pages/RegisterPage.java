package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.Base.BaseTest;

public class RegisterPage extends BaseTest {
	 WebDriver driver;
	
	 @FindBy(xpath ="//input[@type='submit']")
    WebElement RegisterBtn;
    
    @FindBy(id ="id_username")  WebElement UserName;
    
    @FindBy(id ="id_password1")  WebElement Password;
     
    @FindBy(id = "id_password2")  WebElement ConfirmPassword;
      
    @FindBy(xpath = "//div[contains(text(),'password_mismatch:')]")  WebElement alertMsg;
      
    @FindBy(xpath ="//div[contains(text(),'New Account Created.')]")  WebElement registerAlert;
    
    public RegisterPage(WebDriver driver) {
	 		
	 		this.driver = driver;
	 		PageFactory.initElements(driver, this);
	 	}
  
    public void RegisterButtton() {
   	
   	 RegisterBtn.click();
    }

    public void EmptyPassword(String Uname) {
   	
   	 UserName.sendKeys(Uname);
   	 UserName.clear();
    }
    public void EmptyConfirmPassword(String Uname, String Pass) {
   	 
   	 UserName.sendKeys(Uname);
   	 UserName.clear();
   	 Password.sendKeys(Pass);
   	 Password.clear();
    }
    public void DiffPassword(String Uname, String Pass, String ConPass) {
   	
   	 UserName.sendKeys(Uname);
   	 //UserName.clear();
   	 Password.sendKeys(Pass);
   	 //Password.clear();
   	 ConfirmPassword.sendKeys(ConPass); 
   	// ConfirmPassword.clear();
     }
    public void Register(String Uname, String Pass, String ConPass) {
   	
   	 UserName.sendKeys(Uname);
  	     Password.sendKeys(Pass);
  	     ConfirmPassword.sendKeys(ConPass);
   	 
    }
    public String validationMessage() {
   	 
   	 String UserErrorMsg = UserName.getAttribute("validationMessage");
   	 return UserErrorMsg;

    }
    public String alertMessage(String msgtype) {
   	 
   	 String alert = null;
   	 if (msgtype =="passmismatch")
   	 {
   	 alert = alertMsg.getText();
   	 System.out.println("alert : "+alert);
   	 }
   	 else if (msgtype =="accountcreated")
   	 {
   		 alert = registerAlert.getText();
       	 System.out.println("alert : "+alert);
   	 }
   	 
   	 return alert;
    } 
   
    
}

