package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ppushpam/login.do");
		driver.findElement(By.xpath("//input[@ id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pkpushpam1996");
		driver.findElement(By.xpath("//input[@ name='pwd']")).sendKeys("pankaj12345");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		
		//driver.findElement(By.xpath("//div[@ class='addNewButton']")).click();
		/*
		driver.findElement(By.xpath("//div[@ class='item createNewCustomer ellipsis']")).click();
		driver.findElement(By.xpath("//input[@ id='customerLightBox_nameField']")).sendKeys("pushpam2");
		driver.findElement(By.xpath("//textarea[@ id='customerLightBox_descriptionField']")).sendKeys("i am very punctual.");
		driver.findElement(By.xpath("//div[@ id='customerLightBox_cancelBtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		//create new Project
		//driver.findElement(By.xpath("//div[@ class='item createNewProject ellipsis']")).click();
		//driver.findElement(By.xpath("//div[@ id='customerLightBox_commitBtn']")).click();
		//driver.findElement(By.xpath("//input[@ id='projectPopup_projectNameField']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//em[@ unselectable='on']")).click();
		
		//problem
		
		//driver.findElement(By.xpath("//a[@ id='ext-gen254']")).click();
		//driver.findElement(By.xpath("//a[@ id='ext-gen254']")).click();
		
		//driver.findElement(By.xpath("//textarea[@ id='projectPopup_projectDescriptionField']")).sendKeys("One of the best Project");
		//driver.findElement(By.xpath("//div[@ id='projectPopup_commitBtn']")).click();
		//driver.findElement(By.xpath("//div[@ id='projectPopup_cancelBtn']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
