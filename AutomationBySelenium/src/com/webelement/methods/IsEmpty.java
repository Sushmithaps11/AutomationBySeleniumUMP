package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEmpty 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 Thread.sleep(2000);
		 WebElement usernameTextfield = driver.findElement(By.id("username"));
		 String usernameValue = usernameTextfield.getAttribute("value");
		 System.out.println(usernameValue);
		 
		 if(usernameValue.isEmpty())
		 {
			 usernameTextfield.sendKeys("ADMIN");
		 }
		 else
		 {
			 usernameTextfield.clear();
			 Thread.sleep(2000);
			 usernameTextfield.sendKeys("ADMIN");
			 Thread.sleep(2000);
		 }
		
	}

}
