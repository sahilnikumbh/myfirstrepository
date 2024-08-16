package setSizeSetPosition_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		//Handling hidden diversion pop-up
		driver.findElement(By.className("react-responsive-modal-closeButton")).click();
		Thread.sleep(4000);
		
		WebElement ref = driver.findElement(By.xpath("//strong[text()='Velocity Latur Branch']"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		Thread.sleep(3000);
		j.executeScript("arguments[0].scrollIntoView(true);", ref);
		
		
	}

}
