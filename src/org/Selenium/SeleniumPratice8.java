package org.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPratice8 {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		WebElement cancelAlert = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
		cancelAlert.click();
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnAlert.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	}

}
