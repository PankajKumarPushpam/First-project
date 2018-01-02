package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
	
	driver.get("file:///F:/Html%20page/pan3.html");
	Thread.sleep(3000);
	RemoteWebDriver r=(RemoteWebDriver) driver;        //downcasting
	String str="document.getElementById('a2').click()";
	r.executeScript(str);
	Thread.sleep(3000);
	driver.quit();
}
}
