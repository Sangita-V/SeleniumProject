package webdriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAutoSuggestDropdownOptionsQA {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg  sa_blue_hv   ']//span"));
		System.out.println("Size of the Auto Suggesions"+list.size());
		
		for(WebElement listitem:list) 
		{
			if(listitem.getText().equals("selenium webdriver"))
			{
				listitem.click();
				break;
			}
		}
		*/
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@role='presentation']//div[@class='eIPGRd']//div[@class='pcTkSc']//div[@class='wM6W7d']//span"));
		System.out.println("List of suggested dropdowns"+list.size());
		
		for(WebElement listitem:list) 
		{
			if(listitem.getText().equals("selenium latest version"))
			{
				listitem.click();
				break;
			}
		}
		
	}

}
