package numpyninja.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.SignInPage;
import numpyninja.Pages.StackPage;

public class StackTest  extends BaseTest {

	StackPage stackPage;

	@BeforeTest
	public void setUp() throws IOException  {
    
      initDriver();
      driver.get(loginUrl);
      
        SignInPage SignIn =new SignInPage(driver);
        SignIn.login(UserName, Password);
        SignIn.clickLogin();
  }
	
	  @Test(priority=0)
      public void OperationInStack() 
      {
		stackPage = new StackPage(driver);
      	stackPage.getStartedBtn();
      	stackPage.OperationInStackBtn();
      	String title = driver.getTitle();
    	Assert.assertEquals(title,"Operations in Stack");
      	stackPage.tryHereLinkBtn();
      }
      @Test(priority=1)
      public void implementation() 
      {
          stackPage.implementationBtn();
          String title = driver.getTitle();
      	  Assert.assertEquals(title,"Implementation");
          stackPage.tryHereLinkBtn();
      }
      @Test(priority=2)
      public void applications() 
      {
          stackPage.applicationsBtn();
          String title = driver.getTitle();
      	  Assert.assertEquals(title,"Applications");
          stackPage.tryHereLinkBtn();
      }
      @Test(priority=3)
      public void practiceQuestion1() 
      {
          stackPage.practiceQuestionBtn();
          String title = driver.getTitle();
      	  Assert.assertEquals(title,"Practice Questions");
      }
        
      
} 