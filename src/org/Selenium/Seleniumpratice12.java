package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpratice12 {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement textUserName = driver.findElement(By.id("email"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','robert.oral1');", textUserName);
		
		WebElement textPassword = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Robert123$');"
				+ "",textPassword);
		
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", btnLogin);

	}

}
