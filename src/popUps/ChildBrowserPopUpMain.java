package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpMain
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		Thread.sleep(1000);
		
		String myText = driver.findElement(By.xpath("//h1[contains(text(),'Ready')]")).getText();
		System.out.println(myText);
		
		//Click on login with google
		driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
		
		String windowIdMainPage = driver.getWindowHandle();
		System.out.println(windowIdMainPage);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
	}

}
