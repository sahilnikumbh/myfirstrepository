package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();//switch to parent frame
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
