package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String uname = "Admin";
	static String password = "admin123";
	static String title = "OrangeHRM";
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\AishaTesting\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	if(driver.getTitle().equals(title)) {
		System.out.println("Title Matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	//explicit wait - will wait until the condition is fulfilled 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	wait.until(ExpectedConditions.
			elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Implicit Wait - wait until page loads 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.close(); 
	
	}

}
