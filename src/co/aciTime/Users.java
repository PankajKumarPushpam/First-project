package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Users {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ppushpam/login.do");
		
		//very that user should be able to test the Scenario of actiTime application
		
		driver.findElement(By.xpath("//input[@ id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
		driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("pankaj12345");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Add Users')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Configure new user profile')]")).click();
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_firstNameField']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_lastNameField']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_emailField']")).sendKeys("ram@gmail.com");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@ id='userDataLightBox_cancelBtn']")).click();
		
		//driver.findElement(By.xpath("//div[@ class='item inviteSeveralUsersIcon']")).click();
		
		driver.switchTo().alert().accept();
		

	}

}
