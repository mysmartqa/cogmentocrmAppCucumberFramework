package cogmentocrmApp.QA.TestCases;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Pages.CRM_ContactsPage;
import cogmentocrmApp.QA.Pages.CRM_LogInPage;
import cogmentocrmApp.QA.Util.CRM_TestUtil;

public class CRM_ContactsTest extends CRM_TestBase {
	
	CRM_LogInPage crm_loginpage;
	CRM_ContactsPage crm_contactspage;
	CRM_TestUtil crm_testutil;
	public static String sheetName= "ContactsTestdata";

	public CRM_ContactsTest() throws IOException {
		super();
		
	}
	
	@BeforeTest 
	public void openApp() throws IOException {
		Initialization ();
		crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logInAction(prop.getProperty("email"), prop.getProperty("Password"));
	}
	
	/*@Test
	public void fillupContactsForm() throws IOException {
		crm_contactspage = new CRM_ContactsPage();
		crm_contactspage.click_On_Contack_And_NewButton();
		crm_contactspage.enter_Names(prop.getProperty("userFname"), prop.getProperty("userLname"), prop.getProperty("userMname"));
		crm_contactspage.categoryoptionselect();
		crm_contactspage.statusdoptionselect();
		crm_contactspage.enterdescription(prop.getProperty("descriptionmessage"));
	}*/
	@DataProvider
	public Object[][] getCRMData() throws IOException{
		Object data[][] = CRM_TestUtil.getTestdata(sheetName);		
		return data;
		
	}
	@Test(priority =1, dataProvider ="getCRMData" )
	public void fillupContactsForm(String FirstName, String LastName, String MiddleName, String Category,String Status, String Description) throws IOException {
		crm_contactspage = new CRM_ContactsPage();
		crm_contactspage.createCRMContacts(FirstName, LastName, MiddleName, Category, Status, Description);		
		crm_contactspage.clickOnContacts();
		
	}
	
	@Test(priority =2) 
	public void logoutuser() throws IOException {
		crm_loginpage = new CRM_LogInPage();
		crm_loginpage.logoutAction();
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
	}

}
