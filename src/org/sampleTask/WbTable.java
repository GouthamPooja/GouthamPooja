package org.sampleTask;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement tblData = driver.findElement(By.id("customers"));

		List<WebElement> tRow = tblData.findElements(By.tagName("td"));

		for (int i = 0; i < tRow.size(); i = i + 2) {
			WebElement lastRow = tRow.get(i);
			String text = lastRow.getText();
			System.out.println(text);

		}

	}
}
