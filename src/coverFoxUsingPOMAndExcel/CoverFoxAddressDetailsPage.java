package coverFoxUsingPOMAndExcel;

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
	
	public void enterPinCode(String pincode)
	{
		pincodebar.sendKeys(pincode);
	}
	
	public void enterMobileNumber(String mobileNum)
	{
		mobNumberField.sendKeys(mobileNum);
	}
	
	public void clickOnNextButton()
	{
		next_button.click();
	}
}
