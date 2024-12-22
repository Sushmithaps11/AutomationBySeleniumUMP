package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

//getCssValue method
public class ColorVerification
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    WebElement	loginButton = driver.findElement(By.name("login"));
	    String backgroundColorOfLoginbutton = loginButton.getCssValue("background-color");
        System.out.println(backgroundColorOfLoginbutton);
       String convertedColor = Color.fromString(backgroundColorOfLoginbutton).asHex();
       System.out.println(convertedColor);
       //font-family
      String fontfamilyOfLoginButton = loginButton.getCssValue("font-family");
      System.out.println(fontfamilyOfLoginButton);
		
	}

}
