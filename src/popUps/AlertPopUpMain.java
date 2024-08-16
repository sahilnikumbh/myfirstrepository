package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpMain 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("Sahil");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//need to switch selenium focus to alert
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();//switched the focus to alert popup
		//Need to use one of three methods
		
		alt.accept();//accept the alert pop up
		System.out.println(alt.getText());
		
		//There is one more popup ,lets handle this
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		String myText = driver.findElement(By.className("barone")).getText();
		System.out.println(myText);
	}

}
