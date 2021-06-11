package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPratice10 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement textSearch = driver.findElement(By.id("twotabsearchtextbox"));
		textSearch.sendKeys("iphones11");
		
		
		WebElement btnSearch = driver.findElement(By.xpath("(//div[@class='nav-right'])[1]"));
		btnSearch.click();
		
		
		WebElement linkIphones = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[1]"));
		Actions a=new Actions(driver);
		a.contextClick(linkIphones).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		
		Set<String> allWid = driver.getWindowHandles();
		
		List<String> li=new ArrayList<String>();
		
		li.addAll(allWid);
		
		Thread.sleep(10000);
		
		driver.switchTo().window(li.get(1));
		
		WebElement linkRS = driver.findElement(By.xpath("//table[@class='a-lineitem']"));
		
		String text = linkRS.getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
