package numpyninja.Resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import numpyninja.Base.BaseTest;

public class listnerclass extends BaseTest {
	
	@BeforeTest
	public void beforeTest() throws IOException {
		initDriver();
		driver.get(baseUrl);
	
	}
	@Test
	public void f() throws IOException {
		takeSnapShot("SnapShot", driver);
}

		

	 
 public static void takeSnapShot(String fileName, WebDriver driver) throws IOException {
		//TakesScreenshot scrShot=((TakeScreenshot)driver);
		File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen3.png"));
		}

@AfterTest
public void aftertest() {
	driver.quit();
}
 
 
 
 
 
 
 
 
 
 //	 @Override
//	    public void onTestFailure(ITestResult result) {
//	    	System.out.println("***** Error "+result.getName()+" test has failed *****");
//	    	String methodName=result.getName().toString().trim();
//	        ITestContext context = result.getTestContext();
//	       WebDriver driver = (WebDriver)context.getAttribute("driver");
//	       try {
//			takeSnapShot(methodName, driver);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    }

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //	private static String getTestMethodName(ITestResult iTestResult) {
//		return iTestResult.getMethod().getConstructorOrMethod().getName();
//	}
//	
//	@Attachment
//	public byte[]saveFailureScreenShot(WebDriver driver){
//		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//	}
//	
//	@Attachment(value= "{0}",type="text/plain")
//	public static String saveTextLog(String message) {
//		return message;
//	}
//	
//	@Override  
//	public void onTestStart(ITestContext itestcontext) {  
//	// TODO Auto-generated method stub  
//		System.out.println("I am in onTestStart method" +itestcontext.getName());
//		itestcontext.setAttribute("WebDriver", BaseTest.getDriver());
//	}  
//	  
//	@Override  
//	public void onTestSuccess(ITestResult result) {  
//	// TODO Auto-generated method stub  
//	System.out.println("Success of test cases and its details are : "+result.getName());  
//	}  
//	  
//	@Override  
//	public void onTestFailure(ITestResult result) {  
//	// TODO Auto-generated method stub  
//	System.out.println("Failure of test cases and its details are : "+result.getName());  
//	}  
//	  
//	@Override  
//	public void onTestSkipped(ITestResult result) {  
//	// TODO Auto-generated method stub  
//	System.out.println("Skip of test cases and its details are : "+result.getName());  
//	}  
//	  
//	@Override  
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
//	// TODO Auto-generated method stub  
//	System.out.println("Failure of test cases and its details are : "+result.getName());  
//	}  
	  
	 
	 

	

