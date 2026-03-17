package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find total number of rows
		//1) int rows=driver.findElements(By.tagName("tr")).size();   ///use only when single table on webpage
		
		//2
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows:"+rows);
		
		//Find total number of columns
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns:"+col);
		
		//Read specific data from table
		String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[3]")).getText();
		System.out.println(subject);

		//Read all the data from table
		/*for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		*/
		
		//Print book names where author is Amit
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(author.equals("Amit"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println("Author names is:"+author+"and book name is:" +bookName);
			}
		}
		
		//Find total price of all the books 
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("Total price of all the books is:"+total);
	}
}
