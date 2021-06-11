package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice3 {

	public static void main(String[] args) {
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("http://demo.automationtesting.in/Register.html");
		
//		WebElement textFName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		textFName.sendKeys("robert");
//		
//		
//		WebElement textLName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		textLName.sendKeys("rk");
//		
//		WebElement textEmail = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
//		textEmail.sendKeys("rkrobert68@gmail.com");
//		
//		WebElement textPhone = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
//		textPhone.sendKeys("9566372393");
//		
//		WebElement btnGender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//		btnGender.click();
//		
//		WebElement ddnCountry = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
//		
//		Select s=new Select(ddnCountry);
//		s.selectByVisibleText("India");
//		
//		WebElement ddnYear = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
//		ddnYear.sendKeys("1997");
//		
//		WebElement ddnMonth = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
//		ddnMonth.sendKeys("February");
//		
//		WebElement ddnDay = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
//		ddnDay.sendKeys("19");
//		
//		WebElement textPassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
//		textPassword.sendKeys("Robert123@");
//		
//		WebElement textCnfmPassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		textCnfmPassword.sendKeys("Robert123@");
//		
//		WebElement btnSubmit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		btnSubmit.click();
		
		driver.get("http://www.adactin.com/HotelApp/");
		
		
//		WebElement textFirstName = driver.findElement(By.id("firstName"));
//		textFirstName.sendKeys("oral");
//		
//		WebElement textLastName = driver.findElement(By.id("lastName"));
//		textLastName.sendKeys("robert");
//		
//		WebElement btnGender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
//		btnGender.click();
//		
//		WebElement textPhone = driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[3]"));
//		textPhone.sendKeys("9566372393");
//		
//		WebElement btnSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
//		btnSubmit.click();
		
//		WebElement linkInterview = driver.findElement(By.xpath("(//div[@class='card'])[126]"));
//		linkInterview.click();
//		
//		WebElement linkCts = driver.findElement(By.xpath("(//li[@class='pointer'])[6]"));
//		linkCts.click();
//		
//		
		
		
		
		
		WebElement textChild = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
		String text = textChild.getText();
		System.out.println(text);
		
		
		
		
		
	}

}
