package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrtUseOfSubmit 
//For using Submit() Element shd fulfill 3 conditions
//1- Element shd be under <form> tag
//2- Element shd be written under button/input tag
//3- Element type shd be submit/button

{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.submit();
		
	}

}
