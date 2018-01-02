package com.multiple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("file:///F:/Html%20page/HandMulEle.html");
		//Find the Total number of links
		
				List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
				//int x = allLinks.size();
		        //System.out.println("Total Number of Links="+allLinks.size());
		       
		        //Find First Link
		WebElement ele=allLinks.get(0);
		System.out.println("First Link of the Page="+allLinks.get(0).getText());
		//find all Link(url)
		 for(WebElement q:allLinks){
	        	System.out.println("All Links="+q.getAttribute("href"));
	}
		 /*
		 
		 RemoteWebDriver r=(RemoteWebDriver)driver;
		 r.executeScript("alert(\"luv u SweetHeart...\")");
		 Thread.sleep(1000);
         driver.switchTo().alert();  */
}
}
