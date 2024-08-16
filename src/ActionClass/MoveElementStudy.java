package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementStudy
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//handling hidden division pop up
		driver.findElement(By.className("react-responsive-modal-closeButton")).click();
		Thread.sleep(1000);
		
		//1.To take mouse actions,need to create object of Actions class and pass webdriver object as parameter
		Actions act = new Actions(driver);
		
		//find element to be act
		
		WebElement aboutUs = driver.findElement(By.xpath("(//a[text()=' About Us'])[1]"));
		
		//now take action and perform
		
		act.moveToElement(aboutUs).perform();
		Thread.sleep(1000);
		
		//aboutUs.click();//using WebElement method;
		
		act.click().perform();//click method using action class
		
		//I want to click on radio button
		
		//WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio`']"));
		
		//act.moveToElement(radio1).click().build().perform();
		
		
		
		
	}

}
