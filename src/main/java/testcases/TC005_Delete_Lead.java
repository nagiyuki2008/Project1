package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_Delete_Lead extends ProjectMethods {
	
	
	public TC005_Delete_Lead() {
		PageFactory.initElements(driver, this);
	}
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Delete_Lead";
		testDescription="Delete the Lead";
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
		.clickDeleteLead()
		.clickFindLead()
		.enterFirstName(firstname)
	    .searchLeads()
	    .verifyDeletedLead();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}
}

