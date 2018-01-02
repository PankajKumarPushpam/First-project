package com.multiple;

import java.util.concurrent.TimeUnit;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulHandEle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("file:///F:/Html%20page/HandMulEle.html");
		//Find the Total number of links
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int x = allLinks.size();
        System.out.println("Total Number of Links="+allLinks.size());
       
        //Find First Link
		WebElement ele=allLinks.get(0);
		System.out.println("First Link of the Page="+allLinks.get(0).getText());
		
		//find all url
		
		 for(WebElement q:allLinks){
	        	System.out.println("All Links="+q.getAttribute("href"));	
	        }
        
        
        
        //Find the all CheckBoxes       
        List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@ type='checkbox']"));
		int y = allCheckBoxes.size();
        System.out.println("Total Number of CheckBoxes="+y);
        
        for(WebElement a:allCheckBoxes){
        	System.out.println("All CheckBoxes="+a.getAttribute("value"));	
        }
      		
        //Find the all Tatal Elements in Table
        
        List<WebElement> totalEle=driver.findElements(By.xpath("//td"));
		int w = totalEle.size();
        System.out.println("Total Number of Elements in Table="+w);
        
        for(WebElement d:totalEle){
        	System.out.println("All Elemnets in table="+d.getText());	
        }
        
        
        //Find the all TextBoxes
        
        List<WebElement> allTextBoxes=driver.findElements(By.xpath("//input[@type='text']"));
		int z = allTextBoxes.size();
        System.out.println("Total Number of TextBoxes="+z);
       
        for(WebElement f:allTextBoxes){
        	System.out.println("All Elemnets in text="+f.getAttribute("id"));	
        }
        
        //Find the Total number of Elements in Menue
        
        List<WebElement> eleMenue=driver.findElements(By.xpath("//option"));
		int p = eleMenue.size();
        System.out.println("Total Number of Elements in Menue="+eleMenue.size());
        
        //Find First Element in Menue
		WebElement ele3=eleMenue.get(0);
		System.out.println("First Element in Menue="+ele3.getText());

        for(WebElement b:eleMenue){
        	System.out.println("All Elemnets="+b.getAttribute("value"));	
        }
		
		
		
        driver.quit();
	}

}
