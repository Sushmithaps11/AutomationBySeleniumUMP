package com.selenium.synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadCheck 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		try 
		{
		  driver.get("https://www.flipkart.com/");	
		}
		catch (TimeoutException e)
		{
			System.out.println("This application is not having the capacity to load the webpage within the specified time");
			
		}
		
	}

}
