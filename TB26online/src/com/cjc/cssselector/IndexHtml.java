package com.cjc.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexHtml {
	public static void main(String[] args) {
		
	
	System.out.println("hello selenium");
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\adhya\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
	//driver.findElement(By.cssSelector("input#uid")).sendKeys("cjc");
	driver.findElement(By.cssSelector("div[class='container'] > input[id='uid']")).sendKeys("cjc");//direct child
	//driver.findElement(By.cssSelector("input.pass")).sendKeys("Cjc@123");
	
	driver.findElement(By.cssSelector("div[class='container'] :nth-child(6)")).sendKeys("cjc@123");//nth child
	WebElement w=driver.findElement(By.cssSelector("select[id='browser']"));
	Select s=new Select(w);
	s.selectByVisibleText("Firefox");
	driver.findElement(By.cssSelector("input.rem[id='remem']")).click();
	//driver.findElement(By.cssSelector("button[name^='log']")).click();
	driver.findElement(By.cssSelector("div.container button:nth-of-type(1)")).click();//nth of type
	//driver.findElement(By.cssSelector("button[id$='cel']")).click();
	//driver.findElement(By.cssSelector("a[href*='etpa']")).click();


}
}