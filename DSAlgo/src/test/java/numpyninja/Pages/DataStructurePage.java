package numpyninja.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {
	 static WebDriver driver;
	 
	public DataStructurePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='col'][1]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement DSgetstarted;
	@FindBy(xpath="//a[@class='list-group-item']")public static WebElement timecomplexitybtn;
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")public static WebElement practicequestbtn;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebtn;
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']")public static WebElement tryeditor;
	@FindBy(xpath="//button[@type='button']")public static WebElement runbtn;
	
	//driver.navigate().back();

	public static void Datastructure() {

		try {
			DSgetstarted.click();
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("window.scrollBy(0,900)");
//			timecomplexitybtn.click();
//			practicequestbtn.click();
//					
//			driver.navigate().back();
//			js.executeScript("window.scrollBy(0,900)");
//			tryherebtn.click();
//			tryeditor.sendKeys("Print Hello");
//			runbtn.click();
//			driver.navigate().back();
//			
			
			
		}catch(Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}

		}

	

}
