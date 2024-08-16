package mouseActions;

import org.openqa.selenium.By;
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//RIGHT CLICK(CONTEXT CLICK) USING ACTION CLASS
		
		//1.Find the element and store it in reference variable
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//2.Create an object of Actions Class,pass driver as an argument
		Actions action = new Actions(driver);
		
		//3.Using Action Class take necessary action
		//action.moveToElement(rightClickButton).contextClick().build().perform();//right click using action class
		
		//action.contextClick(rightClickButton).perform();//right click using action class
		
		System.out.println("============================================================================");
		
		
		//DOUBLE CLICK USING ACTION CLASS
		//1.Find the element and store it in reference variable
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'To See')]"));
		
		//2.Create an object of Actions Class,pass driver as an argument
		//Here object is already created
	  
		//3.Using Action Class take necessary action
		
		//action.doubleClick(doubleClickButton).perform();
		
		action.moveToElement(doubleClickButton).doubleClick().build().perform();
		
	}

}
