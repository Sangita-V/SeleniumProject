package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
//		1) Flashing Element
		WebElement logo=driver.findElement(By.xpath("//div[@class='header-lower']//img"));
		JavaScriptUtil.flash(logo, driver);
		
//		2) Drawing border & take screenshot of the Element
//		WebElement logo=driver.findElement(By.xpath("//div[@class='header-lower']//img"));
//		JavaScriptUtil.drawBorder(logo, driver);
		
//		3) Get the title of the page
//		String title=JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);
				
//		4) Click action
//		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
//		JavaScriptUtil.clcikElementByJS(regLink, driver);
//		
//		5) Generate alert
//		JavaScriptUtil.generateAlert(driver, "This is alert");
		
//		6) Refreshing the page
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
//		7) Scrolling down page
//		JavaScriptUtil.scrollDownPage(driver);
//		Thread.sleep(3000);
//		
//		8) Scroll up page
//		JavaScriptUtil.scrollUpPage(driver);
//		Thread.sleep(3000);

//		9) Zoom-In Zoom-Out page
//		JavaScriptUtil.zoomPageByJS(driver);
//		Thread.sleep(3000);


	}
}
