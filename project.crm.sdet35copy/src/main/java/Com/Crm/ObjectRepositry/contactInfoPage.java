package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactInfoPage {
	
	//Initialization
	public contactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declare
	@FindBy(xpath = "//span[@class=\"dvHeaderText\"]")
	private WebElement headerTxt;

	
	//utilize
	public WebElement getHeaderTxt() {
		return headerTxt;
	}
}
