package listBox_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//1.Step1:Decide list box to handle and store in a ref variable
		
		Thread.sleep(1000);
		//WebElement day = driver.findElement(By.id("day"));//step1
		
		//2.Step2:Create an object of select class and pass ref-variable as argument
		//Select s = new Select(day);
		Thread.sleep(1000);
		
		//3.Step3:Use select object and call any of tree methods as per need
		//s.selectByValue("10");//value 10 is passed
		
		
		
		
		//List<WebElement> DayOptions = s.getOptions();
		//System.out.println(DayOptions.size());
		//s.selectByValue("10");
		
		
//		WebElement month = driver.findElement(By.name("birthday_month"));
//		Thread.sleep(1000);
//		
//		Select s1 = new Select(month);
//		
//		s1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByVisibleText("2007");
		Thread.sleep(1000);
		
		s2.deselectByVisibleText("2010");
		
		
	}

}
