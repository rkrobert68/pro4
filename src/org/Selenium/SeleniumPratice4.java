package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPratice4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//	driver.get("http://www.greenstechnologys.com ");
	
//	WebElement linkGreen = driver.findElement(By.xpath("//font[contains(text(),'GREENS TECHNOLOGY')]"));
//	String text = linkGreen.getText();
//	System.out.println(text);
//	
//	WebElement linkGreen = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
//	String text = linkGreen.getText();
//	System.out.println(text);
//	
	
//	driver.get("http://greenstech.in/selenium-course-content.html");
//	
//	WebElement linkAddress = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[5]"));
//	String text = linkAddress.getText();
//	System.out.println(text);
//	
//		driver.get("https://www.facebook.com/ ");
//		
//		WebElement textUserName = driver.findElement(By.id("email"));
//	    textUserName.sendKeys("robert.oral1");
//	    WebElement textPassword = driver.findElement(By.id("pass"));
//	    textPassword.sendKeys("Robert123$");
//	    
//	    String attribute = textUserName.getAttribute("value");
//	     System.out.println(attribute);
//	     
//	    String attribute2 = textPassword.getAttribute("value");
//	     System.out.println(attribute2);
//	
//
//	     WebElement btnLogin = driver.findElement(By.name("login"));
//	     btnLogin.click();
//	     
		
		driver.get("https://www.flipkart.com/ ");
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement textUserName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textUserName.sendKeys("Iphones");
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnSearch.click();
		
		Thread.sleep(10000);
		
		WebElement link1st = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		link1st.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	     	}

}
