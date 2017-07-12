package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find leads Page", "FAIL");
		}
	} 


public FindLeadsPage EnterFirstName(String firstName)
{
	enterByXpath("(//input[@name='firstName'])[3]", firstName);

	return this ;
}


public FindLeadsPage EnterLeadID(String LeadID)
{
	enterByXpath("//input[@name='id']", LeadID);

	return this ;
}

public FindLeadsPage ClickFindLeadsButton() throws InterruptedException
{
	clickByXpathNoSnap("//button[text()='Find Leads']");
	Thread.sleep(1000);
	return this;
	
}

public ViewLeadPage ClickFirstResultingLead()
{	
	clickByXpathNoSnap("(//a[@class='linktext'])[4]");

	return new ViewLeadPage(driver, test);
}

public FindLeadsPage ClickPhoneTab()
{
	clickByXpathNoSnap("//span[text()='Phone']");
	return this;
}

public FindLeadsPage enterPhoneNumber(String PhoneNumber)
{
	enterByXpath("//input[@name='phoneNumber']", PhoneNumber);
	return this;
}

public FindLeadsPage clickFindleads()
{
	clickByXpath("//button[text()='Find Leads']");
	return this;
}

public String getFirstLeadID()
{
	String val = getTextByXpath("(//a[@class='linktext'])[4]");
	return val;
}

public void verifyErrormessage(String firstleadvalue)
{
	String val1 = getTextByXpath("//div[contains(text()");
	if(val1.contains(firstleadvalue))
	{
		System.out.println("Error messg verified");
	}
}


public FindLeadsPage clickEmailTab()
{
	clickByLink("Email");
	return this;
}

public FindLeadsPage enterEmail(String EmailAddress)
{
	 enterByName("emailAddress", EmailAddress);
	 return this;
}

public String getFirstName()
{
	String val = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
	return val;
}

public ViewLeadPage ClickFirstResultingLeadDup()
{
	clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	return new ViewLeadPage(driver, test);
}


public DuplicateLeadPage ClickDuplicateButton()
{
	clickByLink("Duplicate Lead");
	return new DuplicateLeadPage(driver,test);
}

}