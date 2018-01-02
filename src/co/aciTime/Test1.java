package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
   //Explicitly
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ppushpam/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
		driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("pankaj12345");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		WebElement element=driver.findElement(By.xpath("//a[@id='logoutLink']"));
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
		String title=driver.getTitle();
		element.click();
		System.out.println(title);
	}

}
