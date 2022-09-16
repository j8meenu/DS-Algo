package numpyninja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {

	public WebDriver driver;
	
	public QueuePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	public void getstartedqueue(){
		WebElement queuelink = driver.findElement(By.xpath("//a[@href='queue']"));
		queuelink.click();
        }
	public void impqueuebypython(){
		WebElement impqueuebypythonlink = driver.findElement(By.xpath("//a[@href='implementation-lists']"));
		impqueuebypythonlink.click();
        }
	public void tryeditor(){
		WebElement tryeditorlink = driver.findElement(By.xpath("//a[@href='/tryEditor']"));
		tryeditorlink.click();
        }
	public void impusingcollectionsdeque(){
		WebElement collectionsdeque = driver.findElement(By.xpath("//a[@href='implementation-collections']"));
		collectionsdeque.click();
        }
	public void impusingarray(){
		WebElement arraylink = driver.findElement(By.xpath("//a[@href='Implementation-array']"));
		arraylink.click();
        }
	public void queueoperations(){
		WebElement queueoperations = driver.findElement(By.xpath("//a[@href='QueueOp']"));
		queueoperations.click();
        }
	public void practice(){
		WebElement practicequestions = driver.findElement(By.xpath("//a[@href='/queue/practice']"));
		practicequestions.click();
        }
}