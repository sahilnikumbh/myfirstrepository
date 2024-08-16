package setSizeSetPosition_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);

		//Handling hidden diversion pop-up
		driver.findElement(By.className("react-responsive-modal-closeButton")).click();
		Thread.sleep(4000);
		
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 
		
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,2000)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,500)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-2000)");

	}
}

