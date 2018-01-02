package com.multiple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("file:///F:/Html%20page/India.html");
		
		WebElement element = driver.findElement(By.name("listbox"));
		Select select=new Select(element);
		List<WebElement> all = select.getOptions();
		int count=all.size();
		for(int i=0;i<count;i++){
			//Thread.sleep(2000);
		select.selectByIndex(i);
		}
		Thread.sleep(3000);
		for(int j=0;j<count;j++){
			//Thread.sleep(2000);
		select.deselectByIndex(j);
		}
		driver.quit();
	}

}
