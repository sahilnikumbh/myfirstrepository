package setSizeSetPosition_Scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		
		//TO SET POSITION-->USE POINT CLASS AND CREATE OBJECT OF POINT CLASS
		
		Point p = new Point(800, 500);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());


	}

}
