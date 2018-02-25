package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Myhomepage extends ProjectMethods{

	
	public Myhomepage() {
			PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement clicklead;
	
	public MyLeadPage clicklead() {
 		click(clicklead);
		return new MyLeadPage();
	}
}



