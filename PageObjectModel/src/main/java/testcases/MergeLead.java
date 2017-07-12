package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers
{

	@BeforeClass
	public void setData() 
	{
		testCaseName="MergeLead";
		testDescription="Merge Lead";
		browserName="chrome";
		dataSheetName="MergeLead";
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
		.ClickLeads()
		.ClickFindLeads()
				
		;
		
	}
	}