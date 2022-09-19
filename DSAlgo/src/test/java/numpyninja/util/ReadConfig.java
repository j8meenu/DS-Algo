package numpyninja.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src =new File("src//test//java//numpyninja//Resources//config.properties");
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
		    System.out.println("Exception is"+e.getMessage());
		}
	}
	 public String getApplication() {
	    String url = pro.getProperty("baseUrl");
		return url;
		
	}
	 public String getChromePath() {
		 String browser =pro.getProperty("Browser");
		 return browser;
	 }
	 public String getUserName() {
		 String Uname = pro.getProperty("UserName");
		 return Uname;
	 }
	 public String getPassword() {
		 String Pass =pro.getProperty("Password");
		 return Pass;
	 }
	 public String getLoginUrl() {
		 String loginUrl= pro.getProperty("loginUrl");
		 return loginUrl;
	 }
	 public String gethomeUrl() {
		 String homeUrl= pro.getProperty("homeUrl");
		 return homeUrl;
	 }
	 public String getregisterUrl() {
		 String registerUrl= pro.getProperty("registerUrl");
		 return registerUrl;
	 }
	
}
