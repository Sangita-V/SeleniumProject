package Practice;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		//Ctr+RegLink
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//switching to register page
		List<String> ids =new ArrayList(driver.getWindowHandles());
		
		//Registration Page
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.id("FirstName")).sendKeys("Aisha");
		
		//HomePage 
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.id("small-searchterms")).sendKeys("TShirts");
	}

}
