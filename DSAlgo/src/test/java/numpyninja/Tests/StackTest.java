package numpyninja.Tests;

import java.io.IOException;

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
      	stackPage.tryHereLinkBtn();
      }
      @Test(priority=1)
      public void implementation() 
      {
          stackPage.implementationBtn();
          stackPage.tryHereLinkBtn();
      }
      @Test(priority=2)
      public void applications() 
      {
          stackPage.applicationsBtn();
          stackPage.tryHereLinkBtn();
      }
      @Test(priority=3)
      public void practiceQuestion1() 
      {
          stackPage.practiceQuestionBtn();
          
      }
      
} 
