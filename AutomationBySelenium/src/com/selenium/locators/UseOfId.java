package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfId 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//email
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("Ump");
		Thread.sleep(2000);
		
		//password
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("123456");
		Thread.sleep(2000);
		
		//login button
		//NoSuchElementException - from selenium(we will get because of address is wrong or Id is dynamic)
		//It is Runtime unchecked exception
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
	}

}
