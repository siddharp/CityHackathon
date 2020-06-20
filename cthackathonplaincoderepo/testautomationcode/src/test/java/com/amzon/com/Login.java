package com.amzon.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;


@Listeners(ExecutionListener.class)
public class Login {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  String oBrowser = "Chrome";
	  WebDriver oDriver = null ;
	  String sWebURL = "https://www.amazon.in/" ;
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  
	
	  
	  if (oBrowser == "Chrome" )
		  {
				oDriver = new ChromeDriver();
				oDriver.get(sWebURL);
								  
		  }
	  else if (oBrowser== "Firefox")
			  
		  {
				oDriver= new FirefoxDriver();  
				oDriver.get(sWebURL); 
		  }
	  
	  else if (oBrowser== "IE")
		  
	  	{
		  oDriver = new InternetExplorerDriver();
		  oDriver.get(sWebURL);
	  	}
	  
	  oDriver.close();
	   
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
