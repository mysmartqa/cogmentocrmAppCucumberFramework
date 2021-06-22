package cogmentocrmApp.QA.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Pages.CRM_HomePage;
import cogmentocrmApp.QA.Pages.CRM_LogInPage;

public class CRM_HomePageTest extends CRM_TestBase {
	CRM_HomePage crm_homepage;
	CRM_LogInPage crm_loginpage;

	public CRM_HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest 
	public void openApp() throws IOException {
		Initialization ();
		crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logInAction(prop.getProperty("email"), prop.getProperty("Password"));
	}

	@Test(priority=1 )
	public void hometitlepagetest() throws IOException {
		crm_homepage = new CRM_HomePage();
		crm_homepage.homepagetitleverify();
	}
	@Test (priority=2)
	public void verifyUserNameTest() throws IOException {
		Assert.assertTrue(crm_loginpage.verifyusernamelabel());
		crm_loginpage.logoutAction();
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}

}
