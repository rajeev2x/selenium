package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

/*		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}*/
	}
	
	public ViewLeadPage verifyCompanyName(String data) {
		verifyTextContainsById("viewLead_companyName_sp", data);
		return this;
	}
	

	public ViewLeadPage verifyTitleOfPage()
	{
		verifyTextById("sectionHeaderTitle_leads", "View Lead | opentaps CRM");
		return this;
	}
	
	public EditLeadPage ClickEditLead() throws InterruptedException
	{
		clickByLinkNoSnap("Edit");
		Thread.sleep(1000);
		return new EditLeadPage(driver,test);
		
	}
	
	public  void ConfirmCompanynameChange(String companyName )
	{		
		{
			if(companyName.contains(getTextById("viewLead_companyName_sp")))
			{
				System.out.println("The company name is changed");
			}
		}
	}
	
	public MyLeads ClickDeleteButton()
	{
		clickByClassName("subMenuButtonDangerous");
		return new MyLeads(driver,test);
	}
	
	public ViewLeadPage clickCreateLead()
	{
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver,test);
	}
	
	public  ViewLeadPage ConfirmnameChange(String firstleadname )
	{		
		{
			if(firstleadname.contains(getTextById("viewLead_firstName_sp")))
			{
				System.out.println("The  name is same as previous");
			}
		}
		return this;
	}
	
}
