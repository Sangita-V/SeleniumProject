package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabAndWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.TAB);   //open new tab
		driver.switchTo().newWindow(WindowType.WINDOW);  //open new window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
}
