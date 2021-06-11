package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPratice2 {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/ ");
//		
//		WebElement textEmail = driver.findElement(By.id("email"));
//		textEmail.sendKeys("robert.oral1");
//		
//		WebElement textPassword = driver.findElement(By.id("pass"));
//		textPassword.sendKeys("Robert123$");
//		
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
//		
//		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		Thread.sleep(3000);
		
		WebElement textUserName = driver.findElement(By.name("username"));
		textUserName.sendKeys("robert.oral1");
		
		WebElement textPassword = driver.findElement(By.name("password"));
		textPassword.sendKeys("robert");
		
		
		
		
		
		
		
		
		
		

	}

}
