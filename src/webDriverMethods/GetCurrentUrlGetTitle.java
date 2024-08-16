package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlGetTitle
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
	}

}
