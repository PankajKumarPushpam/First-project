package encapsulation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {
     private WebElement unTxBx;
     private WebElement pwTxBx;
     private WebElement loginBtn;
     private WebElement task;
     
     public LogingPage(WebDriver driver){
    	 unTxBx=driver.findElement(By.id("username"));
    	 pwTxBx=driver.findElement(By.name("pwd"));
    	 loginBtn=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
    	 task=driver.findElement(By.xpath("//div[contains(text(),'TASKS')]"));
     }
      
     public void loging(String un,String pw){
    	 unTxBx.sendKeys(un);
    	 pwTxBx.sendKeys(pw);
    	 loginBtn.click();
    	 task.click();
     }
     public void loginWithMeLoggedIn(String un,String pw){
    	 unTxBx.sendKeys(un);
    	 pwTxBx.sendKeys(pw);
    	 loginBtn.click();
    	 task.click();
     }
   
}
