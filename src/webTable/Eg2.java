package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//how many rows are there
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int numberOfRows = rows.size();
		System.out.println("Total Number of Rows are "+numberOfRows);
		
		//how many columns are there
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		int numberOfColumns = columns.size();
		System.out.println("Total Number of Columns are "+numberOfColumns);
		
		//how to read particular data from table
		WebElement myElement = driver.findElement(By.xpath("//table[@name='courses']//tr[3]/td[2]"));
		String myText = myElement.getText();
		System.out.println(myText);
		
		//how to read particular data from table
		//table[@name='courses']//tr[5]/td[1]
		//table[@name='courses']//tr[5]/td[2]
		//table[@name='courses']//tr[5]/td[3]
		
		for(int i=1;i<=numberOfColumns;i++)
		{
			WebElement element = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
			String text = element.getText();
			System.out.println(text);
		}
		
		//how to read particular columns from table
		for(int i=2;i<=numberOfRows;i++)
		{
			WebElement element = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]"));
			String text = element.getText();
			System.out.println(text);
		}
		
		System.out.println("====================================================================================");
		
		//how to read all data---->excluding header
		for(int i=1;i<=numberOfColumns;i++)
		{
			String header = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+i+"]")).getText();
			System.out.println(header+ "");
		}
		System.out.println();
		//outer loop --->row
			for(int i=2;i<=numberOfRows;i++)
			{
				//inner loop-->columns
				for(int j=1;j<=numberOfColumns;j++)
				{
					String myText1 = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(myText1+ " ");
			}
				System.out.println();
		}
	}

}
