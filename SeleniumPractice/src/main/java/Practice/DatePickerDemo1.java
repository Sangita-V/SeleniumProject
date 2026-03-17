package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		String month="April";
		String year="2026";
		String date="25";
		
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0, 1000).perform();
		
		driver.findElement(By.id("first_date_picker")).click();
		
		while(true)
		{
			String selectedmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String selectedyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(selectedmonth.equals(month) && selectedyear.equals(year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
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
