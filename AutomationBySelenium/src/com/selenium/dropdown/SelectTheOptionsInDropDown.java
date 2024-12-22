package com.selenium.dropdown;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheOptionsInDropDown 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
    WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		
		if(daySelect.isMultiple())
		{
			System.out.println("Pass : The drop down is Multi Select type");
		}
		else
		{
			System.out.println("Fail : The drop down is Single Select type");
			
			daySelect.selectByIndex(19);
			monthSelect.selectByValue("2");
			yearSelect.selectByVisibleText("2000");
		}
	}
}
