package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//how many rows are there
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int totalNumberOfRows = rows.size();
		System.out.println("Total Number Of Rows are "+totalNumberOfRows);
		
		//how many columns are there
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		int totalNumberOfColumns = columns.size();
		System.out.println("Total Number Of Colums are "+totalNumberOfColumns);
		
		//how to read particular data from table
		WebElement myElement = driver.findElement(By.xpath("//table[@name='courses']//tr[3]/td[2]"));
		String myText = myElement.getText();
		System.out.println("Data is "+myText);
		
		//how to read particular data from table
		//table[@name='courses']//tr[5]/td[1]
		//table[@name='courses']//tr[5]/td[2]
		//table[@name='courses']//tr[5]/td[3]
		
		
		for(int i=1;i<=3;i++)
		{
			WebElement element = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
			String text = element.getText();
			System.out.println(text);
		}
		
	}

}
