package com.cjc.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //input[3]/preceding-sibling::input[2]")).sendKeys("abc");
		driver.findElement(By.xpath(" //input[3]/preceding-sibling::*[1]")).sendKeys("cjc");
		driver.findElement(By.xpath(" //input[1]/following-sibling::input[2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(" //input[3]/following-sibling::*[1]")).sendKeys("Very good");
		driver.findElement(By.xpath("//form/div/input[1]/following-sibling::*")).click();
	}

}
