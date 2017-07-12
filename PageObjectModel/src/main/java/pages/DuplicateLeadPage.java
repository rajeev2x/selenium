package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers  {

	// This is to confirm you are in DuplicateLead Page
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		/*if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
		*/
	}
	
	
	public ViewLeadPage clickCreateLead()
	{
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver,test);
	}
	
	
	
	
	
	
	
}