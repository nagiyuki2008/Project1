package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Create_Lead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Create_Lead";
		testDescription="Create a new lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd, String comName,String firstName,String lastName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn();
		
		new HomePage()
		.clickCrm()
		.clicklead()
		.clickCreateLead()
		.enterCompanyName(comName)
		.enterUserFirstName(firstName)
		.enterUserLastName(lastName)
		.ClickCreateLeadSubmit()
		.verifyCompanyName(comName);
		
	}
		
}
	
	

