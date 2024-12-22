package com.selenium.assignment;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swtich5Windows 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.vtiger.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.cowin.gov.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://trello.com/b/CJXm6YAt/my-trello-board");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
	Set<String> allwids = driver.getWindowHandles();
	System.out.println(allwids);
	
	for(String wid : allwids)
	{
	String widTitle = driver.switchTo().window(wid).getTitle();
	System.out.println(widTitle);
	
	if(widTitle.equals("CoWIN"))
	{
		int widthofCowinWindow = driver.manage().window().getSize().getWidth();
		int heightofCowinWindow = driver.manage().window().getSize().getHeight();
		System.out.println("Width of CowinWindow : " + widthofCowinWindow);
		System.out.println("Height of CowinWindow : " + heightofCowinWindow);		
	}
	else if(widTitle.equals("Gmail"))
	{
		driver.close();
	}
	else if(widTitle.equals("CRM Software: Customer Relationship Management | Vtiger CRM"))
	{
		Dimension size = new Dimension(350, 400);
		driver.manage().window().setSize(size);
		
		Point position = new Point(200,300);
		driver.manage().window().setPosition(position);
	}
		
		
	}	
		
	}

}
