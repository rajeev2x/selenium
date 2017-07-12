package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeads extends LeafTapsWrappers  {

	public MyLeads(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
		/*if(!verifyTitle("My Leads | opentaps CRM"))
		{
			reportStep("This is not My Leads Page", "FAIL");
	
		}			*/	
	}
	
	public CreateLeadPage clickCreateLead()
	{		
		clickByClassName("smallSubmit");
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadsPage ClickFindLeads()
	{
		clickByLinkNoSnap("Find Leads");
		return new FindLeadsPage(driver, test);
	
	}
	
	public MergeLeadPage ClickMergeLead()
	{
		 clickByLink("Merge Leads");
		 return new MergeLeadPage(driver,test);
	}
	
}
