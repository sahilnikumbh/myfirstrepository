package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		Set<String> AllWindows = driver.getWindowHandles();
		System.out.println(AllWindows);
		Thread.sleep(1000);
		
		Iterator<String> it = AllWindows.iterator();
		Thread.sleep(1000);
		
		String mainPage = it.next();
		Thread.sleep(1000);
		String child = it.next();
		Thread.sleep(1000);
		driver.switchTo().window(child);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Pop Up Ex");
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(mainPage);
		Thread.sleep(1000);
		driver.findElement(By.name("home")).click();
		driver.close();
	}

}
