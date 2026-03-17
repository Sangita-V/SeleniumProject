package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SScreenshot {

	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String uname = "Admin";
	static String password = "admin123";
	static String title = "OrangeHRM";
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\AishaTesting\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	try {
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
	System.out.println(1/0);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	}//end try block
//	catch(Exception e) { // taking screenshot using apache common IO libraries 
//		e.printStackTrace();
//		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(f1, new File("G:\\SeleniumSS.png"));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//	}
	catch (Exception e) { // taking screenshot using FileHandler class from selenium, no need to import external libraries
		TakesScreenshot tc = ((TakesScreenshot)driver);
		File source = tc.getScreenshotAs(OutputType.FILE);
		File dFile = new File("G:\\SeleniumSS.png");
		try {
			FileHandler.copy(source, dFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	driver.close(); 
	
	}
}