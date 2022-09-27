package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	HomePage homePage;

	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartedButton;
	
	public void goTo() {
		
		driver.get("https://dsportalapp.herokuapp.com/");
		
	}
	
	public HomePage getStarted() {
		//Clicking on Button get Started
		getStartedButton.click();
		return homePage;
	
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
