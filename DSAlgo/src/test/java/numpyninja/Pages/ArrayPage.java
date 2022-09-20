package numpyninja.Pages;

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
	
	@FindBy(xpath="//div[@class='col'][2]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")public static WebElement arraygetstartedbtn;
	@FindBy(xpath="//a[text()='Arrays in Python']")public static WebElement arraysinpython;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebutton;
	@FindBy(xpath="//a[text()='Arrays Using List']")public static WebElement arraysusinglistbtn;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebtn1;
	@FindBy(xpath="//a[text()='Basic Operations in Lists']")public static WebElement basicoperationsbtn;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebtn2;
	@FindBy(xpath="//a[text()='Applications of Array']")public static WebElement applicationofarraysbtn;
	@FindBy(xpath="//a[@class='btn btn-info']")public static WebElement tryherebtn3;
	@FindBy(xpath="//a[text()='Practice Questions']")public static WebElement practicequestionstab;
	@FindBy(xpath="//a[text()='Search the array']")public static WebElement searchthearray;
	@FindBy(xpath="//a[text()='Max Consecutive Ones']")public static WebElement maxconsecutiveones;
	@FindBy(xpath="//a[text()='Find Numbers with Even Number of Digits']")public static WebElement findnumbers;
	@FindBy(xpath="//a[text()='Squares of  a Sorted Array']")public static WebElement squarestab;
	
	public static void Arraygetstarted() {
		arraygetstartedbtn.click();
	}
public static void Arraysinpython() {
	arraysinpython.click();
	tryherebutton.click();
}

public static void Arraysusinglist() {
	arraysusinglistbtn.click();
	tryherebtn1.click();
}
public static void Basicoperations() {
	basicoperationsbtn.click();
	tryherebtn2.click();
}
public static void Applicationofarrays() {
	applicationofarraysbtn.click();
	tryherebtn3.click();
}

public static void Practicequestions() {
	practicequestionstab.click();
	
}



}

