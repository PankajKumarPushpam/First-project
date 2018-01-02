import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//div[@class='col-11-12']/div/input")).sendKeys("iphone 7");
	    driver.findElement(By.xpath("//button[@ class='vh79eN']")).click();
	    Thread.sleep(3000);
	    RemoteWebDriver rt=(RemoteWebDriver) driver;
		rt.executeScript("window.scrollBy(0,1250)");
		
		driver.findElement(By.xpath("(//div[@ class='_3wU53n'])[5]")).click();
		//driver.findElement(By.xpath("//img[@ class='sfescn']")).click(); //image
		
		
		driver.findElement(By.xpath("//button[@ type='button']")).click();
	    System.out.println("code Compile");
	
	}

}
