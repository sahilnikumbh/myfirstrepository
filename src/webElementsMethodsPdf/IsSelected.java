package webElementsMethodsPdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		radioButton1.click();
		
		//System.out.println(radioButton1.isSelected());
		
		if(radioButton1.isSelected())
		{
			System.out.println("Radio button is aleady selected,Thank you!");
		}
		else
		{
			radioButton1.click();
			System.out.println("Radio Button is now Selected");
		}
	}
	

}
