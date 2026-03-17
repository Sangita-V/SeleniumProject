package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		//WebElement frame = driver.findElement(By.xpath("//div[@id='s-refinements']"));
		//driver.switchTo().frame(frame);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement primeCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//span[text()='Prime Eligible']/preceding::i[1]")));
		primeCheckbox.click();
		
		driver.findElement(By.xpath("//button[@id='a-autoid-4-announce']")).click();
		driver.findElement(By.id("nav-cart")).click();
		String title=driver.getTitle();
		System.out.println(title);
		*/
		
		//List of all links 
		/*
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement allLinks:links) {
			System.out.println(allLinks.getAttribute("href"));
		}
		*/
		
		//Screenshot
		/*
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("E:\\Aisha\\scr.jpg"));
		System.out.println("Screenshot taken");
		*/
		
		//Selecting Dropdown
		/*
		Select searchCatagory = new Select(driver.findElement(By.id("searchDropdownBox")));
		searchCatagory.selectByVisibleText("Computers & Accessories");
		System.out.println(driver.findElement(By.xpath("//option[@value='search-alias=computers']")).isSelected());
		*/
		
		
		
		
		s=
		
		
		driver.quit();
		
	}
	
}
