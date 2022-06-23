package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.GenericUtilities.WebDriverUtility;

public class LoginPage{
	
	//Declaration
	@FindBy(name="user_name")
	private WebElement usernametxt;
	
	@FindBy(name="user_password")
	private WebElement passwordtxt;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	
	
	public WebElement getUsernametxt() {
		return usernametxt;
	}


	public WebElement getPasswordtxt() {
		return passwordtxt;
	}


	public WebElement getSubmitbutton() {
		return submitbutton;
	}


	
	
	/**
	 * @param username
	 * @param password
	 * click on submit button
	 */
	
	public void LoginToApplication(String username,String password)
	{
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		submitbutton.click();
	}
}

		
		
