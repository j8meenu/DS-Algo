package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Data Structures']")public static  WebElement dropdown;
	@FindBy(xpath="//a[text()='Arrays']")public static WebElement arraybutton;
	@FindBy(xpath="//div[@class='alert alert-primary']")public static WebElement alertmessage;
	@FindBy(xpath="//div[@class='col'][2]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement arraygetstarted;
	@FindBy(xpath="//div[@class='alert alert-primary']")public static WebElement alertmessage1;
	@FindBy(xpath="//a[text()='Sign in']")public static WebElement signinbutton;
	@FindBy(xpath="//a[@class='navbar-brand']")public static WebElement homebutton;
	@FindBy(xpath="//button[@class='btn']")public static WebElement getstartedbutton;
	@FindBy(xpath="//a[text()=' Register ']")public static WebElement registerbutton;
	

public static void dropdown() {

try {
	dropdown.click();
	arraybutton.click();
String alert= alertmessage.getText();
 System.out.println("Alert:" + alert);
	arraygetstarted.click();
	String alert1=alertmessage1.getText();
	System.out.println("AlertMessage:" + alert1);
	signinbutton.click();
	homebutton.click();
	getstartedbutton.click();
			registerbutton.click();
	
	
}catch(Exception e) {
	System.out.println("Exception caught" + e.getMessage());
}

}

}
