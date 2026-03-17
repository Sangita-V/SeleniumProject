package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KB_Webdriver {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\AishaTesting\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//driver.close();
		


	}
}
