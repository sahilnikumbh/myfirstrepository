package mouseActions;

import org.openqa.selenium.By;
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
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//CLICK ACTION USING ACTION CLASS
		
		//1.Find the target element and store it in reference variable
		
		WebElement radio1Button = driver.findElement(By.className("radioButton"));
		
		//2.Create an object of Action Class and pass WebDriver object as argument
		
		Actions act = new  Actions(driver);
		
		//3.Perform Action
		
		//act.moveToElement(radio1Button).click().build().perform();
		
		act.click(radio1Button).perform();
	}

}
