package numpyninja.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import numpyninja.Base.BaseTest;
import numpyninja.Pages.LandingPage;

public class LandingPageTest extends BaseTest {
	
	@Test
	public void goToPage() throws IOException {
		
		LandingPage landingPage = launchApplication(); 
		landingPage.getStarted();
		
	}
	
	
}
