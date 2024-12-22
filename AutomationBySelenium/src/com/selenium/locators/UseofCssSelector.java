package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseofCssSelector 
{
   public static void main(String[] args) throws InterruptedException
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement emailorphonetextfield  = driver.findElement(By.cssSelector("input[placeholder ='Email address or phone number']"));
	emailorphonetextfield.sendKeys("abc@gmail.com");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
   }
}
