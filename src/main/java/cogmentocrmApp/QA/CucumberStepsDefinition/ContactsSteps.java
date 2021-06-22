package cogmentocrmApp.QA.CucumberStepsDefinition;

import java.io.IOException;

import org.testng.Assert;

import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Pages.CRM_ContactsPage;
import cogmentocrmApp.QA.Pages.CRM_LogInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactsSteps extends CRM_TestBase {
	
	public ContactsSteps() throws IOException {
		super();		
	}

	@Given("^user opens the CRM with a required browser$")
	public void user_opens_the_CRM_with_a_required_browser() throws Throwable {
		CRM_TestBase.Initialization();
	}

	@Then("^user successfully Login to the CRM$")
	public void user_successfully_Login_to_the_CRM() throws Throwable {
		CRM_LogInPage crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logInAction(prop.getProperty("email"), prop.getProperty("Password"));
		Assert.assertTrue(crm_loginpage.verifyusernamelabel());
	    
	}

	@Then("^user will successfully created a new contract$")
	public void user_will_successfully_created_a_new_contract() throws Throwable {	
		CRM_ContactsPage crm_contactspage = new CRM_ContactsPage();
		crm_contactspage.createCRMContacts(prop.getProperty("userFname"), prop.getProperty("userLname"), prop.getProperty("userMname"), prop.getProperty("category"), prop.getProperty("status"), prop.getProperty("descriptionmessage"));
		
	}

	@Then("^user will successfully logout$")
	public void user_will_successfully_logout() throws Throwable {
		
		CRM_LogInPage crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logoutAction();
	}

	@Then("^Close the CRM$")
	public void close_the_CRM() throws Throwable {
		driver.close();
	    
	}



}
