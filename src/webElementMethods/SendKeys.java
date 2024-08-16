package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Without using WebElement
		//driver.findElement(By.id("email")).sendKeys("sahilnikumbh99@gmail.com");
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("email")).clear();
		//Thread.sleep(2000);
		
		//With using WebElement
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("1234");
		Thread.sleep(1000);
		
		email.clear();
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		System.out.println("Text is "+text);

	}

}
