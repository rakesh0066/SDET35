package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Crm.GenericUtilities.WebDriverUtility;

public class CreateNewContact extends WebDriverUtility{
	//Initialization
	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//Declaration
	
	@FindBy(xpath = "//img[@title=\"Create Contact...\"]")
	private WebElement createcontactlookupimg;
	
	@FindBy(name = "salutationtype")
	private WebElement genderdropdown;
	
	@FindBy(name = "firstname")
	private WebElement fstname;
	
	@FindBy(name = "lastname")
	private WebElement lstname;
	
	@FindBy(xpath = "//input[@accesskey=\"S\"]")
	private WebElement savebutton;
	
	//Utilization

	public WebElement getCreatecontactlookupimg() {
		return createcontactlookupimg;
	}

	public WebElement getGenderdropdown() {
		return genderdropdown;
	}

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	

	public void getFstname(String firstName) {
		fstname.sendKeys(firstName);	
	}

	public void getLstname(String lastName) {
		lstname.sendKeys(lastName);	
		savebutton.click();
	}
	public void Genderdropdown(String Name){
		selectDropDown(genderdropdown, Name);
	}

}

