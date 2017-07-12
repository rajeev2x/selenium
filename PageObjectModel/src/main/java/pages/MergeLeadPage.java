package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
		{
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public MergeLeadPage ClickIconFromLead()
	{
		 clickByXpath("(//img[@alt='Lookup'])[1]");
		 return this;
	}
	
	public void switchToSecondaryWindow()
	{
		
	}
	
}
	