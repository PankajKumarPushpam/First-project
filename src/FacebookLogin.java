import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://en-gb.facebook.com/login/");
	driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("pankajbu261@gmail.com");
	driver.findElement(By.xpath("//input[@ id='pass']")).sendKeys("Rambaburaja");
    driver.findElement(By.xpath("//button[@ id='loginbutton']")).click();
    driver.findElement(By.xpath("//div[@ id='userNavigationLabel']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//span[@ class='_54nh'])[9]")).click();
    
    
    
  //div[@ class='O8ZS_U'] for Search
}
}
