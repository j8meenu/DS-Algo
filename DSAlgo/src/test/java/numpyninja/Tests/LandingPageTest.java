package numpyninja.Tests;



import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.LandingPage;

public class LandingPageTest extends BaseTest {
	
	
	//private Object expectedTitleLandingPage;

	@Test
	public void goToPage() throws IOException {
				
		LandingPage landingPage = this.launchApplication();
		landingPage.getStarted();
		assertEquals(landingPage.getTitle(), "NumpyNinja");
		
	}
	@AfterTest
	public void logout() {
		
		//SignIn.clicklogout();
		driver.quit();
	}}
