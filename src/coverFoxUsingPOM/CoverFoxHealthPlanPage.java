package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage 
{
	//data-members---->WebElements
	@FindBy(className = "next-btn") private WebElement next_btn;
	
	//constructor
	public CoverFoxHealthPlanPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void clickOnNextButton()
	{
		next_btn.click();
	}
}
