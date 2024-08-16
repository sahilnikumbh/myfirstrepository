package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.Create an object of Action Class
		
		Actions act = new Actions(driver);
		
		//2.Find element to be worked
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		
		//3.Take Required action
		
		
		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
	}

}
