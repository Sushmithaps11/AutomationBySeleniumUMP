package com.selenium.activeelements;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataOnActiveElements 
{
	public static void main(String[] args) throws IOException 
	{	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("India");
	
	}
}
