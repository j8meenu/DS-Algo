package numpyninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

	WebDriver driver;
	
	
	public TreePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement getStartedTreeBtn;
	
	@FindBy(xpath="//a[@href='overview-of-trees']")
	WebElement overviewOfTreesLink;
	
	@FindBy(xpath="//a[@href='terminologies']")
	WebElement terminologiesLink;
	
	@FindBy(xpath="//a[@href='types-of-trees']")
	WebElement typesOfTreesLink;
	
	@FindBy(xpath="//a[@href='tree-traversals']")
	WebElement treeTraversalsLink;
	
	@FindBy(xpath="//a[@href='traversals-illustration']")
	WebElement traversalsIllustrationLink;
	
	@FindBy(xpath="//a[@href='binary-trees']")
	WebElement binaryTreesLink;
	
	@FindBy(xpath="//a[@href='types-of-binary-trees']")
	WebElement typesOfBinaryTreesLink;
	
	@FindBy(xpath="//a[@href='implementation-in-python']")
	WebElement implementaionInPythonLink;
	
	@FindBy(xpath="//a[@href='binary-tree-traversals']")
	WebElement binaryTreeTraversalsLink;
	
	@FindBy(xpath="//a[@href='implementation-of-binary-trees']")
	WebElement implementationOfbinaryTreeLink;
	
	@FindBy(xpath="//a[@href='applications-of-binary-trees']")
	WebElement applicationOfbinaryTreeLink;
	
	@FindBy(xpath="//a[@href='binary-search-trees']")
	WebElement binarySearchTreesLink;
	
	@FindBy(xpath="//a[@href='implementation-of-bst']")
	WebElement implementationOfBSTLink;
	
	
	
	
	public void getGetStartedTreeBtn() {
		 getStartedTreeBtn.click();
	}

	
	public WebElement getOverviewOfTreesLink() {
		return overviewOfTreesLink;
	}

	public void setOverviewOfTreesLink(WebElement overviewOfTreesLink) {
		this.overviewOfTreesLink = overviewOfTreesLink;
	}

	public WebElement getTerminologiesLink() {
		return terminologiesLink;
	}

	public void setTerminologiesLink(WebElement terminologiesLink) {
		this.terminologiesLink = terminologiesLink;
	}

	public WebElement getTypesOfTreesLink() {
		return typesOfTreesLink;
	}

	public void setTypesOfTreesLink(WebElement typesOfTreesLink) {
		this.typesOfTreesLink = typesOfTreesLink;
	}

	public WebElement getTreeTraversalsLink() {
		return treeTraversalsLink;
	}

	public void setTreeTraversalsLink(WebElement treeTraversalsLink) {
		this.treeTraversalsLink = treeTraversalsLink;
	}

	public WebElement getTraversalsIllustrationLink() {
		return traversalsIllustrationLink;
	}

	public void setTraversalsIllustrationLink(WebElement traversalsIllustrationLink) {
		this.traversalsIllustrationLink = traversalsIllustrationLink;
	}

	public WebElement getBinaryTreesLink() {
		return binaryTreesLink;
	}

	public void setBinaryTreesLink(WebElement binaryTreesLink) {
		this.binaryTreesLink = binaryTreesLink;
	}

	public WebElement getTypesOfBinaryTreesLink() {
		return typesOfBinaryTreesLink;
	}

	public void setTypesOfBinaryTreesLink(WebElement typesOfBinaryTreesLink) {
		this.typesOfBinaryTreesLink = typesOfBinaryTreesLink;
	}

	public WebElement getImplementaionInPythonLink() {
		return implementaionInPythonLink;
	}

	public void setImplementaionInPythonLink(WebElement implementaionInPythonLink) {
		this.implementaionInPythonLink = implementaionInPythonLink;
	}

	public WebElement getBinaryTreeTraversalsLink() {
		return binaryTreeTraversalsLink;
	}

	public void setBinaryTreeTraversalsLink(WebElement binaryTreeTraversalsLink) {
		this.binaryTreeTraversalsLink = binaryTreeTraversalsLink;
	}

	public WebElement getImplementationOfbinaryTreeLink() {
		return implementationOfbinaryTreeLink;
	}

	public void setImplementationOfbinaryTreeLink(WebElement implementationOfbinaryTreeLink) {
		this.implementationOfbinaryTreeLink = implementationOfbinaryTreeLink;
	}

	public WebElement getApplicationOfbinaryTreeLink() {
		return applicationOfbinaryTreeLink;
	}

	public void setApplicationOfbinaryTreeLink(WebElement applicationOfbinaryTreeLink) {
		this.applicationOfbinaryTreeLink = applicationOfbinaryTreeLink;
	}

	public WebElement getBinarySearchTreesLink() {
		return binarySearchTreesLink;
	}

	public void setBinarySearchTreesLink(WebElement binarySearchTreesLink) {
		this.binarySearchTreesLink = binarySearchTreesLink;
	}

	public WebElement getImplementationOfBSTLink() {
		return implementationOfBSTLink;
	}

	public void setImplementationOfBSTLink(WebElement implementationOfBSTLink) {
		this.implementationOfBSTLink = implementationOfBSTLink;
	}

	
}
