package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///F:/Html%20page/ck1.html");
	WebElement el=driver.findElement(By.xpath("//a[@ name='n1']"));
	
	Point p1=el.getLocation();  
	System.out.println(p1.getX());
	System.out.println(p1.getY());
	WebElement el1=driver.findElement(By.xpath("//a[@ name='n1']"));
	Point p2=el1.getLocation();
	System.out.println(p2.getX());
	System.out.println(p2.getY());
	if (p1.getX()==p2.getX()) {
		System.out.println("Both text boxes are vertically alligned");
	} else {
		System.out.println("Both text boxes are not vertically alligned");
	}
	
	driver.quit();
	
}
}
