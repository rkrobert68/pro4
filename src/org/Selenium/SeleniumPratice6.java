package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPratice6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement textEmail = driver.findElement(By.id("email"));
//		textEmail.sendKeys("rkrobert68@gmail.com");
//		
//		Robot r=new Robot();
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_X);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
		
//		
//		driver.get("https://www.flipkart.com/");
//		
//		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		btnClose.click();
//		
//		Actions a=new Actions(driver);
//		
//		WebElement linkSpeaker = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[12]"));
//		a.contextClick(linkSpeaker).perform();
//		
//		Robot r =new Robot();
//		
//		for(int i=0;i<5;i++) {
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		}
//		
//		for(int j=0;j<2;j++) {
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		}
		
		
		driver.get("https://www.google.co.in/webhp ");
		
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("VelMurugan");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.doubleClick(textBox).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
		
		
		
		
	}

}
