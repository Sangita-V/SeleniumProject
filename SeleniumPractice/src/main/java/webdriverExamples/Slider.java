package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("(//span)[1]"));
		
		System.out.println("Location of the min slider:"+min_slider.getLocation());    //(277, 195)
		System.out.println("Height and width of the min slider:"+min_slider.getSize());   //(19, 20)
		
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(min_slider, 310, 0).perform();
		
		WebElement max_slider=driver.findElement(By.xpath("(//span)[2]"));
		
		ac.dragAndDropBy(max_slider, -200, 0).perform();
	}

}
