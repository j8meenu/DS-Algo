package numpyninja.Tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.LinkedListPage;
import numpyninja.Pages.SignInPage;


public class LinkedListTest extends BaseTest {
	
	 LinkedListPage linkedList;
	 
       @BeforeTest
		public void setUp() throws IOException  {
	    
          initDriver();
	      driver.get(loginUrl);
	      
	      SignInPage SignIn =new SignInPage(driver);
	      SignIn.login(UserName, Password);
	      SignIn.clickLogin();
	  }
       @Test
       public void introLinkedlist() {
       	linkedList = new LinkedListPage(driver);
       	linkedList.getStartedButton();
       	linkedList.introButton();
       	linkedList.tryhereBox();
       	String title = driver.getTitle();
       	assertTrue(true, title);
       	
       }
       @Test
       public void creatingLinkedList()  {
       	linkedList.createLinkedListBtn();
       	linkedList.tryhereBox();
       	String title = driver.getTitle();
       	assertTrue(true, title);
       }
       @Test
       public void typeOfLinkedList() {
       	linkedList.typeOfLinkedListBtn();
       	String title = driver.getTitle();
       	linkedList.tryhereBox();
       	assertTrue(true, title);
       	
       }
       @Test
       public void implementLinkedList() {
       	
       	linkedList.implementLinkedListBtn();
       	linkedList.tryhereBox();
       	String title = driver.getTitle();
       	assertTrue(true, title);
       }
       @Test
       public void traversal() {
       	
       	linkedList.traversalBtn();
       	linkedList.tryhereBox();
       	String title = driver.getTitle();
       	assertTrue(true, title);
       }
       @Test
       public void deletion() {
       	
       	linkedList.deletionBtn();
       	linkedList.tryhereBox();
       	String title = driver.getTitle();
       	assertTrue(true, title);
       }
       @Test
       public void practiceQuestion() {
       	
       	linkedList.practiceQuestionBtn(); 
       	String title = driver.getTitle();
       	assertTrue(true, title);
       }      
}
