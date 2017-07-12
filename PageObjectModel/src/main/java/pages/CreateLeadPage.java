package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		/*if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
		*/
	}
	
	// Enter Company name in Create Lead Page
	public CreateLeadPage enterCompanyName(String companyName){
		
		enterById("createLeadForm_companyName", companyName);
		return this;
	}
	
	// Enter First name in Create Lead Page
		public CreateLeadPage enterFirstName(String firstName){
			enterById("createLeadForm_firstName", firstName);
			return this;
		}
	
		// Enter Last name in Create Lead Page
		public CreateLeadPage enterLastName(String lastName){
			enterById("createLeadForm_lastName", lastName);
			return this;
		}
	
	
	// Click CreateLead
	public ViewLeadPage clickCreateLead(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
	}
	


}
