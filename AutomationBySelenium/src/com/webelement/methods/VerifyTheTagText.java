package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagText 
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?privacy_')]"));
     String forgotPasswordLinkTagText = forgotPasswordLink.getText();
     
     if(forgotPasswordLinkTagText.equals("Forgotten password?"))
     {
    	 System.out.println("Pass : Tag Text is verified and found correct");
     }
     else
     {
    	 System.out.println("Pass : Tag Text is verified and found incorrect");
     }
}
}
