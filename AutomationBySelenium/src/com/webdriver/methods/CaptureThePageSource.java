package com.webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureThePageSource 
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String facebookLoginPageSource = driver.getPageSource();
	System.out.println(facebookLoginPageSource);
	
	if(facebookLoginPageSource.contains("Facebook helps you connect and share with the people in your life."))
	{
		System.out.println("The expected text is present");
	}
	else
	{
		System.out.println("The expected text is not present");
	}

}
}
