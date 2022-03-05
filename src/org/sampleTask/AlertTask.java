package org.sampleTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement alertTxt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertTxt.click();
		
		WebElement txtBtn = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		txtBtn.click();
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("Goutham M");
		al.accept();
		
		WebElement txt = driver.findElement(By.id("demo1"));
		String text = txt.getText();
		System.out.println(text);
		
		
		
	
	
	
	}

}
