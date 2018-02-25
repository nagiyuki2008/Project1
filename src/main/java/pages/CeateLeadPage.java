package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CeateLeadPage extends ProjectMethods{

	
	public CeateLeadPage() {
		PageFactory.initElements(driver,this);

	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement enterCompanyName;
	
    public CeateLeadPage enterCompanyName(String data) {
		
    	type(enterCompanyName, data);
    	return this;
    	
	}
	
    @FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement enterUserFirstName;
    
	public CeateLeadPage enterUserFirstName(String data) {
		
		type(enterUserFirstName,data);
		return this;
		
	}
	
	   @FindBy(how=How.ID,using="createLeadForm_lastName")
		WebElement enterUserLastName;
	
	
	
    public CeateLeadPage enterUserLastName(String data) {
    	
    	type(enterUserLastName,data);
		return this;
		
	}
    
    @FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement ClickCreateLead;



public ViewleadPage ClickCreateLeadSubmit() {
	
              click(ClickCreateLead);
		return new ViewleadPage();
	
}
    
	
	
	
	
	
}
