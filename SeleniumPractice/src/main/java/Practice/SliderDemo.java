package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		
		//Min Slider
		WebElement min_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println("Default locations of the min slider"+min_slider.getLocation());   //(59, 246)
		ac.dragAndDropBy(min_slider, 100, 246).perform();
		System.out.println("Loaction of min slider after moving"+min_slider.getLocation());   //(159, 246)
		
		Thread.sleep(3000);
		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println("Default location of the max slider"+max_slider.getLocation());  //(538, 246)
		Thread.sleep(5000);
		ac.dragAndDropBy(max_slider, -100, 246).perform();
		System.out.println("Location of max slider after moving"+max_slider.getLocation());   //(437, 246)
	}
}
