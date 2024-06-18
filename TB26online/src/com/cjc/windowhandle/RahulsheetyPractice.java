package com.cjc.windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulsheetyPractice {
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Total Hyperlink
		List a1= driver.findElements(By.tagName("a"));
		int totalhl = a1.size();
		System.out.println(totalhl);
		
		WebElement flink = driver.findElement(By.id("gf-BIG"));
		List a2 = flink.findElements(By.tagName("a"));
		System.out.println(a2.size());

		//count particular footer hyperlink
				WebElement pflink = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
				List a = pflink.findElements(By.tagName("a"));
				int count = a.size();
				System.out.println(count);
				
				//Traverse
				for(int i=0; i<count-1; i++)
				{
					String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
					pflink.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
					Thread.sleep(2000);
				
				}
 
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		ArrayList<String> allist = new ArrayList<String>(s);
		
		Iterator<String> itr=allist.iterator();//Traverse the collection access the data elements and remove data elements
		
		while(itr.hasNext())//hasNext method return true if given list iterator contains more number of element during traversing the given list in the forward direction
		{
			driver.switchTo().window(itr.next());
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
		}

}
}