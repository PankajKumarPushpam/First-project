package co.aciTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///F:/Html%20page/pan.html");
		WebElement el=driver.findElement(By.xpath("//input[@ id='a1']"));
		/*Thread.sleep(3000);
		el.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		el.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		el.sendKeys(Keys.BACK_SPACE);...............
		*/
		Thread.sleep(3000);
		String st=el.getAttribute("value");
		int count=st.length();
		for(int i=1;i<=count;i++){
			Thread.sleep(1000);
			el.sendKeys(Keys.BACK_SPACE);
			
			driver.quit();
		}
		
	}

}
