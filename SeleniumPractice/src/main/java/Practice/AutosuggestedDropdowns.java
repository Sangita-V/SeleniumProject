package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(list.size());
		
		/*
		for(WebElement options:list)
		{
			System.out.println(options.getText());
		}
		*/
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("javascript"))
			{
				list.get(i).click();
				break;
			}
		}
	}
}
