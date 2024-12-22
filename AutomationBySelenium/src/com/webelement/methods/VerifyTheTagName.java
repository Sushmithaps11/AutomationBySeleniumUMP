package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName 
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	String loginButtonTagName = loginButton.getTagName();
	
	if(loginButtonTagName.equals("button"))
	{
		System.out.println("Login Button is made of Button tag");
	}
	else
	{
		System.out.println("Login Button is not made of Button tag");
	}

}
}
