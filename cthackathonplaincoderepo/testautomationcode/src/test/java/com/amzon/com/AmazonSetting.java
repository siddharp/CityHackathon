package com.amzon.com;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSetting {
	
	public static void main (String [] args ) throws Exception
	
	{
		
		
		// Setting Syetem properties
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		
		// Initailzing Chrome Driver
		WebDriver oDriver = new ChromeDriver();
		
		
		//1 . Hit URL 
		oDriver.get("http://amazon.com/");
		
		
		//Collection of XPATH
		
		WebElement sTexTDRiver = oDriver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		WebElement sEnterSearchBox = oDriver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input"));
		//*[@id="nav-search"]/form/div[2]/div/input
		
		
		//Search with "Computer Speakers"
		sTexTDRiver.sendKeys("Computer speakers");
		
		//Click on SearchBitton
		sEnterSearchBox.click();
		
		WebElement sListItemsr = oDriver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		
		sListItemsr.click();
		
		
		//_Logic to fetch all records______________________________________________________
		
		By sEBList =   By.xpath("//h2");
		List <WebElement> sElementtext = oDriver.findElements(sEBList);
		int iCount= 0 ;
		
		 ArrayList array = new ArrayList();
                for(WebElement se : sElementtext) {
        	  System.out.println(se.getText());
        	  iCount++ ;
        	         	  

             
  			try (BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\train\\Desktop\\testFile"));)
  			{
  			    String line;
  			    while ((line=br.readLine())!=null)
  			        array.add(se.getText());
  			    
  			    System.out.println("text 1"+se.getText());
  			} catch (IOException e) {
  			    e.printStackTrace();
  			}
        	  
        	}
                System.out.println("Total Record Count"+ iCount)  ;
              
           

		WebElement sSelectItemr = oDriver.findElement(By.xpath("//*[contains(text(),'Z200 with Stereo Sound for Multiple Devices')]"));
		sSelectItemr.click();
		
		Thread.sleep(20);
		WebElement sAddToCart = oDriver.findElement(By.xpath("//*[@id='add-to-cart-button-ubb']"));
				
		sAddToCart.click();
		
		
		
		WebElement sCheckOut = oDriver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
		sCheckOut.click();
		
	//WebElement noCoverage = oDriver.findElement(By.xpath("//*[@id='siNoCoverage-announce']"));
		
	//noCoverage.click();
		
	}
	
	

}

