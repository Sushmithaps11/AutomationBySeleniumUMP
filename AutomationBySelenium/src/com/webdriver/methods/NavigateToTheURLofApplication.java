package com.webdriver.methods;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class NavigateToTheURLofApplication 
	{
	 public static void main(String[] args) throws InterruptedException {

	  //  Open Browser
	  WebDriver driver=new ChromeDriver();

	  // Maximize Browser
	  driver.manage().window().maximize();

	  // Trigger Url
	  driver.get("https://www.dassault-aviation.com/en/");
	  Thread.sleep(2000);

	  // Navigate the URL to another webpage
	  driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
	  Thread.sleep(2000);

	  //  Navigate the URL to another webpage
	  driver.navigate().to("https://www.dassault-aviation.com/en/group/");
	  Thread.sleep(2000);

	  //  Navigate the URL to another webpage
	  driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
	  Thread.sleep(2000);

	  //  Navigate the URL to another webpage
	  driver.navigate().to("https://www.dassault-aviation.com/en/space/");
	  Thread.sleep(2000);

	  //  Navigate the URL to another webpage
	  driver.navigate().to("https://www.dassault-aviation.com/en/passion/");

	  // Minimize the browser
	  driver.manage().window().minimize();
	 }
	}


