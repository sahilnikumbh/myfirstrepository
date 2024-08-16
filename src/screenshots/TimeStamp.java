package screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStamp 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		String TimeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(TimeStamp);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Screenshot Selenium\\test"+TimeStamp+".png");
		
		FileHandler.copy(source, dest);
	}

}
