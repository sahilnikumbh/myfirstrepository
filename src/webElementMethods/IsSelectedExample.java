package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(1000);
		
		boolean result = female.isSelected();
		
		System.out.println(result);
		
		Thread.sleep(1000);
		
		female.click();
		Thread.sleep(1000);
		
		boolean result1 = female.isSelected();
		System.out.println(result1);
		
		
		
	}

}
