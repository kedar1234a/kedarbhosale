package com.cjc.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		System.out.println("selenium testing");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.findElement(By.xpath("//button[@id='login']/preceding-sibling::input[2]")).sendKeys("cjc");
		//driver.findElement(By.xpath("//button[@id='login']/preceding-sibling::input[1]")).sendKeys("cjc@123");
		
		driver.findElement(By.xpath("//select/preceding-sibling::*[3]")).sendKeys("1234");//immediate preceding sibling
		WebElement w=driver.findElement(By.xpath("//button[1]/preceding-sibling::select"));
		Select s=new Select(w);
		s.selectByValue("ie");
		driver.findElement(By.xpath("//select/following-sibling::*[3]")).click();
		driver.findElement(By.xpath("//input[1]/following-sibling::button")).click();
	}


}
