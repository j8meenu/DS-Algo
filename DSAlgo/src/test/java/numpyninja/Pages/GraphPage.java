package numpyninja.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {

	public WebDriver driver;
	@FindBy(xpath = "//textarea[@tabindex='0']")  WebElement codeTextArea;
	 @FindBy(xpath = "//button")                   WebElement runButton;
	
	public GraphPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	public void getstartedgraph(){
		WebElement graphlink = driver.findElement(By.xpath("//a[@href='graph']"));
		graphlink.click();
        }
	public void graphtopic(){
		 //driver.navigate().back();
		WebElement graphtopiclink = driver.findElement(By.xpath("//a[@href='graph']"));
		graphtopiclink.click();
        }
	public void tryeditor(){
		WebElement tryeditorlink = driver.findElement(By.xpath("//a[@href='/tryEditor']"));
		tryeditorlink.click();
		codeTextArea.sendKeys("print('Hello World')");
		 runButton.click();
        }
	public void graphRep(){
		driver.navigate().back();
		WebElement graphReplink = driver.findElement(By.xpath("//a[@href='graph-representations']"));
		graphReplink.click();
        }
	public void practice(){
		WebElement practicequestions = driver.findElement(By.xpath("//a[@href='/graph/practice']"));
practicequestions.click();
}
}