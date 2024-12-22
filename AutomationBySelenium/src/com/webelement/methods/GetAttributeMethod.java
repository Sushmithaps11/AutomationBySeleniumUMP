package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		 String emailPlaceHolder= emailTextField.getAttribute("placeholder");
		 System.out.println(emailPlaceHolder);
	}

}
