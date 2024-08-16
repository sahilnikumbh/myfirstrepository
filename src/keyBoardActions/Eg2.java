package keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		//1.
		WebElement dayFeild = driver.findElement(By.id("day"));
		
		//2.
		Actions act = new Actions(driver);
		
		//3.
		act.click(dayFeild).perform();
		
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1000);
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
