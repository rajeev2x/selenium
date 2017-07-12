package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="CreateLead";
		testDescription="Create Lead";
		browserName="chrome";
		dataSheetName="CreateLead";
		category="Smoke";
		authors="Rajeev";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String companyName, String firstName, String lastName)
	{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.verifyCompanyName(companyName);
		 closeBrowser();
	}

}
