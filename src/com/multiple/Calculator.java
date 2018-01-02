package com.multiple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://percentagecalculator.net/");
		driver.findElement(By.xpath("(//input[@ type='text'])[1]")).sendKeys("30");		
		driver.findElement(By.xpath("(//input[@ type='text'])[1]")).getAttribute("value");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@ type='text'])[2]")).sendKeys("50");
		driver.findElement(By.xpath("(//input[@ type='text'])[2]")).getAttribute("value");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//input[@ value='Calculate'])[1]")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("(//input[@ type='text'])[3]")).getAttribute("value");
		System.out.println("Result is:"+result);
		//driver.quit();
		/*
		driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
				
				// Click on Radio Button
				driver.findElement(By.id("cpayoff1")).click();
				System.out.println("The Output of the IsSelected " +
				driver.findElement(By.id("cpayoff1")).isSelected());
				System.out.println("The Output of the IsEnabled " +
				driver.findElement(By.id("cpayoff1")).isEnabled());
				System.out.println("The Output of the IsDisplayed " +
				driver.findElement(By.id("cpayoff1")).isDisplayed());
				Thread.sleep(5000);
				// Close the Browser.
				driver.close();
			*/
				}
	}

