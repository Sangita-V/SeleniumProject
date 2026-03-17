package webdriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxSelectionQA {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select all checkbox
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total no of checkboxes"+checkbox.size());
		
		/*for(int i=0; i<checkbox.size(); i++)
		{
			checkbox.get(i).click();
		}*/
		
		//Select by choice
		/*
		for(WebElement chbox:checkbox)
		{
			String checkboxvalue=chbox.getAttribute("value");
			if(checkboxvalue.equals("football") || checkboxvalue.equals("baseball"))
			{
				chbox.click();
			}
		}
		*/
		
		//select last 2 check boxes
		/*
		int totalcheckboxs=checkbox.size();
		
		for(int i=totalcheckboxs-2; i<totalcheckboxs; i++)
		{
			checkbox.get(i).click();
		}  */
		
		//select first 2 check boxes
		/*
		int totalcheckboxs=checkbox.size();
		
		for(int i=0; i<totalcheckboxs; i++)
		{
			if(i<2)
			{
			checkbox.get(i).click();
			}
		}  
		*/
		
		//Unselect selected checkboxes
		
		for(int i=0; i<3; i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=0; i<checkbox.size(); i++)
		{
			if(checkbox.get(i).isSelected())
			{
				checkbox.get(i).click();
			}
		}
		
	}

}
