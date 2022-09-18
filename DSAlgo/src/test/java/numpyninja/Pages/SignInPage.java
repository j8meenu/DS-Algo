package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	@FindBy(id ="id_username")  WebElement uid;
    @FindBy(id ="id_password")  WebElement pwd;
@FindBy(xpath ="//input[@type='submit']") WebElement LoginButton;;
@FindBy(xpath="//a[contains(text(),'Sign out')]") WebElement Logout;
 
public SignInPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public void setUserName(String strUserName){

    uid.sendKeys(strUserName);
}

public void setPassword(String strPassword){
   pwd.sendKeys(strPassword);
}

public void clickLogin(){
       LoginButton.click();
}
public void clicklogout() {
	Logout.click();
}
public String nousername() {
  	 
	String textbox = uid.getAttribute("validationMessage");
  	 return textbox;
   }
public String nopwd(String Uname) {
   	 uid.sendKeys(Uname);
  	 uid.clear();
  	String pwdtextbox = pwd.getAttribute("validationMessage");
 	 return pwdtextbox;
   }
public void login(String strUserName,String strPassword){
    uid.sendKeys(strUserName);
    pwd.sendKeys(strPassword);     
    //this.clickLogin(); 
    }

}
