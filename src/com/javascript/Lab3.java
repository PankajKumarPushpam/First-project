package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//scroll up
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1250)", "");
	//scroll down
	
	//jse.executeScript("window.scrollBy(0,-1250)", "");
	
	//RemoteWebDriver rt=(RemoteWebDriver) driver;
	//rt.executeScript("window.scrollBy(0,1250)");
	//rt.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	//scroll down
	//rt.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
}
}
