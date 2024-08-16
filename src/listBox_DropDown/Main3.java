package listBox_DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		//1.
		WebElement multiSelectDropDown = driver.findElement(By.id("cars"));
		//2
		Select s = new Select(multiSelectDropDown);
		//3.
		System.out.println(s.isMultiple());
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("volvo");
		Thread.sleep(1000);
		s.selectByVisibleText("Audi");
	}

}
