package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathStudy
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(2000);
		
		//Xapth
		driver.findElement(By.xpath("//input[@type='tel']"));
		
		//ID
		driver.findElement(By.id("mobileNumber"));
		
		//NAME
		driver.findElement(By.name("mobileNumber"));
	}

}
