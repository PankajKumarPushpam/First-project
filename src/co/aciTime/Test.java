package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	/*
	driver.get("https://online.actitime.com/ppushpam/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
	
	driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("enajapuJ");
	driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		*/
	
	//implicitlywait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ppushpam/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
	driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("enajapuJ");
	driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();

}
}
