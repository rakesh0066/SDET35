package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	
	//Declaration
	@FindBy(xpath ="//img[@title=\'Create Organization...\']")
	private WebElement createOrgLookUpImg;
	
	//Initialization
	public OrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateOrgLookUpImg() {
		return createOrgLookUpImg;
	}
	
	public void clickOnCreateOrgLooUpImg()
	{
		createOrgLookUpImg.click();
		
	}
	
	

}
