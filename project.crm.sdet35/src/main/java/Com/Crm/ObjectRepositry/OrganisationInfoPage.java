package Com.Crm.ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage {
	
	//Declaration	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ognHeaderTxt;
	
//	@FindBy(id ="mouseArea_Industry")
//	private WebElement verfiindustry;
	
	
	//initialization 
	public OrganisationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getOgnHeaderTxt() {
		return ognHeaderTxt;
	}
}

