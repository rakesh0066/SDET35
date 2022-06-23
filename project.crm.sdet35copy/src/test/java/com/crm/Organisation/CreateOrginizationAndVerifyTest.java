package com.crm.Organisation;

import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import Com.Crm.ObjectRepositry.LogoutPage;
import Com.Crm.ObjectRepositry.OrganisationInfoPage;
import Com.Crm.ObjectRepositry.OrganisationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrginizationAndVerifyTest extends BaseClass{
	@Test(groups = {"smokeTest"})
		public void createorgandverifyTest() throws Throwable {

//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			
//			FileUtility fLib = new FileUtility();
//			ExcelUtility eLib = new ExcelUtility();
//			JavaUtility jLib = new JavaUtility();		
//			WebDriverUtility wLib = new WebDriverUtility();
			
//			String USERNAME = fLib.getPropertyKeyValue("username");
//			String PASSWORD = fLib.getPropertyKeyValue("password");
//			
//				
//			driver.get(fLib.getPropertyKeyValue("url"));
			
			//Fetching data from excelsheet
			String orgName=eLib.getFromExcel("Orginization", 1, 2)+jLib.getRandomNumber();
			String industryName = eLib.getFromExcel("Orginization", 1, 3);
			String typeName = eLib.getFromExcel("Orginization", 1, 5);
			
			//Login
//			LoginPage log = new LoginPage(driver);
//  		log.LoginToApplication(USERNAME, PASSWORD);
			
//			driver.findElement(By.name("user_name")).sendKeys(fLib.getPropertyKeyValue("username"));
//			driver.findElement(By.name("user_password")).sendKeys(fLib.getPropertyKeyValue("password"));
//			driver.findElement(By.id("submitButton")).submit();
			
			//Click on organization link
			HomePage hpage = new HomePage(driver);
			hpage.getOrganisationslink().click();
			
//		driver.findElement(By.linkText("Organizations")).click();
//			driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
			
			//click on create organization icon
			OrganisationPage orgpage = new OrganisationPage(driver);
			orgpage.clickOnCreateOrgLooUpImg();
			
			//enter the organization name with industry and type
			CreateNewOrganisationPage cpage = new CreateNewOrganisationPage(driver);
			cpage.enterOrgInfo(orgName);
			cpage.selectIndustry(industryName);
			cpage.selectType(typeName);
			
//       	String orginization = eLib.getFromExcel("Contacts", 1, 2);
//			driver.findElement(By.name("accountname")).sendKeys(orginization);
//			driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			
	
			//verify whether organization is created or not
			OrganisationInfoPage orginfo = new OrganisationInfoPage(driver);
//			wLib.waitForElementVisibility(driver,orginfo.getOgnHeaderTxt());
			String presentorgName = orginfo.getOgnHeaderTxt().getText();
			
			
			SoftAssert sart = new SoftAssert();
			sart.assertTrue(presentorgName.contains(orgName));
			sart.assertAll();
			
//			if(presentorgName.contains(orgName))
//			{
//				System.out.println("organisation created");
//			}else {
//				System.out.println("organisation not crated");
//			}
//			
			//mouse over on administrator link and click signout
//			LogoutPage logoutp = new LogoutPage(driver);
//		logoutp.logout(driver);
	}
}
			
		//	Thread.sleep(2000);
		//   String orgname = driver.findElement(By.id("dtlview_Organization Name")).getText();
			
		//	if(orginization.equals(orgname))
		//		System.out.println("pass");
		//	else System.out.println("fail");
			
//			fLib.closeFile();
//			eLib.closeFile();
//			//close application
//			driver.close();
//		}

//	}
