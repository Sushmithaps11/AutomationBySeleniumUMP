package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		int startXOfEmail = emailTextField.getLocation().getX();
		System.out.println("startXOfEmail = " + startXOfEmail);
		 WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	     int startXOfPassword = passwordTextField.getLocation().getX();
	     System.out.println("startXOfPassword = " + startXOfPassword);
	     
	     if(startXOfEmail == startXOfPassword)
	     {
	    	 System.out.println("Pass : Left Alignment is verified and found correct");
	     }
	     else
	     {
	    	 System.out.println("Fail : Left Alignment is verified and found incorrect"); 
	     }
}
}
