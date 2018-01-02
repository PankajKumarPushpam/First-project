package co.aciTime;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///F:/Html%20page/pan2.html");

	WebElement el = driver.findElement(By.xpath("//input[@ id='a1']"));
	Dimension d1 = el.getSize();
	System.out.println("Height of Text Box 1 is "+d1.getHeight());
	System.out.println("Height of Text Box 1 is "+d1.getWidth());
	
	WebElement el2 = driver.findElement(By.xpath("//input[@ id='a2']"));
	Dimension d2=el2.getSize();
	System.out.println("Height of Text Box 2 is "+d2.getHeight());
	System.out.println("Height of Text Box 2 is "+d2.getWidth());
	
	 int tbH1 = d1.getHeight();
	 int tbH2 = d2.getHeight();
	int tbxW1=d1.getWidth();
	int tbxW2=d2.getWidth();
	
	if (tbH1==tbH2) {
		System.out.println("Both Text Boxes have same Height");
	} else {
		
		System.out.println("Both Text Boxes dont have same Height");

	}
	
	if (tbxW1==tbxW2) {
		System.out.println("Both Text Boxes have same Width");
	} else {
		System.out.println("Both Text Boxes dont have same Width");
	}
	
driver.close();	
}
}
