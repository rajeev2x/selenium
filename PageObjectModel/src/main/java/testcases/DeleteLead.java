package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class DeleteLead extends LeafTapsWrappers
{

	@BeforeClass
	public void setData() 
	{
		testCaseName="DeleteLead";
		testDescription="Delete Lead";
		browserName="chrome";
		dataSheetName="DeleteLead";
		category="Smoke";
		authors="Rajeev";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,String PhoneNumber) throws InterruptedException
	{
		String firstleadvalue = null;
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)		
		.clickLogin()
		.clickCRMSFA()
		.ClickMyLeadsLink()
		.ClickFindLeads()
		.ClickPhoneTab()
		.enterPhoneNumber(PhoneNumber)
		.ClickFindLeadsButton();
		Thread.sleep(2000);
		FindLeadsPage flp=new FindLeadsPage(driver, test);
		firstleadvalue = flp.getFirstLeadID();
		flp.ClickFirstResultingLead()
		.ClickDeleteButton()
		.ClickFindLeads()
		.EnterLeadID(firstleadvalue)
		.ClickFindLeadsButton()
		.verifyErrormessage(firstleadvalue);
		
	}
}