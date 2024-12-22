package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAbscuredElement
{
   public static void main(String[] args) throws InterruptedException
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	WebElement dismissButton =driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]/..//input[@type='submit']"));
	dismissButton.click();
	Thread.sleep(2000);
	WebElement customerServiceOption = driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
	customerServiceOption.click();
}
}
