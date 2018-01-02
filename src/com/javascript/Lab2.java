package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		driver.get("file:///F:/Html%20page/pan2.html");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@ id='a2']"));
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		Thread.sleep(3000);
		String str="document.getElementById('a2').value='Selenium'";
		r.executeScript(str);
}
}
