package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersUsingClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//CLASS
		WebElement radioButton = driver.findElement(By.className("radioButton"));
		radioButton.click();
		
		//LINKTEXT
		//WebElement openTabButton = driver.findElement(By.linkText("Open Tab"));
		//openTabButton.click();
		
		//PARTIAL LINKTEXT
		//driver.findElement(By.partialLinkText("Open")).click();
		
		//CSS--->TAG AND ID
		driver.findElement(By.cssSelector("button#openwindow")).click();
		
		//driver.findElement(By.cssSelector("button.btn-style class1")).click();
	}

}
