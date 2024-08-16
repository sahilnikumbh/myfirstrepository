package setSizeSetPosition_Scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//TO SET SIZE--> USE DIMENSION CLASS AND CREATE OBJECT OF DIMENSION CLASS
		
		Dimension d = new Dimension(1000, 10);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

}
