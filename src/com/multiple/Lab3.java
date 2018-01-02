package com.multiple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	driver.get("file:///F:/Html%20page/India.html");
	
	WebElement element = driver.findElement(By.name("listbox"));
	
	Select select=new Select(element);
	Thread.sleep(3000);
	select.selectByIndex(0);
	Thread.sleep(3000);
	select.selectByValue("KOR");
	Thread.sleep(3000);
	select.selectByVisibleText("India");
	
	Thread.sleep(3000);
	
	select.deselectByIndex(0);
	Thread.sleep(3000);
	select.deselectByValue("KOR");
	Thread.sleep(3000);
	select.deselectByVisibleText("India");
	
	
	
}
}
