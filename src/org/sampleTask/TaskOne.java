package org.sampleTask;

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

public class TaskOne {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement userN = driver.findElement(By.id("email"));

		WebElement userP = driver.findElement(By.name("pass"));

		WebElement logIn = driver.findElement(By.name("login"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].setAttribute('value','bmw')", userN);
		Object usN = executor.executeScript("return arguments[0].getAttribute('value','bmw')", userN);
		System.out.println(usN);

		executor.executeScript("arguments[0].setAttribute('value','320D')", userP);
		Object usP = executor.executeScript("return arguments[0].getAttribute('value','320D')", userP);
		System.out.println(usP);

		executor.executeScript("arguments[0].click()", logIn);

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Java\\Installing\\bmw.png");
		FileUtils.copyFile(s, des);

	}

}
