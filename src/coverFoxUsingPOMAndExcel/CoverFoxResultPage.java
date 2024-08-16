package coverFoxUsingPOMAndExcel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage 
{
	@FindBy(xpath = "//div[text()='50 matching Health Insurance Plans']")private WebElement text;
	@FindBy(className = "plan-card-container") private List<WebElement> list;
	
	
	public CoverFoxResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void resultOutput()
	{
		String[] ar = text.getText().split(" ");
		int result = Integer.parseInt(ar[0]);
		
		if(result==list.size())
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}
}

