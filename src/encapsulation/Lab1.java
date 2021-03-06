package encapsulation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/ppushpam/login.do");
		
		LogingPage login=new LogingPage(driver);
		
		//login.setUserName("pkpushpam1996");
		//login.setPassword("pankaj12345");
		//login.clickOnCheckbtn();
		//login.clickOnLoginbtn();
		
		login.loginWithMeLoggedIn("pkpushpam1996", "pankaj12345");
		
		HomePage home=new HomePage(driver);
		home.clickOnLOgout();
		
	}

}
