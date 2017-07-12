package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class FindLead extends LeafTapsWrappers
{

	@BeforeClass
	public void setData() 
	{
		testCaseName="FindLead";
		testDescription="Find Lead";
		browserName="chrome";
		dataSheetName="FindLead";
		category="Smoke";
		authors="Rajeev";
	}
	
	@Test(dataProvider="fetchData")
	public void FindLeadCase(String userName, String password, String companyName, String firstName,String LastName) throws InterruptedException
	{
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.ClickMyLeadsLink()
		.ClickFindLeads()
		.EnterFirstName(firstName)
		.ClickFindLeadsButton()
		.ClickFirstResultingLead()
		//.verifyTitleOfPage()
		.ClickEditLead()
		.ChangeCompanyname(companyName)
		.Clickupdate()
		.ConfirmCompanynameChange(companyName);
		
	}
}
