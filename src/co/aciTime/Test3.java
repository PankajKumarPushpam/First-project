package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Test3 {

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
		
		/*
		  
		 
		//WebElement element=driver.findElement(By.xpath("//a[@id='logoutLink']"));
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Setting')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")).click();		
	    driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Tips')]")).click();
	    
		driver.findElement(By.xpath("//div[contains(text(),'TIME-TRACK')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'REPORTS')]")).click();
		*/
		
		/*
		 
		//add new users
		
		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Add Users')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Configure new user profile')]")).click();
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_firstNameField']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_lastNameField']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@ id='userDataLightBox_emailField']")).sendKeys("ram@gmail.com");	
		driver.findElement(By.xpath("//div[@ id='userDataLightBox_cancelBtn']")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();	
		//driver.findElement(By.xpath("//div[@id='closeUserDataLightBoxBtn']")).click();
		//driver.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();				
   	   //driver.findElement(By.xpath("(//span[contains(text(),'Singh, Ram')])[1]")).click();
		
		//Change the pasword of actiTime
		
		driver.findElement(By.xpath("//a[@ id='toPasswordRecoveryPageLink']")).click();
		driver.findElement(By.xpath("//input[@ id='forgetPasswordEmailOrUsername']")).sendKeys("pkpushpam1996@gmail.com");;
		driver.findElement(By.xpath("//div[contains(text(),'Request Login Info')]")).click();
		
		
		//Calender		
		
		driver.findElement(By.xpath("//td[@ class='x-btn-center']")).click();		
		driver.findElement(By.xpath("//a[@ id='ext-gen48']")).click();		
		driver.findElement(By.xpath("//a[@id='ext-gen44']")).click();
		driver.findElement(By.xpath("//td[@ class='x-date-bottom']")).click();
		
		
		//Tasks Module
		//Add customer
		
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		driver.findElement(By.xpath("//div[@ class='addNewButton']")).click();
		
		//driver.findElement(By.xpath("//div[@ class='item createNewCustomer ellipsis']")).click();
		//driver.findElement(By.xpath("//input[@ id='customerLightBox_nameField']")).sendKeys("pushpam");
		//driver.findElement(By.xpath("//textarea[@ id='customerLightBox_descriptionField']")).sendKeys("i am very punctual.");
		//driver.findElement(By.xpath("//div[@ id='customerLightBox_commitBtn']")).click();
		//driver.findElement(By.xpath("//div[@ id='customerLightBox_cancelBtn']")).click();
		
		
		driver.findElement(By.xpath("//div[@ class='item createNewProject ellipsis']")).click();
		driver.findElement(By.xpath("//input[@ id='projectPopup_projectNameField']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//em[@ unselectable='on']")).click();
		
		//problem
		
		driver.findElement(By.xpath("//a[@ id='ext-gen254']")).click();
		//driver.findElement(By.xpath("//a[@ id='ext-gen254']")).click();
		
		//driver.findElement(By.xpath("//textarea[@ id='projectPopup_projectDescriptionField']")).sendKeys("One of the best Project");
		//driver.findElement(By.xpath("//div[@ id='projectPopup_commitBtn']")).click();
		//driver.findElement(By.xpath("//div[@ id='projectPopup_cancelBtn']")).click();
		
		*/
		
		//Time-Track
		
		driver.findElement(By.xpath("//div[contains(text(),'TIME-TRACK')]")).click();
		driver.findElement(By.xpath("//img[@ class='chooseDefaultWayImg']")).click();
				
	}

}
