package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String alert="";
    driver.get("file:///F:/Html%20page/alert.html");
    driver.findElement(By.xpath("//input[@ onclick='showAlert()']")).click();
    alert=driver.switchTo().alert().getText();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    System.out.println(alert);
    
    
    }
}
