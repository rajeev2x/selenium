package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;

		/*if(!verifyTitle(" opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}*/
		
	}
	
	public EditLeadPage ChangeCompanyname(String companyName)
	{
		enterById("updateLeadForm_companyName", companyName);
		return this;
	}
	
	public ViewLeadPage Clickupdate()
	{
		clickByXpathNoSnap("//input[@class='smallSubmit']");
		return new ViewLeadPage(driver,test);
	}
	
}