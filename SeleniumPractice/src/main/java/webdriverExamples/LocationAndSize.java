package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationAndSize {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img"));
		
		//Location - method 1
		System.out.println("Location(x,y):"+logo.getLocation());
		System.out.println("Location(x):"+logo.getLocation().getX());
		System.out.println("Location(y):"+logo.getLocation().getY());

		//Location - method 2
		System.out.println("Location(x):"+logo.getRect().getX());
		System.out.println("Location(y):"+logo.getRect().getY());
		
		//Size - method 1
		System.out.println("size(width,height):"+logo.getSize());
		System.out.println("size(width):"+logo.getSize().getWidth());
		System.out.println("size(height):"+logo.getSize().getHeight());

		//size - method 2
		System.out.println("size(height):"+logo.getRect().getDimension().getHeight());
		System.out.println("size(width):"+logo.getRect().getDimension().getWidth());
	}

}
