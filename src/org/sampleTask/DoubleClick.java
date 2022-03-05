package org.sampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement userN = driver.findElement(By.id("loginEmailId"));
		userN.sendKeys("gouthammuniasamy7895@gmail.com");
		
		WebElement pass = driver.findElement(By.id("loginPassword"));
		pass.sendKeys("Pooja@123");
		
		WebElement log = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		log.click();
		
		Thread.sleep(3000);
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='MOBILE']"));
		mob.click();
		
		WebElement mac = driver.findElement(By.className("card-img-top"));
		mac.click();
		
		WebElement buy = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		buy.click();
		
		WebElement gift = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		gift.click();
		
		Thread.sleep(5000);
		
		WebElement prom = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(prom).perform();
		
		WebElement close = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		Actions actions1 = new Actions(driver);
		actions1.contextClick(close).perform();
		
		WebElement remove = driver.findElement(By.xpath("//section[@class='user-menu ng-star-inserted']"));
		remove.click();
		
	}
}
