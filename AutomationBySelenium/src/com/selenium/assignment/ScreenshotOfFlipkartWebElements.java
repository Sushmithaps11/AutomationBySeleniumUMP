package com.selenium.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotOfFlipkartWebElements 
{
	public static void main(String[] args) throws IOException 
	{	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.flipkart.com/");
	WebElement xOpt = driver.findElement(By.xpath("//span[text()='x']"));
	xOpt.click();
	//wait.until(ExpectedConditions.titleIs("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	
	List<WebElement> flipkartimg = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//img"));
	
	int c=0;
	for (WebElement img : flipkartimg) 
	{
	File tempFile = img.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./flipkartimgsshots/" + timeStamp + "flipkart" +c+".png");
	FileUtils.copyFile(tempFile, permFile);
	c++;
	}
	


}
}
