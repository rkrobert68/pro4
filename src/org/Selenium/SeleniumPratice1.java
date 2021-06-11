package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPratice1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement ddnColour = driver.findElement(By.id("oldSelectMenu"));
		ddnColour.sendKeys("Purple");

		WebElement ddnColour1 = driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]"));
		Select s=new Select(ddnColour1);
		s.selectByVisibleText("Red");
		s.selectByVisibleText("Green");

//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
//		
//		
//		driver.quit();
//		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
