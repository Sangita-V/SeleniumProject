package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopupsQA {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); //use FirefoxOptions for firefox and same for other browsers
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.theguardian.com/international");
	}

}
