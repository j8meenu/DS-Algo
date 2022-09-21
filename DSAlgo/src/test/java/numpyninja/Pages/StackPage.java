package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.Base.BaseTest;


public class StackPage extends BaseTest {
	
	 WebDriver driver;
		 
		 public StackPage(WebDriver driver) {
			 
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
	     
		 @FindBy(xpath = "//div[4]//div/a")           WebElement getStarted;
		 @FindBy(linkText = "Operations in Stack")    WebElement OperationInStack;
		 @FindBy(xpath="//a[@href='/tryEditor']")      WebElement tryHereLink;
		 @FindBy(xpath = "//textarea[@tabindex='0']")  WebElement codeTextArea;
		 @FindBy(xpath = "//button")                   WebElement runButton;
		 @FindBy(linkText = "Implementation")          WebElement implementation;
		 @FindBy(linkText = "Applications")            WebElement application;
		 @FindBy(linkText = "Practice Questions")      WebElement practiceQuestions;
		 
		 public void getStartedBtn() {
			
			 getStarted.click();
		 }
		 public void OperationInStackBtn() {
			 OperationInStack.click();
		 }
		 public void tryHereLinkBtn() {
			 tryHereLink.click();
			 codeTextArea.sendKeys("print('Hello World')");
			 runButton.click();
		 }
		 public void implementationBtn() {
			 driver.navigate().back();
			 implementation.click();
		 }
		 public void applicationsBtn() {
			 driver.navigate().back();
			 application.click();
		 }
		 public void practiceQuestionBtn() {
			 driver.navigate().back();
			 practiceQuestions.click();
		 }
		 
	}