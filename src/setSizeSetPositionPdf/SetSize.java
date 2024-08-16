package setSizeSetPositionPdf;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		
		//TO SET THE SIZE WE NEED TO CREATE OBJECT OF DIMENSION CLASS
		Thread.sleep(2000);
		
		Dimension d = new Dimension(500, 1050);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Dimension d1 = new Dimension(1500, 50);
		driver.manage().window().setSize(d1);
	}

}
