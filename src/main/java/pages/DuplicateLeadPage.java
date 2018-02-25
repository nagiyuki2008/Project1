package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	
	
	public DuplicateLeadPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")

	WebElement clickCreateLead;
	
	public ViewleadPage clickCreateLead()
	
	{
	
		click(clickCreateLead);
		return new ViewleadPage();
		
		
		
	}
	
	public DuplicateLeadPage Verifytitle(String data) {
		
		
		verifyTitle(data);
		
		return this;
	}
	
	

}
