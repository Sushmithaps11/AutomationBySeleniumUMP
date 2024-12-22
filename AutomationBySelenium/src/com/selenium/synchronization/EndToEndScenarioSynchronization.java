package com.selenium.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndScenarioSynchronization 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	WebElement loginLink = driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']"));
	loginLink.click();
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("letsuccessmakesnoise@gmail.com");
	WebElement continueButton = driver.findElement(By.id("login-submit"));
	continueButton.submit();
	WebElement passwordTextField = driver.findElement(By.id("password"));
    passwordTextField.sendKeys("successisthekey");
    WebElement loginButton = driver.findElement(By.id("login-submit"));
    loginButton.submit();
    WebElement menuOption = driver.findElement(By.xpath("//span[@aria-label='Navya (letsuccessmakesnoise)']"));
    menuOption.click();
}
}
