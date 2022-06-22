package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.GenericUtilities.WebDriverUtility;

public class LogoutPage extends WebDriverUtility{
//initialization
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement administratorLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	
	//Utilization
	public WebElement getAdministratorLink() {
		return administratorLink;
	}

	/**
	 * used to logout from the application
	 * @param driver
	 */
	public void logout(WebDriver driver) {
	 mouseOverAnElement(driver, administratorLink);
	 signoutLink.click();
	}
	
	
}


