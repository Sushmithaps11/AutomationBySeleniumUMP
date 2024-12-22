
	package com.webdriver.methods;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class GetTheCurrentURL
	{ 
		public static void main(String[] args) 
	 {  //Create the browser object
	  WebDriver driver = new ChromeDriver();  
	  // Trigger the main URL of the application  driver.get("https://www.youtube.com/");
	  String ExpectedYoutubeURL = "https://www.youtube.com/";  
	  
	  System.out.println("ExpectedYoutubeURL = " + ExpectedYoutubeURL);
	  
	    //Capture the URL of the Current Webpage
	  
	          String ActualYoutubeURL = driver.getCurrentUrl();
	        System.out.println("ActualYoutubeURL = " + ActualYoutubeURL);
	        
	  // V and V  
	        if( ActualYoutubeURL.equals(ExpectedYoutubeURL))
	  {  
		  System.out.println("Pass:The Youtube page URL is As per Expexted.");
	  }
	  else
	  {  
		  System.out.println("Fail:The Youtube page URL is Not As per Expexted.");
	  }  
	   }
	}

