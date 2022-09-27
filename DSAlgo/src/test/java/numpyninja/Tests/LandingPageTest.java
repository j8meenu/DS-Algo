package numpyninja.Tests;



import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.LandingPage;

public class LandingPageTest extends BaseTest {


	@Test
	public void goToPage() throws IOException {
				
		LandingPage landingPage = this.launchApplication();
		landingPage.getStarted();
		assertEquals(landingPage.getTitle(), "NumpyNinja");
		
	}
	@AfterClass
    public void browserclose() {
		 
    	teardown();
    }

}