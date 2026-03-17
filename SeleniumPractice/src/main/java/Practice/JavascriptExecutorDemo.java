package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//Passing the text into input box - alternate of senKeys()
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'Aisha')", inputbox);
		
		//Clicking on element - alternate of click()
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", radiobtn);
	}
}
