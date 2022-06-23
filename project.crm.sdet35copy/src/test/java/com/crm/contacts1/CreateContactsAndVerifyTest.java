package com.crm.contacts1;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Crm.GenericUtilities.BaseClass;
import Com.Crm.GenericUtilities.ExcelUtility;
import Com.Crm.GenericUtilities.FileUtility;
import Com.Crm.GenericUtilities.JavaUtility;
import Com.Crm.GenericUtilities.ReTryAnalyzer;
import Com.Crm.GenericUtilities.WebDriverUtility;
import Com.Crm.ObjectRepositry.CreateNewContact;
import Com.Crm.ObjectRepositry.HomePage;
import Com.Crm.ObjectRepositry.LoginPage;
import Com.Crm.ObjectRepositry.contactInfoPage;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(Com.Crm.GenericUtilities.ItestListenerImt.class)
public class CreateContactsAndVerifyTest extends BaseClass {
//	@Test(groups = {"smokeTest"})
@Test(retryAnalyzer = Com.Crm.GenericUtilities.ReTryAnalyzer.class)
	public void createcontactverifyTest() throws Throwable{
	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		FileUtility fLib = new FileUtility();
//		ExcelUtility eLib = new ExcelUtility();
//		JavaUtility jLib = new JavaUtility();		
//		WebDriverUtility wLib = new WebDriverUtility();
		
		int ranNum = jLib.getRandomNumber();
		
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		
		//fetching from Excel
		String firstName = eLib.getFromExcel("Contacts", 1, 2);
		String lastName = eLib.getFromExcel("Contacts", 1, 3);
		
		//get the url of the application
//
//		driver.get(fLib.getPropertyKeyValue("url"));
		//enter the username into username textfield
//		driver.findElement(By.name("user_name")).sendKeys(fLib.getPropertyKeyValue("username"));
//		driver.findElement(By.name("user_password")).sendKeys(fLib.getPropertyKeyValue("password"));
//		driver.findElement(By.id("submitButton")).submit();
		
		//login
		
//		LoginPage log = new LoginPage(driver);
//		log.LoginToApplication(USERNAME, PASSWORD);
		
		
//		driver.findElement(By.linkText("Contacts")).click();
		
		//click contact link
		HomePage contactlnk = new HomePage(driver);
		contactlnk.getContactslink().click();
		
		// click on create contact
		CreateNewContact contactpge = new CreateNewContact(driver);
		contactpge.getCreatecontactlookupimg().click();
		
	//	driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
//	 WebElement genderdropdown = driver.findElement(By.name("salutationtype"));
		
		CreateNewContact genderdrop = new CreateNewContact(driver);
		genderdrop.Genderdropdown("Mr.");
		
		
//		 Select select = new Select(genderdrop);
//		 select.selectByValue("Mr.");
		 
		 
		 
	//	driver.findElement(By.name("firstname")).sendKeys(eLib.getFromExcel("Contacts", 1, 2));
	//	driver.findElement(By.name("lastname")).sendKeys(eLib.getFromExcel("Contacts", 1, 3));
//		String firstname = eLib.getFromExcel("Contacts", 1, 2);			
//		String lastname = eLib.getFromExcel("Contacts", 1, 3);
		
//		 driver.findElement(By.name("firstname")).sendKeys(firstname);
//		 driver.findElement(By.name("lastname")).sendKeys(lastname);
		 
		 //enter contact details
		 CreateNewContact cpage = new CreateNewContact(driver);
         cpage.getFstname(firstName);
         cpage.getLstname(lastName);

//		 driver.findElement(By.xpath("//input[@accesskey=\"S\"]")).click();
		 
//		 Thread.sleep(2000);
//		 String firstnameverify = driver.findElement(By.id("dtlview_First Name")).getText();
//	 String lastnameverify = driver.findElement(By.id("dtlview_Last Name")).getText();
         
         contactInfoPage contctinfo = new contactInfoPage(driver);
          String presentcontctname = contctinfo.getHeaderTxt().getText();
		 
		
          
          SoftAssert sasrt = new SoftAssert();
          sasrt.assertTrue(presentcontctname.contains(firstName));
          System.out.println("test script pass");
          sasrt.assertAll();
          
		 
//		 if(presentcontctname.contains(firstName))
//			 System.out.println("firstname pass");
//		 else
//			 System.out.println("firstname fail");
//		 if(presentcontctname.contains(lastName))
//			 System.out.println("lastname pass");
//		 else
//			 System.out.println("lastname fail");
////		 
//		 
//		eLib.closeFile();
//		fLib.closeFile();
//		driver.quit();
		

	}

}
