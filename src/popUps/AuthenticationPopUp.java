package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//How to handle https://username:password@URL
		//username:admin
		//password:admin
		//URL:https://the-internet.herokuapp.con/basic_auth
		
		String username="admin";
		String password="admin";
		
		//driver.get("https://the-internet.herokuapp.con/basic_auth");
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.con/basic_auth");
		System.out.println(driver.findElement(By.tagName("p")).getText());
	}

}
