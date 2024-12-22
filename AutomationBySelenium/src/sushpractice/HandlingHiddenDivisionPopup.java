package sushpractice;
	

	import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


		public class HandlingHiddenDivisionPopup {

			public static void main(String[] args) throws InterruptedException {
			Scanner sc =new Scanner(System.in);
				System.out.println("Enter the date");
				int date=sc.nextInt();
			   System.out.println("Enter the month");
			    String month=sc.next();
			    month=month.substring(0,1).toUpperCase()+month.substring(1,month.length());
				 System.out.println("Enter the year");
				int year=sc.nextInt();
				//launching the Browser
				ChromeDriver driver=new ChromeDriver();
				//Maximizing browser
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				//launch makemytrip
			    driver.get("https://www.makemytrip.com/");
			  //closing the popup
			    Thread.sleep(3000);
			    Actions action=new Actions(driver);
			   action.moveByOffset(1117, 71).click().perform();
		    driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		  //  WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			    Thread.sleep(3000);
			  

		    driver.findElement(By.xpath("//label[@for='departure']")).click();
		    driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='" +date+"']")).click();
			}

		}


