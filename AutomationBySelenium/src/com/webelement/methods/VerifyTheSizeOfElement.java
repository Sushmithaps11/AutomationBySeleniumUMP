package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSizeOfElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
        int emailHeight = emailTextField.getSize().getHeight();
        System.out.println("emailHeight = " + emailHeight);
        int emailWidth = emailTextField.getSize().getWidth();
        System.out.println("emailWidth = " + emailWidth);
        WebElement passwordTextField = driver.findElement(By.id("passContainer"));
        int passwordHeight = passwordTextField.getSize().getHeight();
        System.out.println("passwordHeight = " + passwordHeight);
        int passwordWidth = passwordTextField.getSize().getWidth();
        System.out.println("passwordWidth = " + passwordWidth );
        
        
        if(emailHeight == passwordHeight && emailWidth == passwordWidth)
        {
        	System.out.println("Pass: The email and password textfield size is verified and found correct");
        }
        else
        {
        	System.out.println("Fail: The email and password textfield size is verified and found incorrect");
        }
        driver.manage().window().minimize();
        driver.quit();
}
}