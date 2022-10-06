package numpyninja.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	WebDriver driver;
	 
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='col'][2]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") WebElement arraygetstartedbtn;
	@FindBy(xpath="//a[text()='Arrays in Python']") WebElement arraysinpython;
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryherebutton;
	@FindBy(xpath="//a[text()='Arrays Using List']") WebElement arraysusinglistbtn;
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryherebtn1;
	@FindBy(xpath="//a[text()='Basic Operations in Lists']") WebElement basicoperationsbtn;
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryherebtn2;
	@FindBy(xpath="//a[text()='Applications of Array']") WebElement applicationofarraysbtn;
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryherebtn3;
	@FindBy(xpath="//a[text()='Practice Questions']") WebElement practicequestionstab;
	@FindBy(xpath="//a[text()='Search the array']") WebElement searchthearray;
	@FindBy(xpath="//a[text()='Max Consecutive Ones']") WebElement maxconsecutiveones;
	@FindBy(xpath="//a[text()='Find Numbers with Even Number of Digits']") WebElement findnumbers;
	@FindBy(xpath="//a[text()='Squares of  a Sorted Array']") WebElement squarestab;
	@FindBy(xpath="//textarea[@tabindex='0']") WebElement codetextarea;
	@FindBy(xpath="//button[@type='button']") WebElement RunBtn;
	
	public void Arraygetstarted() {
		arraygetstartedbtn.click();
	}
public void ArraysInPython() {
	arraysinpython.click();
	tryherebutton.click();
	codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}

public void Arraysusinglist() {
	arraysusinglistbtn.click();
	tryherebtn1.click();
	codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}
public void Basicoperations() {
	basicoperationsbtn.click();
	tryherebtn2.click();
	codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}
public void Applicationofarrays() {
	applicationofarraysbtn.click();
	tryherebtn3.click();
	codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}

public void Practicequestions() {
	practicequestionstab.click();
	
}

public void SearchTheArray() {
	searchthearray.click();
	codetextarea.sendKeys(Keys.CONTROL + "a");
	codetextarea.sendKeys(Keys.DELETE);
		codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}

public void MaxConsecutiveOnes() {
	maxconsecutiveones.click();
	codetextarea.sendKeys(Keys.CONTROL + "a");
	codetextarea.sendKeys(Keys.DELETE);
		codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}

public void FindNumbers() {
	findnumbers.click();
	codetextarea.sendKeys(Keys.CONTROL + "a");
	codetextarea.sendKeys(Keys.DELETE);
		codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}

public void SquaresTab() {
	squarestab.click();
	codetextarea.sendKeys(Keys.CONTROL + "a");
	codetextarea.sendKeys(Keys.DELETE);
		codetextarea.sendKeys("print('Hello World')");
	RunBtn.click();
}


}

