package org.sampleTask;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDwn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manikandan\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		WebElement usrNm = driver.findElement(By.id("username"));
		usrNm.sendKeys("naveen53");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("C1IZAU");
		WebElement clkBtn = driver.findElement(By.id("login"));
		clkBtn.click();
		WebElement loc = driver.findElement(By.id("location"));
		Select select = new Select(loc);
		select.selectByIndex(7);
		WebElement hotl = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotl);
		select1.selectByIndex(2);
		WebElement rmType = driver.findElement(By.id("room_type"));
		Select select2 = new Select(rmType);
		select2.selectByIndex(4);
		WebElement rmCount = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(rmCount);
		select3.selectByIndex(10);
		WebElement chkIn = driver.findElement(By.id("datepick_in"));
		chkIn.sendKeys("25/02/2022");
		WebElement chkOut = driver.findElement(By.id("datepick_out"));
		chkOut.sendKeys("28/02/2022");
		WebElement adlt = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adlt);
		select4.selectByIndex(2);
		WebElement chld = driver.findElement(By.id("child_room"));
		Select select5 = new Select(chld);
		select5.selectByIndex(1);
		WebElement srchBtn = driver.findElement(By.id("Submit"));
		srchBtn.click();
		WebElement slctHtl = driver.findElement(By.id("radiobutton_0"));
		slctHtl.click();
		WebElement conBtn = driver.findElement(By.id("continue"));
		conBtn.click();
		WebElement frstNm = driver.findElement(By.id("first_name"));
		frstNm.sendKeys("Goutham");
		WebElement lstNm = driver.findElement(By.id("last_name"));
		lstNm.sendKeys("M");
		WebElement adrs = driver.findElement(By.id("address"));
		adrs.sendKeys("no.1,Muthuvelar 7th cross street,New Perungalathur,Chennai-600063.");
		WebElement crdNum = driver.findElement(By.id("cc_num"));
		crdNum.sendKeys("1234567890123456");
		WebElement crdType = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(crdType);
		select6.selectByIndex(1);
		WebElement exMnth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(exMnth);
		select7.selectByIndex(2);
		WebElement exYr = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(exYr);
		select8.selectByIndex(12);
		WebElement cvNum = driver.findElement(By.id("cc_cvv"));
		cvNum.sendKeys("123");
		WebElement bkBtn = driver.findElement(By.id("book_now"));
		bkBtn.click();
		Thread.sleep(8000);
		WebElement ordNum = driver.findElement(By.id("order_no"));
		String attribute = ordNum.getAttribute("value");
		System.out.println(attribute);

	}

}
