package numpyninja.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import numpyninja.Base.BaseTest;

public class DataStructurePage extends BaseTest{
	  WebDriver driver;
	 
	public DataStructurePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='col'][1]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement DSgetstarted;
	@FindBy(xpath="//a[@class='list-group-item']")public static WebElement timecomplexitybtn;
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")public static WebElement practicequestbtn;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebtn;
	//@FindBy(xpath="//div[@class='code-area']//div[@class='CodeMirror cm-s-default']//div[@style='overflow: hidden; position: relative; width: 3px; height: 0px; top: 4px; left: 34px;']")public static WebElement tryeditor;
	@FindBy(xpath="//textarea[@tabindex='0']")public static WebElement codetextarea;
	@FindBy(xpath="//button[@type='button']")public static WebElement runbtn;
	
	//driver.navigate().back();

//	public static void Datastructure() {
//
//		try {
//			
//			JavascriptExecutor js=(JavascriptExecutor)driver; 
//			js.executeScript("window.scrollBy(0,900)");
//		}catch(Exception e) {
//			System.out.println("Exception caught" + e.getMessage());
//		}
//	}

		public static void TimeComplexityClick() {
			timecomplexitybtn.click();
		}
		public static void PracticeQuestionclick() {
			practicequestbtn.click();
					
			//driver.navigate().back();
		}
		public static void tryhereclick() {
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,900)");
			tryherebtn.click();
		}
		public static void TryEditorClick() {
			//pythoncode.click();
			codetextarea.sendKeys("print('Hello World')");
			runbtn.click();
			//driver.navigate().back();
			
			
		}


	

}
