package co.aciTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Help {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ppushpam/login.do");
		driver.findElement(By.xpath("//input[@ id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
		driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("pankaj12345");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("(//div[@ class='label'])[2]")).click();
		//driver.findElement(By.xpath("(//div[@ class='addNewButton'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@ class='item createNewTask ellipsis']")).click();
	    driver.findElement(By.xpath("//div[@ class='lightBoxTitle']")).getText();
	    
	    String title=driver.getTitle();
	    if (title.equals("Create New Tasks")) {
			System.out.println("Test is Pass");
		}else{
			System.out.println("Test is fail");
		}
	}

}
