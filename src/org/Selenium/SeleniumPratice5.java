package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPratice5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\GreensTrends\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//        driver.get("http://demo.guru99.com/test/drag_drop.html");
//        
//        Actions a=new Actions(driver);
		
//        WebElement src = driver.findElement(By.id("credit2"));
//        
//        WebElement des = driver.findElement(By.id("bank"));
//		
//		
// a.dragAndDrop(src, des).perform();;
//        
//        
//        WebElement src1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
//        
//        WebElement des1 = driver.findElement(By.id("amt7"));
//        
//        
//        a.dragAndDrop(src1, des1).perform();
//        
//        
//        WebElement src2 = driver.findElement(By.id("credit1"));
//        
//        WebElement des2 = driver.findElement(By.id("loan"));
//        
//        a.dragAndDrop(src2, des2).perform();
//        
//        
//        
//        WebElement src3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
//        
//        WebElement des3 = driver.findElement(By.id("amt8"));
//        
//        a.dragAndDrop(src3, des3).perform();
        
        
//		 driver.get("http://www.flipkart.com");
//	        
//	        Actions a=new Actions(driver);
//	        
//	        WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	        btnClose.click();
//	        
//	        WebElement linkFurniture = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
//		
//		a.moveToElement(linkFurniture).perform();
//		
//		WebElement linkBath = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
//		
//		a.moveToElement(linkBath).perform();
//		
//		WebElement linkAll = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[1]"));
//		linkAll.click();
//		
//		Thread.sleep(5000);
//		WebElement linkProduct = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
//		String text = linkProduct.getText();
//		System.out.println(text);
//		
		
		
//		driver.get("https://www.shopclues.com/wholesale.html");
//		
//		Actions a =new Actions(driver);
//		
//		WebElement linkMobile = driver.findElement(By.xpath("//li[@id='nav_44']"));
//		
//		a.moveToElement(linkMobile).perform();
//		
//		Thread.sleep(3000);
//		
//		WebElement linkRealme = driver.findElement(By.xpath("//a[text()='Realme']"));
//		linkRealme.click();
//		
		
		driver.get("https://www.snapdeal.com/");
		
		Actions a =new Actions(driver);
		
		WebElement linkMobiles = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		
		a.moveToElement(linkMobiles).perform();
		
		WebElement linkNewLauchCovers = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		linkNewLauchCovers.click();
		
		
		
		
		
        
        
        
        
        
        
	}

}
