package com.selenium.activeelements;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion 
{
	public static void main(String[] args) throws IOException 
	{	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("selenium");
	List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	System.out.println(autoSuggestion.size());
	for(WebElement suggestion : autoSuggestion)
	{
		String suggestionText = suggestion.getText();
		System.out.println(suggestionText);
		if(suggestionText.contains("tutorial"))
		{
			suggestion.click();
			break;
		}
	}

}
}
