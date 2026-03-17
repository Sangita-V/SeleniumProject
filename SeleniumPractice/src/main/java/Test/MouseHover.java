package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	static String url = "https://www.amazon.in/";
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\AishaTesting\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(2000);
		
		//MouseHover
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Fresh"))).perform();
		System.out.println("Mouse hover completed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Amazon Fresh Meat']")).click();
		 
		driver.close(); 
	}

}
