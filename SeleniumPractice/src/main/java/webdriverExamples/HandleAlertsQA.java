package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsQA {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert with single ok button
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		*/
		
		//Confirmation Alerts - with two buttons 'Ok' and 'Cancel'
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		*/
		
		//Promting Alerts - Alert where have to enter input and select option from 'Ok' and 'Cancel' 

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.sendKeys("Hello");
		alert.accept();
	}

}
