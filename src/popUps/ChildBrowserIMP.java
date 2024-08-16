package popUps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class ChildBrowserIMP
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
		
		//change set-->ArrayList
		
		ArrayList<String> al= new ArrayList<String>(allWindowsId);
		
		//String mainPageId = al.get(0);
		//String childPageId = al.get(1);
		
		Iterator<String> it = al.iterator();
		String mainPageId = it.next();
		String childPageId = it.next();
		
		//to take action on child page switch to child window
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//sending email id on child page feild
		
		driver.findElement(By.id("identifierId")).sendKeys("Test1234@gmail.com");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Sign in']")).getText());
		driver.close();
		Thread.sleep(1000);
		
		//again switching to main page
		driver.switchTo().window(mainPageId);
		
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText());
		
	}
	

}
