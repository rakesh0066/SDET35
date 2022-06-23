package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Crm.GenericUtilities.WebDriverUtility;

public class CreateNewOrganisationPage extends WebDriverUtility{
	//Declaration
	@FindBy(name="accountname")
	private WebElement organisationtxtfield;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement savebutton;
	
	@FindBy(name = "industry")
	private WebElement industrydropdown;
	
	@FindBy(name = "accounttype")
	private WebElement typedropdown;
	
	//Initialization
	public CreateNewOrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}

	//Utilization
	
	public WebElement getOrganisationtxtfield() {
		return organisationtxtfield;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public void setOrganisationtxtfield(WebElement organisationtxtfield) {
		this.organisationtxtfield = organisationtxtfield;
	}
	
	/**
	 * @param enter organisationName
	 * select the industry
	 * select type
	 */
	
	public void enterOrgInfo(String organisationName)
	{
		organisationtxtfield.sendKeys(organisationName);
	}
	public void selectIndustry(String industry)
	{
	    selectDropDown(industrydropdown, industry);
	}
	public void selectType(String type)
	{
		selectDropDown(typedropdown, type);
		savebutton.click();
	}	
}
