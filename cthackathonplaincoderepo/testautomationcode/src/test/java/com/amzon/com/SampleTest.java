package com.amzon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ExecutionListener.class)
public class SampleTest {
    @Test(description = "Challenge1")
    public void login() throws InterruptedException{
    	System.out.println("Hello");
    	  System.setProperty("webdriver.chrome.driver","C:\\Work\\DriverExes\\chromedriver.exe");
    		 ChromeDriver oDriver = new ChromeDriver();
    		 ChromeDriver oDriver1 = new ChromeDriver();
    		  
    	      oDriver.get("https://cpsatexam.org/");
    	      oDriver.manage().window().maximize();
    	     
    	      oDriver.findElement(By.xpath("//*[@id=\"menu-primary-spacious\"]/li[1]/a")).click();
    	      oDriver.findElement(By.xpath("//*[@id=\"menu-item-207\"]/a")).click();
    	      oDriver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-298\"]/div[2]/i")).click();
    	      
    	      for (int i = 1; i < 6; i++) 
  			{
    	     String Element = "//*[@id=\"elementor-tab-title-217"+i+"\"]" ;
    	          	      
    	      oDriver.findElement(By.xpath(Element)).click();
    	      String Element2 = "//*[@id=\"elementor-tab-content-217"+i+"\"]/p[2]" ;
  	  	   
    	      String mytext = oDriver.findElement(By.xpath(Element2)).getText();

    	      oDriver1.get("https://translate.google.co.in/");
    	      oDriver1.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys(mytext);
    	      Thread.sleep(9000);
    	      String PrintText =oDriver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]/span")).getText();
    	      System.out.println("Printing Translated Text:==> "+PrintText);
    	     
    	 	             
    			}
    	      
    	      
    	     
    	    
    	      
    	      
    	 	Thread.sleep(9000);
    	 	oDriver.close();
    	 	
    	 	

    }
    
    @Test(description = "search for flights", dependsOnMethods = "login")
    public void search() throws InterruptedException{
    	System.out.println("Hello");
  	  System.setProperty("webdriver.chrome.driver","C:\\Work\\DriverExes\\chromedriver.exe");
  		 ChromeDriver oDriver = new ChromeDriver();
  		  
  		  
  	      oDriver.get("https://cpsatexam.org/");
  	      oDriver.manage().window().maximize();
  	      
  	      oDriver.findElement(By.xpath("//*[@id=\"menu-primary-spacious\"]/li[1]/a")).click();
  	      oDriver.findElement(By.xpath("//*[@id=\"menu-item-208\"]/a")).click();
  	      
  	    for (int i = 1; i < 11; i++) 
			{
  	    	
  	    	String piElement="//*[@id="+"post-177"+"]/div/div/div/div/div/section[1]/div/div/div["+i+"]/div/div/div[1]/div/div/a/img";
  	    	
  	    	
  	    	oDriver.findElement(By.xpath(piElement)).click();
  	        	   
 	              
		}
  	      
    	
    	Thread.sleep(9000);

    }

    @Test(description = "select flight", dependsOnMethods = "search")
    public void select(){

    }

    @Test(description = "book flight", dependsOnMethods = "select")
    public void book() throws InterruptedException{
    	Thread.sleep(15000);
    }

    @Test(description = "logout", dependsOnMethods = "book")
    public void logout() throws InterruptedException{
Thread.sleep(8900);
    }
    @Test(description = "search for tide", dependsOnMethods = "login")
    public void searching(){

    }

    @Test(description = "select new flight", dependsOnMethods = "search")
    public void selecting(){

    }
    
}
