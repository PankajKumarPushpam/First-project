package com.multiple;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///F:/Html%20page/Handling%20multiple%20Elements.html");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int sizeofLinks=allLinks.size();
		System.out.println("Total number of Links="+sizeofLinks);
		
		
		WebElement ele=allLinks.get(0);
		System.out.println("First Link of the Page="+allLinks.get(0).getText());
		
		
		
		
		
		List<WebElement> allCheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkBox=allCheckBox.size();
		System.out.println("Total number of Links="+checkBox);
		
		for(WebElement x:allCheckBox){
			System.out.println(x.getAttribute("value"));
		}
		
		WebElement ele1=allCheckBox.get(0);
		System.out.println("First Check of the Page="+allCheckBox.get(1).getText());
		
	

		List<WebElement> alltextBox=driver.findElements(By.xpath("//input[@type='text']"));
		int textBox=alltextBox.size();
		System.out.println("Total number of Links="+textBox);
		
		for(int i=0;i<alltextBox.size();i++){
			System.out.println("Total Links="+alltextBox.get(i).getText());
		}
		
		
		
		WebElement ele2=alltextBox.get(0);
		System.out.println("First Check of the Page="+alltextBox.get(0).getText());
		
		
		List<WebElement> allEleInTable=driver.findElements(By.xpath("//td"));
		int eleNo=allEleInTable.size();
		System.out.println("Total number of Elements In Table="+eleNo);
		
		for(WebElement alle:allEleInTable){
			System.out.println(alle.getText());	
		}
		
		WebElement ele3=allEleInTable.get(0);
		System.out.println("All Element Table of the Page="+allEleInTable.get(0).getText());
		
		
		List<WebElement> alloption=driver.findElements(By.xpath("//option"));
		int opt=alloption.size();
		System.out.println("Total number of Options="+opt);
		
		WebElement ele4=alloption.get(0);
		System.out.println("All Element Table of the Page="+alloption.get(0).getText());
		for(WebElement i:alloption){
			System.out.println(i.getText());	
		}
		
	driver.quit();
	}
	

}
