package webdriverExamples;

import java.time.Duration;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTablewithPaginationQA {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		driver.manage().window().maximize();
		
		//Find Total no of pages in table
		String text= driver.findElement(By.xpath("//div[@class='dt-info']")).getText();
		System.out.println(text);
		
		String total_pages = text.substring(text.indexOf("of")+3, text.indexOf("entries")-1);
		System.out.println("Total no of pages are:"+total_pages);
		
		//Find how many rows exist in each pages
		
		for(int p=1; p<=6; p++) {
			
			WebElement current_page=driver.findElement(By.xpath("//nav[@aria-label='pagination']//button"));
			System.out.println("Current Page"+current_page.getText());
			current_page.click();
			
			int rows=driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
			System.out.println("Number of rows:"+rows);
			
			//Read all the rows from each page
				for(int r=1; r<=rows; r++) {
					String name=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[1]")).getText();
					String position=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[2]")).getText();
					String office=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[3]")).getText();

					System.out.println(name+"   "+position+"   "+office);
				}
			
			String pageno=Integer.toString(p+1);
			driver.findElement(By.xpath("//nav[@aria-label='pagination']//button[normalize-space(text())='"+pageno+"']")).click();
		}
	}

}
