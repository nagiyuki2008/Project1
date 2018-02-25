package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_Duplicate_Lead extends ProjectMethods{
	
	/*public TC006_Duplicate_Lead() {
		PageFactory.initElements(driver, this);
	}
	*/
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Duplicate_Lead";
		testDescription="Create Duplicate Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC004";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd, String Email,String title) {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()		
		.clickCrm()
		.clicklead()
		.clickFindLead()
		.clickEmail()
		.enterEmailAddress(Email)
		.searchLeads()
		.CaptureUserNameofFirstResultingLead("")
	    .clickFirstResultingLead()
	    .clickDuplicateLead()
	    .Verifytitle(title)
		.clickCreateLead()
		.verifyDuplicateName(FindLeadPage.txt);
		
		}
		
	
}
