package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.Base.BaseTest;

public class LinkedListPage extends BaseTest  {

	 WebDriver driver;
	 
	 public LinkedListPage(WebDriver driver) {
		 
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath ="//div[3]/div[3]/div//a")      WebElement getStartedBtn;
	 @FindBy(linkText = "Introduction")            WebElement introduction;
	 @FindBy(xpath="//a[@href='/tryEditor']")      WebElement tryHereLink;
	 @FindBy(xpath = "//textarea[@tabindex='0']")  WebElement codeTextArea;
	 @FindBy(xpath = "//button")                   WebElement runButton;
	 @FindBy(linkText ="Creating Linked LIst")     WebElement creatingLinkedList;
	 @FindBy(linkText = "Types of Linked List")    WebElement typeOfLinkedList;
	 @FindBy(linkText = "Implement Linked List in Python") WebElement implementLinkedList;
	 @FindBy(linkText = "Traversal")     WebElement traversal;
	 @FindBy(linkText = "Insertion")     WebElement insertion;
	 @FindBy(linkText ="Deletion")       WebElement deletion;
	 @FindBy(linkText ="Practice Questions")   WebElement practiceQuestion;
	 @FindBy(xpath = "//div[@class='col-sm']//a") WebElement practQuesTryHereLink;
	 
	 public void getStartedButton()
	 {
	    getStartedBtn.click();
	 }
	 public void introButton() 
	 {
		 introduction.click();
	 }
	 public void tryhereBox() 
	 {
		 tryHereLink.click();
		 codeTextArea.sendKeys("print('Hello World')");
		 runButton.click();
	 }
	 public void createLinkedListBtn() 
	 {
		 driver.navigate().back();
		 creatingLinkedList.click();
	 }
	 public void typeOfLinkedListBtn() {
		 
		 driver.navigate().back();
		 typeOfLinkedList.click();
	 }
	 public void implementLinkedListBtn() {
		 driver.navigate().back();
		 implementLinkedList.click();
	 }
	 public void traversalBtn() {
		 driver.navigate().back();
		 traversal.click();
	 }
	 public void insertionBtn() {
		 driver.navigate().back();
		 insertion.click();
	 }
	 public void deletionBtn() {
		 driver.navigate().back();
		 deletion.click();
	 }
	 public void practiceQuestionBtn() {
		 driver.navigate().back();
		 practiceQuestion.click();	 
		 
	 }
	 
}

