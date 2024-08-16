package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		Thread.sleep(1000);
		
		//alert will pop up now need to handle popup alert
		//need to switch focus
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();//handled alert popup
		
		Thread.sleep(1000);
		String myText = driver.findElement(By.xpath("//h1[text()='Alerts']")).getText();
		System.out.println("Alerts page came with text "+myText);
		
	}

}
