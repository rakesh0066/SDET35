package com.crm.Organisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Crm.GenericUtilities.BaseClass;
import Com.Crm.GenericUtilities.ExcelUtility;
import Com.Crm.GenericUtilities.FileUtility;
import Com.Crm.GenericUtilities.JavaUtility;
import Com.Crm.GenericUtilities.WebDriverUtility;
import Com.Crm.ObjectRepositry.CreateNewOrganisationPage;
import Com.Crm.ObjectRepositry.HomePage;
import Com.Crm.ObjectRepositry.LoginPage;
import Com.Crm.ObjectRepositry.OrganisationInfoPage;
import Com.Crm.ObjectRepositry.OrganisationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrginizationWithIndustryAndVerifyTest extends BaseClass{

@Test(groups = {"regressionTest"} )
public void CreateOrginizationWithIndustry()throws Throwable{
	//	WebDriver driver = null;
		

//		ExcelUtility eLib = new ExcelUtility();
//		FileUtility fLib = new FileUtility();
//		JavaUtility jLib = new JavaUtility();
//		int RandNum = jLib.getRandomNumber();
//		WebDriverUtility wLib = new WebDriverUtility();
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//
//		String USERNAME = fLib.getPropertyKeyValue("username");
//		String PASSWORD = fLib.getPropertyKeyValue("password");
//		
	//	wLib.waitForElementToLoad(driver);
	//	wLib.waitForTitleContains(driver, driver.getTitle());
		
		//Fetching data from excelsheet
		String orgName=eLib.getFromExcel("Orginization", 1, 2)+jLib.getRandomNumber();
		String industryName = eLib.getFromExcel("Orginization", 1, 3);
		
		
//		driver.get(fLib.getPropertyKeyValue("url"));
		
	//Login
//		LoginPage lpage = new LoginPage(driver);
//		lpage.LoginToApplication(USERNAME, PASSWORD);
		
//		driver.findElement(By.name("user_name")).sendKeys(fLib.getPropertyKeyValue("username"));
//		driver.findElement(By.name("user_password")).sendKeys(fLib.getPropertyKeyValue("password"));
//		driver.findElement(By.id("submitButton")).submit();
//		wLib.takeScreenShot(driver, "HomePage");
		
//		driver.findElement(By.linkText("Organizations")).click();
//  	driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		
		//Homepage
		HomePage hpage = new HomePage(driver);
		hpage.getOrganisationslink().click();
		
		//click on Create org
		OrganisationPage orgpage = new OrganisationPage(driver);
		orgpage.getCreateOrgLookUpImg().click();
		
		
//		String orginization = eLib.getFromExcel("Orginization", 1, 2)+RandNum;
//		driver.findElement(By.name("accountname")).sendKeys(orginization);
		
//		WebElement industryDrop = driver.findElement(By.name("industry"));
//		String industry = eLib.getFromExcel("orginization", 1, 3);
//		wLib.selectDropDown(industryDrop, industry);
		
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
//		Thread.sleep(2000);
	  //Organization info
		CreateNewOrganisationPage orginfopage = new CreateNewOrganisationPage(driver);
		orginfopage.enterOrgInfo(orgName);
		orginfopage.selectIndustry(industryName);
		orginfopage.getSavebutton().click();
		
		//verify 
		OrganisationInfoPage verifiorg = new OrganisationInfoPage(driver);
		 String presentorg = verifiorg.getOgnHeaderTxt().getText();
		 String industry = verifiorg.getOgnHeaderTxt().getText();
		 
		 
		 
		
//		String orgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
//		String indust = driver.findElement(By.id("dtlview_Industry")).getText();
		
		 
		SoftAssert sasrt = new SoftAssert();
		sasrt.assertTrue(presentorg.contains(industry));
		sasrt.assertAll();
		
//		if(presentorg.contains(orgName))
//			System.out.println("orginization pass");
//		else System.out.println("orginization fail");
//		
//		if(presentorg.contains(industry))
//			System.out.println("industy pass");
//		else System.out.println("industry fail");
		
//		fLib.closeFile();
//		eLib.closeFile();
//		driver.quit();
	}
	}

