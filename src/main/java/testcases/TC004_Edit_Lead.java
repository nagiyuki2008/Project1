package testcases;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_Edit_Lead extends ProjectMethods
{
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_Edit_Lead";
		testDescription="Edit the existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd, String firstname,String comName) {
		
		new LoginPage()
		
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		
		.clickCrm()
		.clicklead()
		.clickFindLead()
		.enterFirstName(firstname)
		.searchLeads()
		.clickFirstResultingLead()
		.clickEditLead()
		.editCompanyName(comName)
	    .ClickUpdate()
	    .verifyCompanyName(comName);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
