package chromeOptionUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg1 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("incognito");
		options.addArguments("headless");
		//Headless mode means that the browser will run without a graphical user interface (GUI). 
		//Essentially, it operates in the background and doesn't open a visible window
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("velocity");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 String str = RandomString.make(3);
		
		File dest = new File("D:\\Screenshot Selenium\\use"+str+".png");
		
		FileHandler.copy(src, dest);
	}

}
