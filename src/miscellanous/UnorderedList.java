package miscellanous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Software");
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='erkvQe']"));
		
		System.out.println(results.size());
		Thread.sleep(1000);
		
		//for each
		
		for(WebElement r:results)
		{
			System.out.println(r.getText());
		}
		
	}

}
