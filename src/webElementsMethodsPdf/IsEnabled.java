package webElementsMethodsPdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		
		 //driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		//driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		
		
		WebElement mobileNum = driver.findElement(By.id("mobileNumber"));
		mobileNum.sendKeys("7066669535");
		
		WebElement otpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = otpButton.isEnabled();
		
		System.out.println(result);
		
		otpButton.click();
		
		System.out.println(result);
	}

}
