package Com.Crm.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Com.Crm.ObjectRepositry.HomePage;
import Com.Crm.ObjectRepositry.LoginPage;
import Com.Crm.ObjectRepositry.LogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static  WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib = new DataBaseUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	/**
	 * connecting to database
	 */
	@BeforeSuite(groups = {"smokeTest", "regressionTest"})
	public void dbconnect() {
		dLib.connectToDB();
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest", "regressionTest"})
    public void launchTheBrowser() throws Throwable {
    	
    	String BROWSER = fLib.getPropertyKeyValue("browser");
    	String URL = fLib.getPropertyKeyValue("url");
    	
    	//parameter jenkins
    	
 //   	 String BROWSER = System.getProperty("browser");
 //   	 String URL = System.getProperty("url");
    	
    	
    	if(BROWSER.equalsIgnoreCase("chrome"))
    	{
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}else if(BROWSER.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}else {
    		driver=new ChromeDriver();
    	}
    	
    	
    	//Implicitly wait
    	wLib.waitForPageToLoad(driver);
    	sdriver=driver;
    	//enter URL of application
    	sdriver.get(URL);
    	//Maximize screen
    	driver.manage().window().maximize();
    }
    private String getPropertyKeyValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * login to application
     * @throws Throwable 
     */
    @BeforeMethod(groups = {"smokeTest", "regressionTest"})
    public void loginToAppln() throws Throwable
    {
    	String USERNAME = fLib.getPropertyKeyValue("username");
    	String PASSWORD = fLib.getPropertyKeyValue("password");
    	
    	LoginPage lpage = new LoginPage(driver);
    	lpage.LoginToApplication(USERNAME, PASSWORD);
    }
    /**
     * logout from application
     */
    @AfterMethod(groups = {"smokeTest", "regressionTest"})
    public void logoutFromAppln()
    {
    	HomePage home = new HomePage(driver);
    	home.logout();
    }
    /**
     * close the browser
     */
    @AfterClass(groups = {"smokeTest", "regressionTest"})
    public void closeBrowser() {
    	driver.quit();
    }
    
    @AfterSuite(groups = {"smokeTest", "regressionTest"})
    public void closeDBconfig()
    {
    	dLib.closeDB();
    }
    }
