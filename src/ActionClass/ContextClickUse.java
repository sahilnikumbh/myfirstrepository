package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickUse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		///1.CREATE AN OBJECT OF ACTION CLASS AND PASS DRIVER OBJECT AS PARA
		
		Actions action = new Actions(driver);
		
		//2.Perform action on element
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		//3.take required action
		
		action.moveToElement(rightClickButton).contextClick(rightClickButton).build().perform();
	}

}
