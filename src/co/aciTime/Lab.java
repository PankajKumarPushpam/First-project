package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://online.actitime.com/ppushpam/login.do");
	driver.findElement(By.xpath("//input[@ id='keepLoggedInCheckBox']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
	driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("pankaj12345");
	driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	
	//driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
	driver.findElement(By.xpath("(//div[@ class='label'])[4]")).click();
	
	
	
	
	
}
}
