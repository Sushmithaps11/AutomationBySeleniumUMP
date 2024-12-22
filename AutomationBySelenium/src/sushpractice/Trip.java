package sushpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webelement.methods.ClickMethod;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Trip {
	public static void main(String[] args)
	  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("New");
		driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
		
		driver.findElement(By.xpath("(//p[text()='26'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.quit();
	}
}
