package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsQA {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("manual testing");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Manual Testing - Software Testing']")));
		element.click();
		*/
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("manual testing");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elelocator=By.xpath("//h3[text()='Manual Testing - Software Testing']");
		waitForElementPresent(driver, elelocator, 10);
	}

	
		public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));

			return driver.findElement(locator);
		}
}
