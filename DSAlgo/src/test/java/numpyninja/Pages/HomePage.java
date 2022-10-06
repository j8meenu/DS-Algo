package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.Base.BaseTest;

public class HomePage extends BaseTest  {
	
	 WebDriver driver;
	 RegisterPage registerPage;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Data Structures']")public static  WebElement dropdown;
	@FindBy(xpath="//a[text()='Arrays']")public static WebElement arraybutton;
	@FindBy(xpath="//div[@class='alert alert-primary']")public static WebElement alertmessage;
	@FindBy(xpath="//div[@class='col'][1]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement dataStructuregetStartedbtn;
	@FindBy(xpath="//div[@class='col'][2]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement arraygetstartedbtn;
	@FindBy(xpath="//div[@class='col'][3]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement linkedListgetStarted;
	@FindBy(xpath="//div[@class='col'][4]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement stackGetstaetedbtn;
	@FindBy(xpath="//div[@class='col'][5]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement queueGetstartedbtn;
	@FindBy(xpath="//div[@class='col'][6]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement treeGetstartedbtn;
	@FindBy(xpath="//div[@class='col'][7]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") public static WebElement graphGetstartedbtn;
	@FindBy(xpath="//div[@class='alert alert-primary']")public static WebElement alertmessage1;
	@FindBy(xpath="//a[text()='Sign in']")public static WebElement signinbutton;
	@FindBy(xpath="//a[text()=' Register ']")public static WebElement registerbutton;
	@FindBy(xpath = "//div[contains(text(),'You are not logged in')]")    public static WebElement dtAlertMsg;
	//@FindBy(xpath="//a[@class='navbar-brand']")public static WebElement homebutton;
	//@FindBy(xpath="//button[@class='btn']")public static WebElement getstartedbutton;
	
//	@FindBy(xpath="//div[@class='col'][1]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement DSgetstarted;
	//@FindBy(xpath="//div[@class='col'][2]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement arraygetstartedbtn;
public void dropdown() {
	dropdown.click();
	arraybutton.click();
//String alert= alertmessage.getText();
// System.out.println("Alert:" + alert);
}

public void getstartedDatastructureclick() {
	dataStructuregetStartedbtn.click();

}

public void getStartedArrayClick(){	
 arraygetstartedbtn.click();
	//String alert1=alertmessage1.getText();
	//System.out.println("AlertMessage:" + alert1);
}

public void getstartedLinkedlistclick() {
	linkedListgetStarted.click();

}

public void getstartedStackclick() {
	stackGetstaetedbtn.click();

}
public void getstartedQueueclick() {
	queueGetstartedbtn.click();

}

public void getstartedTreeclick() {
	treeGetstartedbtn.click();

}

public void getstartedGraphclick() {
	
	graphGetstartedbtn.click();

}

public void signinvalidation() {
	signinbutton.click();
	//driver.navigate().back();
	
}
public RegisterPage registervalidation() {
				registerbutton.click();
				
				return new RegisterPage(driver);
		
}	


public boolean dataStructureAlert() {
	
		boolean assertFlag;
		
			if((dtAlertMsg.getText()).equals("You are not logged in") )
			{ 
			 assertFlag = true;  		
			}
			else 
			{ 
			 assertFlag = false;
			}
		
	   return assertFlag;
}


}


