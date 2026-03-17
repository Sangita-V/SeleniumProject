package webdriverExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileQA {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		//using sendkeys
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("G:\\Notepad.txt");
		//System.out.println("Uploaded file");
		
		//using robot class
		/*
		 * 1.copy path of the file
		 * 2.Ctr+v
		 * 3.Enter
		 */
		 
		WebElement button = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
		
		// Copy the path
		StringSelection ss = new StringSelection("G:\\Notepad.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// CTRL + V
		Robot rb = new Robot();
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL); // Press on CTRL key
		rb.keyPress(KeyEvent.VK_V); // Press on V key
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		// ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Uploaded file");

	}
}
