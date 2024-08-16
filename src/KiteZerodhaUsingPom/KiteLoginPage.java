package KiteZerodhaUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	@FindBy(id = "userid") private WebElement userIdField;
	@FindBy(id = "password") private WebElement passwordFeild; 
	@FindBy(className = "button-orange wide") private WebElement logInButton;
	
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
	{
		userIdField.sendKeys("MG6774");
	}
	
	public void EnterUserPassword()
	{
		passwordFeild.sendKeys("sahil@111");
	}
	
	public void ClickOnLoginButton()
	{
		logInButton.click();
	}
}
