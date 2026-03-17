package webdriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingQA {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\AishaTesting\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		ArrayList<String> handlewindow = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(handlewindow.size());
		driver.switchTo().window(handlewindow.get(1));
		Thread.sleep(2000);
		driver.close();
	}

}
