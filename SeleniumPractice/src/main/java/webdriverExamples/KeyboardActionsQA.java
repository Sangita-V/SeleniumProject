package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionsQA {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		driver.get("https://the-internet.herokuapp.com/key_presses");
//		
//		Actions ac=new Actions(driver);
//		ac.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
//		
//		ac.sendKeys(Keys.ESCAPE).perform();
//		Thread.sleep(3000);
//
//		ac.sendKeys(Keys.F10).perform();
//		Thread.sleep(3000);
//
//		ac.sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(3000);


		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		
		input1.sendKeys("Welcome!!");
		
		Actions ac = new Actions(driver);
		
		//Ctrl + a
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("a");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		//Ctrl + c
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("c");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		//enter tab
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		//Ctrl + v
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("v");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
				
		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Text copied");
		else
			System.out.println("Text not copied");
		
	}
}
