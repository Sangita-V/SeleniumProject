package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//1.Scrolling page using pixel
		//js.executeScript("window.scrollBy(0,1000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset"));
		
		//2.Scrolling page until element is visible
		/*
		WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='News']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset"));
		*/
		
		//3.Scrolling page till end 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//Scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
