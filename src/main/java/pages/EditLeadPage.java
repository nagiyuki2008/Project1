package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement editCompanyName;

	
	public EditLeadPage editCompanyName(String data) {
		
		type(editCompanyName, data);
		return this;
	
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
	WebElement ClickUpdate;
	
	public ViewleadPage ClickUpdate() {
		
		click(ClickUpdate);
		return new ViewleadPage();
		
	}
	
	
	
	
	
}
