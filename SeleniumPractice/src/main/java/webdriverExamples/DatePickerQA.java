package webdriverExamples;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerQA {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		String year= "2026";
		String month= "August";
		String date= "2";
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();

		//month and year selection
		
		while (true)
		{
			String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthyear);
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		//Date selection
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}
	}

}
