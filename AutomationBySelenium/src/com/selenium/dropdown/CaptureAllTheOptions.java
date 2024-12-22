package com.selenium.dropdown;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllTheOptions 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		List<WebElement> allYearOptions = yearSelect.getOptions();
		System.out.println(allYearOptions.size());
		for (WebElement option : allYearOptions)
		{
			String optionText = option.getText();
			System.out.println(optionText);
			yearSelect.selectByVisibleText(optionText);
			
			if(option.isSelected())
			{
		        System.out.println("Pass : The option in the year drop down is selecting");
			}
			else
			{
				System.out.println("Fail : The option in the year drop down is not selecting");
			}
			
		}

	}
}
