package numpyninja.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.Base.BaseTest;

public class GenericClass {
	//public static WebDriver driver;
	
	
//	public  void initialize() throws IOException  {
//		initDriver();
//  		driver.get(loginUrl);     
//	}
		
//		 WebDriverManager.chromedriver().setup();
//		    driver= new ChromeDriver();
//						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.manage().window().maximize();
//			driver.get("https://dsportalapp.herokuapp.com/login");

	
	
//	public void FailedScreenshot(String testMethodName) {
//		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Date d = new Date();
//		String TimeStamp=d.toString().replace(":", "_").replace(" ", "_");
//		try {
//			FileUtils.copyFile(srcFile, new File("C:\\Users\\bv250\\gitrepository\\DS-Algo\\DSAlgo" + 
//			testMethodName + "_" + TimeStamp + ".png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
