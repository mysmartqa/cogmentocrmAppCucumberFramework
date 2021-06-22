package cogmentocrmApp.QA.Base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import cogmentocrmApp.QA.Util.CRM_TestUtil;

public class CRM_TestBase {
	
	public static WebDriver driver; //To define driver object as a global variable for WebDriver class
	public static Properties prop; //To define prop object as a global variable for Properties class
	
	
	public CRM_TestBase() throws IOException // Create a contractor for CRM_TestBase class
	{
		prop = new Properties(); // to define prop object for Properties class	
		FileInputStream obj = new FileInputStream ("C:\\MavenProject\\cogmentocrmApp\\src\\main\\java\\cogmentocrmApp\\QA\\Config\\CRM_config.Properties");// to define obj object for FileInputStream
		prop.load(obj);		
	}
	public static void Initialization () {
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) 
		{System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriverProject\\DriverExtentions\\chromedriver_win32\\chromedriver.exe");	
		//Chrome is being controlled by automated test software" notification 	
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver= new ChromeDriver();
		      }

		else if (browsername.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumWebDriverProject\\DriverExtentions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CRM_TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CRM_TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		} 
	

}
