package miscellanous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		  List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		  
		  //HOW MANY LINKS ARE THERE
		  
		  System.out.println(totalLinks.size());
		  
		  //PRINT ALL LINKS
		  //USING FOR LOOP
//		  for(int i=0;i<=totalLinks.size()-1;i++)
//		  {
//			  System.out.println(totalLinks.get(i).getText());
//		  }
		  
		  //USING FOR EACH
//		  for(WebElement t:totalLinks)
//		  {
//			  System.out.println(t.getText());
//		  }
		  
		 Iterator<WebElement> it = totalLinks.iterator();
		 while(it.hasNext())
		 {
			String text = it.next().getText();
			System.out.println(text);
			//System.out.println(it.next().getText());
		 }
	}
}
