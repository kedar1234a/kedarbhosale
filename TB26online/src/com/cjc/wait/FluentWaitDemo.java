package com.cjc.wait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\adhya\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(8))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement we=w.until(new Function<WebDriver,WebElement>()
				{

					@Override
					public WebElement apply(WebDriver t) {
						
						WebElement msg=t.findElement(By.id("demo"));
						System.out.println("fluent wait");
						String msgvalue=msg.getText();
						
						if(msgvalue.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
						{
							System.out.println("if condition");
							return msg;
						}
						else
						{
						return null;
						}
					}
			
				});
	}

}
