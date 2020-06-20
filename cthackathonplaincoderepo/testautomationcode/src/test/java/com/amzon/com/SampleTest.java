package com.amzon.com;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ExecutionListener.class)
public class SampleTest {
    @Test(description = "login")
    public void login() throws InterruptedException{
    	System.out.println("Hello");
    	Thread.sleep(9000);

    }
    
    @Test(description = "search for flights", dependsOnMethods = "login")
    public void search() throws InterruptedException{
    	
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
