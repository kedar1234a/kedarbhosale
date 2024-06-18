package com.cjc.webelementsmetods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexHtml {
	public static void main(String[] args) throws IOException {
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\adhya\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		WebElement unm=driver.findElement(By.name("uname"));
		unm.sendKeys("cjc");
		
		String ss=driver.findElement(By.name("uname")).getAttribute("value");
		System.out.println(ss);
		
		
		WebElement login1=driver.findElement(By.id("login"));
		login1.click();
		boolean b=driver.findElement(By.id("login")).isDisplayed();
		System.out.println(b);
		String s=driver.findElement(By.name("login")).getText();
		System.out.println(s);
		
		
		
		
	}

}
