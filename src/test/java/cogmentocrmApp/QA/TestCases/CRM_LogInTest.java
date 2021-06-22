package cogmentocrmApp.QA.TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Pages.CRM_LogInPage;
public class CRM_LogInTest extends CRM_TestBase {
	CRM_LogInPage crm_loginpage;

	public CRM_LogInTest() throws IOException {
		super();		
	}
@BeforeTest 
public void openApp() throws IOException {
	Initialization ();
	crm_loginpage = new CRM_LogInPage();
}

@Test(priority =1)
public void logintest() {
	crm_loginpage.logInAction(prop.getProperty("email"), prop.getProperty("Password"));
	Assert.assertTrue(crm_loginpage.verifyusernamelabel());
}
@Test (priority =2)
public void verifyUserNameTest() {
	Assert.assertTrue(crm_loginpage.verifyusernamelabel());
}
@Test(priority =3) 
public void logoutuser() throws IOException {
	//crm_loginpage.logoutAction();
}
@AfterTest
public void closeApp() {
	driver.close();
}

}
