package numpyninja.Resources;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

import numpyninja.Base.BaseTest;

public class listnerclass extends BaseTest implements ITestListener {
	
	
	public void beforeTest() throws IOException {
		initDriver();
		
			}	
	

 
	public void FailedScreenshot(String testMethodName) throws IOException {
		
		
		
		File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));

				
}
 
 
    public void onTestFailure(ITestResult result)
    {
   	System.out.println(" test has failed *****");
try
{
FailedScreenshot(result.getName());
}
catch(Exception e)
{
	e.printStackTrace();
}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //    @AfterTest
//    public void aftertest() {
//    	driver.quit();
//    }




    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  //Date d = new Date();
  //String TimeStamp=d.toString().replace(":", "_").replace(" ", "_");
  //FileUtils.copyFile(srcFile, new File("C:\\Users\\bv250\\gitrepository\\DS-Algo\\DSAlgo\\srcshot\\screenshot" + testMethodName + "_" + TimeStamp
//  		+ ".png"));
    
    
    
    
    
    //File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
  		//try {
  			//FileUtils.copyFile(srcFile, new File("C:\\Users\\bv250\\gitrepository\\DS-Algo\\DSAlgo" + 
  			//testMethodName + "_" + TimeStamp + ".png"));
  		//} catch (IOException e) {
  			// TODO Auto-generated catch block
  			//e.printStackTrace();
    
    
    
    
    
    
    
    
    
    
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//}
//@Test
//public void f() throws IOException {
//	takeSnapShot("SnapShot", driver);
//}
//
//	
//
// 
//public static void takeSnapShot(String fileName, WebDriver driver) throws IOException {
//	//TakesScreenshot scrShot=((TakeScreenshot)driver);
//	File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen3.png"));
//	}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
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
	  
	 
	 

	

