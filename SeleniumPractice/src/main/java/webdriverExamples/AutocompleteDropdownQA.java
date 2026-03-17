package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteDropdownQA {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.yelp.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.id("search_location"));
		searchBox.clear();
		searchBox.sendKeys("San Jose");
		
		String text;
		
		do
		{
			searchBox.sendKeys(Keys.ARROW_DOWN);
			
			text=searchBox.getAttribute("value");
			
			if(text.equals("San Jose, CA, United States"))
			{
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
	}

}
