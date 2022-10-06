package numpyninja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

	public WebDriver driver;
	@FindBy(xpath = "//textarea[@tabindex='0']")  WebElement codeTextArea;
	 @FindBy(xpath = "//button")                   WebElement runButton;
	
	public TreePage(WebDriver driver) {
			 
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 
	public void tryeditor(){
		WebElement tryeditorlink = driver.findElement(By.xpath("//a[@href='/tryEditor']"));
		tryeditorlink.click();
		codeTextArea.sendKeys("print('Hello World')");
		 runButton.click();
        }
	public void getGetStartedTreeBtn() {
		WebElement getStartedTreeBtn = driver.findElement(By.xpath("//a[@href='tree']"));
		getStartedTreeBtn.click();
			}

	public void getOverviewOfTreesLink() {
		WebElement OverviewOfTreesLink = driver.findElement(By.xpath("//a[@href='overview-of-trees']"));
		OverviewOfTreesLink.click();
	}

	public void getTerminologiesLink() {
		driver.navigate().back();
		WebElement terminologiesLink = driver.findElement(By.xpath("//a[@href='terminologies']"));
		terminologiesLink.click();
	}

	public void getTypesOfTreesLink() {
		driver.navigate().back();
		WebElement typesOfTreesLink = driver.findElement(By.xpath("//a[@href='types-of-trees']"));
		typesOfTreesLink.click();
	}

	public void getTreeTraversalsLink() {
		driver.navigate().back();
		WebElement treeTraversalsLink = driver.findElement(By.xpath("//a[@href='tree-traversals']"));
		treeTraversalsLink.click();
	}

	
	public void getTraversalsIllustrationLink() {
		driver.navigate().back();
		WebElement traversalsIllustrationLink = driver.findElement(By.xpath("//a[@href='traversals-illustration']"));
		traversalsIllustrationLink.click();
	}

		public void getBinaryTreesLink() {
			driver.navigate().back();
			WebElement binaryTreesLink = driver.findElement(By.xpath("//a[@href='binary-trees']"));
			binaryTreesLink.click();
	}

	public void getTypesOfBinaryTreesLink() {
		driver.navigate().back();
		WebElement typesOfBinaryTreesLink = driver.findElement(By.xpath("//a[@href='types-of-binary-trees']"));
		typesOfBinaryTreesLink.click();
	}

		public void getImplementaionInPythonLink() {
			driver.navigate().back();
			WebElement implementaionInPythonLink = driver.findElement(By.xpath("//a[@href='implementation-in-python']"));
			implementaionInPythonLink.click();
	}

	public void getBinaryTreeTraversalsLink() {
		driver.navigate().back();
		WebElement binaryTreeTraversalsLink = driver.findElement(By.xpath("//a[@href='binary-tree-traversals']"));
		binaryTreeTraversalsLink.click();
	}

	public void getImplementationOfbinaryTreeLink() {
		driver.navigate().back();
		WebElement ImplementationOfbinaryTreeLink = driver.findElement(By.xpath("//a[@href='implementation-of-binary-trees']"));
		ImplementationOfbinaryTreeLink.click();
	}

	public void getApplicationOfbinaryTreeLink() {
		driver.navigate().back();
		WebElement applicationOfbinaryTreeLink = driver.findElement(By.xpath("//a[@href='applications-of-binary-trees']"));
		applicationOfbinaryTreeLink.click();
	}

	public void getBinarySearchTreesLink() {
		driver.navigate().back();
		WebElement binarySearchTreesLink = driver.findElement(By.xpath("//a[@href='binary-search-trees']"));
		binarySearchTreesLink.click();
	}

	public void getImplementationOfBSTLink() {
		driver.navigate().back();
		WebElement implementationOfBSTLink = driver.findElement(By.xpath("//a[@href='implementation-of-bst']"));
		implementationOfBSTLink.click();
	}

	
	
}