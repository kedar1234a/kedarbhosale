package com.cjc.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\adhya\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("CJC");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("abc");//relative xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]")).sendKeys("abc@gmail.com");//absoluate xpath
		driver.findElement(By.xpath("//form/child::textarea")).sendKeys("welcome");//child
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
