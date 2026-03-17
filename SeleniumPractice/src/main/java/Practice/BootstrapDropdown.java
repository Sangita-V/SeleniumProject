package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/tools/BS5-dropdown-gen.php#");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Action 2']")).click();
		
	}

}
