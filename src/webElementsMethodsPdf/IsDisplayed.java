package webElementsMethodsPdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox")); 
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		
		//driver.findElement(By.xpath("//a[contains(text(),'Free Access')]"));
		Thread.sleep(1000);
		
		//hideButton.click();
		
		WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
		if(hiddenTextBox.isDisplayed())
		{
			hiddenTextBox.sendKeys("velocity");
		}
		else
		{
			showButton.click();
			hiddenTextBox.sendKeys("Pune");
		}
	}

}
