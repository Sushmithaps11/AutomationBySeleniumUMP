package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	Thread.sleep(2000);
	WebElement emailOrPhoneTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
	int emailStartY = emailOrPhoneTextField.getLocation().getY();
	System.out.println("emailStartY = " + emailStartY);
	
	WebElement passwordTextField = driver.findElement(By.name("pass"));
	int passwordStartY = passwordTextField.getLocation().getY();
	System.out.println("passwordStartY = " +passwordStartY);
	
	if(emailStartY == passwordStartY)
	{
		System.out.println("Pass : Top Alignment is Verified and found correct");
	}
	else
	{
		System.out.println("Fail : Top Alignment is Verified and found incorrect");
	}

}
}
