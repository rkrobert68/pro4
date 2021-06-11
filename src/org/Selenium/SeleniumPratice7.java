package org.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPratice7 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement textAddress = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true)", textAddress);
		
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File a = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\images\\img1.png");
		
		FileUtils.copyFile(a, f);
		
	}

}
