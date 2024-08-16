package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		//switching to parent frame
		driver.switchTo().frame("frame1");
		
		String myParentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(myParentText);
		Thread.sleep(2000);
		
		//need to switch to nested frame(child frame)	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		String myChildText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println(myChildText);
		
		
		//finding element from main page
		//need to switch from child to main page
		
		driver.switchTo().defaultContent();
		
		String mainPageText = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
		System.out.println(mainPageText);
	}

}
