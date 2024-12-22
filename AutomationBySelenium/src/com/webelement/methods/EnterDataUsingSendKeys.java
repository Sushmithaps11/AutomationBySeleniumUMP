package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataUsingSendKeys
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 Thread.sleep(2000);
		 WebElement usernameTextfield = driver.findElement(By.id("username"));
		 usernameTextfield.clear();
		 Thread.sleep(2000);
		 usernameTextfield.sendKeys("admin");
		 Thread.sleep(2000);
		 WebElement pwdTextfield = driver.findElement(By.id("password"));
		 pwdTextfield.clear();
		 Thread.sleep(2000);
		 pwdTextfield.sendKeys("admin");
		 Thread.sleep(2000);
		 WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		 signInButton.submit();
		 Thread.sleep(2000);
		 driver.manage().window().minimize();
		 driver.quit();
		 
	}

}
