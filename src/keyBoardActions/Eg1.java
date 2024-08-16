package keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		WebElement nameField = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(nameField, "Velocity").perform();
		
		act.keyDown(nameField, Keys.SHIFT).sendKeys("velocity").keyUp(Keys.SHIFT).perform();
	}

}
