package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod2
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		 WebElement maleRadioButton = driver.findElement(By.xpath("//label[text() = 'Male']/..//input[@name = 'sex']"));
		 maleRadioButton.click();		
		
	}

}
