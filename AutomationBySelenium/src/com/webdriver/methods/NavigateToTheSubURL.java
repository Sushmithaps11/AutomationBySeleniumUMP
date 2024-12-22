package com.webdriver.methods;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NavigateToTheSubURL 
	{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	// Trigger the Main URL
	 driver.get("https://www.dassault-aviation.com/en/");
	 
	// Store the Main url in a reference
	 URL mainurl=new URL("https://www.dassault-aviation.com/en/");
	 
	// With main URL of the application , we have to concatenate the sub url using main url reference and store in a reference (groupPage)
	 URL groupPage=new URL(mainurl,"group/");
	 
	// Navigate to Sub URL GroupPage
	 driver.navigate().to(groupPage);
	 Thread.sleep(2000);
	 
	// With main URL of the application , we have to concatenate the sub url using main url reference and store in a reference (spacePage)
	 URL spacePage=new URL(mainurl,"space/");
	// Navigate to Sub URL SpacePage
	 driver.navigate().to(spacePage);
	 Thread.sleep(2000);
	 driver.manage().window().minimize();
	 }
	
}
