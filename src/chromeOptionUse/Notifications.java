package chromeOptionUse;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("disabled-notifications");
		//IF WE WANT TO PASS MULTIPLE ARGUMENTS-->CREATE AN OBJECT OF LIST
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("disabled-notifications");
		al.add("start-maximized");
		al.add("incognito");
		
		option.addArguments(al);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
	}

}
