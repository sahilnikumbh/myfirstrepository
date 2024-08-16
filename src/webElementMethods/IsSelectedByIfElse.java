package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedByIfElse
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		boolean result = female.isSelected();
		
		if(result==true)//Checking 1st time
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}

		female.click();
		boolean result1 = female.isSelected();
		
		if(result1=true)
		{
			System.out.println("Radio button is now selected");
		}
		else
		{
			System.out.println("Please select Radio button");
   
		}

	}

}
