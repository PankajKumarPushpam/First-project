import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartCreateAccount {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("(//a[@ class='_2k0gmP'])[8]")).click();
    driver.findElement(By.xpath("//a[@ class='_2AkmmA _1LctnI jUwFiZ']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@ class='_2zrpKA']")).sendKeys("7739928101");
    driver.findElement(By.xpath("(//button[@ type='submit'])[2]")).submit();
    //System.out.println("clicked on login");
	
	

	
}
}
