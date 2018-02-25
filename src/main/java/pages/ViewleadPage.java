package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewleadPage extends ProjectMethods {
	
	public ViewleadPage() {
		PageFactory.initElements(driver,this);

	}
	
	  @FindBy(how=How.ID,using="viewLead_companyName_sp")
		WebElement verifyCompanyName;
	
	public ViewleadPage verifyCompanyName(String data) {
		verifyPartialText(verifyCompanyName, data);
		return this;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	WebElement clickEditLead;
	public EditLeadPage clickEditLead() {
		
		click(clickEditLead);
		return new EditLeadPage();
	}
	

	@FindBy(how=How.LINK_TEXT,using="Delete")
	WebElement clickDeleteLead;
	public MyLeadPage clickDeleteLead() {
		
		click(clickDeleteLead);
        return new MyLeadPage();
	
	
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	WebElement clickDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead() {
		
		click(clickDuplicateLead);
        return new DuplicateLeadPage();
	
	
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	WebElement verifyDuplicateName;
	

	
	public ViewleadPage verifyDuplicateName(String text) {
		
		String txt = FindLeadPage.txt;
		verifyExactText(verifyDuplicateName, txt);
		return this;
		
		
		
	}
	
	
	
	
	
}
