package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapturing {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)Full page
		/*
		  TakesScreenshot ts=(TakesScreenshot) driver; File
		  sourcefile=ts.getScreenshotAs(OutputType.FILE); 
		  File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\Fullpage.png"); //System.getProperty("user.dir") - written current project location
		  sourcefile.renameTo(targetfile);
		 */
		
		//2)Specific section SS
		/*
		WebElement featuredProducts=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE); 
		File targetfile1=new File(System.getProperty("user.dir")+"\\Screenshots\\Featuredproductsection.png");
		sourcefile.renameTo(targetfile1);
		*/
		
		//3)Capture the SS of WebElement 
		WebElement news=driver.findElement(By.xpath("//h2[normalize-space()='News']"));
		File sourcefile=news.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\NewsScreenshot.png");
		sourcefile.renameTo(targetfile);
		
	}

}
