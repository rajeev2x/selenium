package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers
{

	@BeforeClass
	public void setData() 
	{
		testCaseName="DuplicateLead";
		testDescription="Duplicate Lead";
		browserName="chrome";
		dataSheetName="Duplicate";
		category="Smoke";
		authors="Rajeev";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,String EmailAddress) throws InterruptedException
	{
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)		
		.clickLogin()
		.clickCRMSFA()
		.ClickMyLeadsLink()
		.ClickFindLeads()
		.clickEmailTab()
		.enterEmail(EmailAddress)
		.ClickFindLeadsButton();
		FindLeadsPage flp=new FindLeadsPage(driver, test);
		String firstleadname=flp.getFirstName();
		flp.ClickFirstResultingLeadDup();
		flp.ClickDuplicateButton()
		.clickCreateLead();
		System.out.println(firstleadname);
		new ViewLeadPage(driver, test)
		.ConfirmnameChange(firstleadname);
			
		
	}
}