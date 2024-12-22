package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	int emailWidth = emailTextField.getRect().getWidth();
	int emailStartX = emailTextField.getRect().getX();
	int emailEndPoint = emailWidth + emailStartX;
	System.out.println("emailEndPoint = " + emailEndPoint);
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	int passwordWidth = passwordTextField.getRect().getWidth();
	int passwordStartX = passwordTextField.getRect().getWidth();
	int passwordEndPoint = passwordWidth + passwordStartX;
	System.out.println("passwordEndPoint = "+ passwordEndPoint);
	
	if(emailEndPoint == passwordEndPoint)
	{
		System.out.println("Pass : Right Alignment is Verified and found correct");
	}
	else
	{
		System.out.println("Fail : Right Alignment is Verified and found incorrect");
	}

}
}
