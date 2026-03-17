package webdriverExamples;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWorldFileQA {
	public static void main(String[] args) {
		
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		
		//Chrome
		/* HashMap preferences=new HashMap();
		preferences.put("download.default_directory",location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);   */
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory",location);
		
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}

}
