package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\Aisha\\demo.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("demo.txt"))
		{
			System.out.println("File successfully uploaded");
		}
		else
		{
			System.out.println("Upload failed");
		}
		*/
		
		//Multiple file upload
		String file1="E:\\Aisha\\demo.txt";
		String file2="E:\\Aisha\\aisha.pem";
				
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//Validation for no of files
		if(noOfFilesUploaded==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//Validation for file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("demo.txt")
			&& (driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("aisha.pem")))
		{
			System.out.println("File names matching");
		}
		else
		{
			System.out.println("Files are not matching");
		}
	}
}
