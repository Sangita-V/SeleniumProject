package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountry=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(drpCountry);
		//dropdown.selectByVisibleText("Australia");
		
		//capture the options from dropdown
		List<WebElement> options=dropdown.getOptions();
		System.out.println("Total options are:"+options.size());    //10
		
		//Print the options 
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		//Enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}
}
