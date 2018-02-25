package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {
	
	public static String txt;
	
	
	public FindLeadPage() {
		
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-form-element']/input)[1]")
	WebElement clickFirstName;
	
	
	
	
	
	public FindLeadPage clickFirstName() {
		
		click(clickFirstName);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	WebElement enterFirstName;
	
	public FindLeadPage enterFirstName(String data) {
		
		type(enterFirstName, data);
		return this;


}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement searchLead;
	
	
	public FindLeadPage searchLeads() {
		
		click(searchLead);
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement clickFirstResultingLead;
	
	
	public ViewleadPage clickFirstResultingLead() {
		

		
		click(clickFirstResultingLead);
		return new ViewleadPage();
		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	WebElement verifytext;
	
	
	public FindLeadPage verifyDeletedLead()
	{
		
		verifyExactText(verifytext, "No records to display");
		return this;
	}
	
	
@FindBy(how=How.XPATH,using="//span[text()='Email']")
WebElement clickEmail;

	
	public FindLeadPage clickEmail() {
		
		click(clickEmail);
		return this;
		
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	WebElement enterEmailAddress;
	
	
	public FindLeadPage enterEmailAddress(String data) {
		
		type(enterEmailAddress, data);
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	WebElement CaptureUserNameofFirstResultingLead;
	
	
	public FindLeadPage CaptureUserNameofFirstResultingLead(String text) {
		
		txt = CaptureUserNameofFirstResultingLead.getText();
		return this;
		
	}
	
	
	

	
	
}






