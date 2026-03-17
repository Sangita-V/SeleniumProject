package webdriverExamples;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindowsQA {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle - it will return the single browser window id 
		
	//	String windowID=driver.getWindowHandle();
	//	System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//getWindowHandles - it will return the multiple browser window id 
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//1st way using Iterator()
		/*
		Iterator<String> it=windowIDs.iterator();
		
		String parentWindowID=it.next();
		String childWindowID=it.next();
		
		System.out.println("Parent Window ID"+parentWindowID);
		System.out.println("Child Window ID"+childWindowID);
		*/
		
		//2nd way using List/ArrayList
		List<String> windowIDsList = new ArrayList(windowIDs);  //converting Set -->List bcoz Set don't have get method to extract id
		
		/*
		String parentwindowID=windowIDsList.get(0);
		String childwindowID=windowIDsList.get(1);
		
		System.out.println("Parent Window ID"+parentwindowID);
		System.out.println("Child Window ID"+childwindowID);

		//Switch from one window to another
		driver.switchTo().window(parentwindowID);
		System.out.println("Title of the Parent Window:"+ driver.getTitle());
		
		driver.switchTo().window(childwindowID);
		System.out.println("Title of the Child Window:"+ driver.getTitle());
		
		
		for(String winid:windowIDsList)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		*/
		
		//Approach2
		for(String winID:windowIDs)
		{
		    String title=driver.switchTo().window(winID).getTitle();
		    
		    if(title.equals("OrangeHRM"))
		    {
		        System.out.println(driver.getCurrentUrl());
		        //some validation on the parent window
		    }
		}
		
		//driver.close();
		//driver.quit();
		
		//Close specific window
		
		for(String winid:windowIDsList)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
	}

}
