package com.selenium.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Implicit Wait 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	WebElement emailOrTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
	emailOrTextField.sendKeys("ump@gmail.com");
	WebElement passwordTextField = driver.findElement(By.name("pass"));
	passwordTextField.sendKeys("20002");
	driver.manage().window().minimize();
	driver.quit();

}
}
