package cogmentocrmApp.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Pages.CRM_CompaniesPage;
import cogmentocrmApp.QA.Pages.CRM_LogInPage;

public class CompaniesTest extends CRM_TestBase {
	
	CRM_LogInPage crm_loginpage;
	CRM_CompaniesPage  crm_compaiespage;

	public CompaniesTest() throws IOException {
		super();
		
	}
	
	
	@BeforeTest
	public void openApp() throws IOException {
		Initialization ();
		crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logInAction(prop.getProperty("email"), prop.getProperty("Password"));
		
	}
	
	@Test
	public void companiesTest() throws IOException {
		crm_compaiespage = new 	CRM_CompaniesPage();		
		crm_compaiespage.click_On_CompainesAndNewButton();
		
		
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
	
	

}
