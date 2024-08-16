package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropStudy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("(//li[@data-id='2'])[2]"));
		Thread.sleep(1000);
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Thread.sleep(1000);
		
		act.moveToElement(src).doubleClick().build().perform();
		Thread.sleep(1000);
		
		act.dragAndDrop(src, dest).perform();
		
		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}

}
