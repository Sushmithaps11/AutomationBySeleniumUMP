package com.webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiggerTheURL 
{
	public static void main(String[] args)
	{
		//create the browser object 
		// Constructor overloading
		WebDriver driver = new ChromeDriver();
		//Trigger the URL
		
		
		driver.get("https://www.selenium.dev/");
		
	}

}
