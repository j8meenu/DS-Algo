package numpyninja.Tests;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.HomePage;
import numpyninja.Pages.LinkedListPage;
import numpyninja.Pages.SignInPage;


public class LinkedListTest extends BaseTest {
	
	 LinkedListPage linkedList;
	 HomePage homePage;
	 
        @BeforeTest
		public void setUp() throws IOException  {
	    
          initDriver();
	      driver.get(loginUrl);
	      SignInPage SignIn =new SignInPage(driver);
	      SignIn.login(UserName, Password);
	      SignIn.clickLogin();  
	      homePage= new HomePage(driver);
	      homePage.getstartedLinkedlistclick();     
	  }
        @Test(priority = 0)
        public void introLinkedlist()  {
        	
        	linkedList = new LinkedListPage(driver);
        	//linkedList.getStartedButton();
        	linkedList.introButton();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Introduction");
        	linkedList.tryhereBox();        	
        }
        @Test(priority =1)
        public void creatingLinkedList()  {
        	linkedList.createLinkedListBtn();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Creating Linked LIst");
        	linkedList.tryhereBox();
        }
        @Test(priority=2)
        public void typeOfLinkedList() {
        	linkedList.typeOfLinkedListBtn();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Types of Linked List");
        	linkedList.tryhereBox();
        }
        @Test(priority=3)
        public void implementLinkedList() {
        	linkedList.implementLinkedListBtn();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Implement Linked List in Python");
        	linkedList.tryhereBox();
        }
        @Test(priority=4)
        public void traversal() {
        	
        	linkedList.traversalBtn();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Traversal");
        	linkedList.tryhereBox();
        }
        @Test(priority=5)
        public void deletion() {
        	
        	linkedList.deletionBtn();
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Deletion");
        	linkedList.tryhereBox();
        }
        @Test(priority=6)
        public void practiceQuestion() throws InterruptedException {
        	
        	linkedList.practiceQuestionBtn(); 
        	String title = driver.getTitle();
        	Assert.assertEquals(title,"Practice Questions");
        }   
         
}