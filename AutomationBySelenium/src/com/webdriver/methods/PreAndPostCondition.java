package com.webdriver.methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostCondition
{
	public static void main(String[] args) throws InterruptedException 
 { 
		WebDriver driver = new ChromeDriver();
  Thread.sleep(2000); 
  //pre condition 
  driver.manage().window().maximize(); 
  Thread.sleep(2000);
  driver.get("https://www.youtube.com/"); 
  Thread.sleep(2000);
  //Compile time error soo throws keyword
  //post condition 
  driver.manage().window().minimize();
   }
}
