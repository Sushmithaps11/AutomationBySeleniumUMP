package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUponRadioButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@name='sex']"));
		
		if(customRadioButton.isSelected())
		{
			System.out.println("Pass : Custom buttom is already Selected");
		}
		else
		{
			customRadioButton.click();
		}
		

}
}
