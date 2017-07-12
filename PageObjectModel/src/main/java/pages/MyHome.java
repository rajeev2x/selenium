package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHome extends LeafTapsWrappers {
	
	public MyHome(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My Home Page", "FAIL");
		}
	}
	
	public MyLeads ClickLeads()
	{
		clickByLinkNoSnap("Create Lead");
		return new MyLeads(driver, test);
	}
	
	public MyLeads ClickMyLeadsLink()
	{
		clickByLinkNoSnap("Leads");
		return new MyLeads(driver, test);
	}
	
	

}
