package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.GenericUtilities.JavaUtility;
import Com.Crm.GenericUtilities.WebDriverUtility;



public class HomePage extends WebDriverUtility{
	//webdriver driver
	
	//Declaration
	@FindBy(linkText = "Organizations")
	private WebElement organisationslink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactslink;
	
	@FindBy(linkText = "Products")
	private WebElement productslink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement morelink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorlink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;

	//Initialization
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getOrganisationslink() {
		return organisationslink;
	}


	public WebElement getContactslink() {
		return contactslink;
	}


	public WebElement getProductslink() {
		return productslink;
	}


	public WebElement getMorelink() {
		return morelink;
	}


	public WebElement getAdministratorlink() {
		return administratorlink;
	}


	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(administratorlink).perform();
		signoutlink.click();
	}
	}

