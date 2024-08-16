package listBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//SELECT BY VISIBLE TEXT
public class Example2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Thread.sleep(1000);
		
		Select s = new Select(month);
		
		s.selectByVisibleText("Feb");
		Thread.sleep(1000);
	}

}
