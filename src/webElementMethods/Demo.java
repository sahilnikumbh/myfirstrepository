package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("Sahil");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Nikumbh");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).clear();
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_s_')]")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Create a')]")).getText();
		System.out.println(text);
	}

}
