package com.webdriver.methods;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class GetTheTitle
	{ 
		public static void main(String[] args)
	 { 
			WebDriver driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");  
	  String ActualYoutubeTitle = driver.getTitle();
	  System.out.println("ActualYoutubeTitle = " + ActualYoutubeTitle);  
	   
	        String ExpectedYoutubeTitle = "YouTube";    
	        System.out.println("ExpectedYoutubeTitle = " + ExpectedYoutubeTitle);
	  
	  if( ActualYoutubeTitle.equals(ExpectedYoutubeTitle)) 
	  {
	   System.out.println("Pass:The Youtube page Title is As per Expexted.");
	   }
	  else  
	  {
	   System.out.println("Fail:The Youtube page Title is Not As per Expexted."); 
	   }
	    
	   }
	}


