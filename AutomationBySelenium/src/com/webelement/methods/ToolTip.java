package com.webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement flipkartLogo = driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkh')]"));
		String logoToolTip = flipkartLogo.getAttribute("title");
		System.out.println(logoToolTip);
	}

}
  