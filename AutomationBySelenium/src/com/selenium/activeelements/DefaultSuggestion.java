package com.selenium.activeelements;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultSuggestion 
{
	public static void main(String[] args) throws IOException 
	{	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().click();
	List<WebElement> defaultSuggestion = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
    System.out.println(defaultSuggestion);
    
    for(WebElement suggestion : defaultSuggestion)
	{
		String suggestionText = suggestion.getText();
		System.out.println(suggestionText);
    if(suggestionText.equals("covid 19 coronavirus cases india"));
    suggestion.click();
    break;
	}
    
}
}
