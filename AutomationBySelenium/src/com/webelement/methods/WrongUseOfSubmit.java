package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUseOfSubmit
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		WebElement createAccLink = driver.findElement(By.linkText("FIND FOOD"));
		createAccLink.submit();
		//createAccLink.click();
		
		
		//One Exception - java.lang.UnsupportedOperationException
		//If any one codition not matches means we will get this it coming from java.lang package which is Runtime exception
		// for this we can use click() to solve this problem
		
	}

}
