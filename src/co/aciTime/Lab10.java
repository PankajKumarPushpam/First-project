package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("file:///F:/Html%20page/pan3.html");
		driver.get("file:///F:/Html%20page/pan4.html");
		WebElement el = driver.findElement(By.xpath("//input[@ id='a2']"));
		Thread.sleep(3000);
		el.click();
        //el.click();
		/*if (el.isSelected()) {
			System.out.println("Check Box is Selected");
		} else {
			System.out.println("Check Box is not Selected");
		}
		System.out.println(el.isSelected());
		driver.quit();
		*/
		
		if (el.isEnabled()) {
			System.out.println("Check Box is Enabled");
		} else {
			System.out.println("Check Box is disabled");
		}
		System.out.println(el.isSelected());
		driver.quit();
		
		
		
	}
	

}
