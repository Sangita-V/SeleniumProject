package webdriverExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTesingQA {
	public static void main(String[] args) throws InterruptedException, SQLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		
		//Data
		String fName = "Aiser";
		String lName = "Choudhr";
		String email = "aishcrter@gmail.com";
		String password = "aisha2g";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(fName);
		driver.findElement(By.name("lastname")).sendKeys(lName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(email);
		Thread.sleep(5000);
		WebElement agreeButton = driver.findElement(By.name("agree"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agreeButton);
		agreeButton.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		try
		{
		String confmsg=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			System.out.println("Registration successfull");
		}
		else
		{
			System.out.println("Registration not successfull");
		}
		}
		catch(Exception e)
		{
			System.out.println("some problem in the application!");
		}
		
		
		//Database connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/opencart", "root", "Shubh@1995");
		
		//through that connection we execute a statement 
		Statement stmt=con.createStatement();
		
		String query="select fName,lName,email,password from cust_data";
		
		ResultSet rs=stmt.executeQuery(query);
		
		boolean status=false;
		
		while(rs.next())
		{
			String firstName=rs.getString("fName");
			String lastName=rs.getString("lName");
			String emailid=rs.getString("email");
			String password1=rs.getString("password");

			if(fName.equals(firstName) && lName.equals(lastName) 
					&& email.equals(emailid) && password.equals(password1));
			{
				System.out.println("Record found in the table");
				status=true;
				break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Record not found");
		}
		
	}

}
