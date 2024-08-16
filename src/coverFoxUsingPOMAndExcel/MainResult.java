package coverFoxUsingPOMAndExcel;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.Utility;

public class MainResult
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		String filePath="D:\\SeleniumJava\\Excel\\Book1.xlsx";
		
		String age = Utility.readDataFromExcel(filePath, "Sheet2", 0, 0);
		String pincode = Utility.readDataFromExcel(filePath, "Sheet2", 0, 1);
		String mobileNumber = Utility.readDataFromExcel(filePath, "Sheet2", 0, 2);
		
		CoverFoxHomePage homePage = new CoverFoxHomePage(driver);
		homePage.clickOnGenderButton();
		
		CoverFoxHealthPlanPage healthPlanPage = new CoverFoxHealthPlanPage(driver);
		healthPlanPage.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		memberDetailsPage.handleAgeDropDown(age);
		memberDetailsPage.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		addressDetailsPage.enterPinCode(pincode);
		addressDetailsPage.enterMobileNumber(mobileNumber);
		addressDetailsPage.clickOnNextButton();
		
		Thread.sleep(4000);
		
		CoverFoxResultPage resultPage = new CoverFoxResultPage(driver);
		resultPage.resultOutput();
		
	}

}
