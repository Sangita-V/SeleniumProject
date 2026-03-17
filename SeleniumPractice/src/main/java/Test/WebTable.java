package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		//count
		int row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();  
		int col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td")).size();  
		int row_col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td")).size();  
		
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		
		//cell_data
		String cell_data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[3]")).getText();
		System.out.println(cell_data);
		
		//table_data
		
		for (int i=1; i<=row; i++) {
			String tabledata = driver.findElement
					(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]")).getText();
			System.out.println(tabledata);

		}

		driver.close();
	}

}
