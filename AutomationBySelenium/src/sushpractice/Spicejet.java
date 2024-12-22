package sushpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Spicejet {
	

	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[text()='To']")).sendKeys("Delhi");
	}

	}


