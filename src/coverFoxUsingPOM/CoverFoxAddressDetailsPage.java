package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage
{
	@FindBy(className = "mp-input-text") private WebElement pincodebar;
	@FindBy(id = "want-expert") private WebElement mobNumberField;
	@FindBy(className = "next-btn") private WebElement next_button;
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPinCode()
	{
		pincodebar.sendKeys("422001");
	}
	
	public void enterMobileNumber()
	{
		mobNumberField.sendKeys("7066669535");
	}
	
	public void clickOnNextButton()
	{
		next_button.click();
	}
}
