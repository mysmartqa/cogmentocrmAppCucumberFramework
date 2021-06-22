package cogmentocrmApp.QA.Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Util.CRM_TestUtil;

public class CRM_ContactsPage extends CRM_TestBase {
	CRM_TestUtil crm_testutil;

	public CRM_ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactslink;	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement newbutton;	
	@FindBy(name = "first_name")
	WebElement firstnamefield;
	@FindBy(name = "last_name")
	WebElement lastnamefield;	
	@FindBy(name = "middle_name")
	WebElement middlenamefield;
	@FindBy(name = "company")
	WebElement companynamefield;
	@FindBy(name = "category")
	WebElement categorysearchfield;
	String categoryxpathvalue = "//div[@name= 'category']//div[@class ='visible menu transition']//div";
	@FindBy(name = "status")
	WebElement statussearchfield;
	String statusxpathvalue = "//div[@name= 'status']//div[@class ='visible menu transition']//div";
	@FindBy(name ="description")
	WebElement descriptionfield;
	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	WebElement savebutton;
	
	public void click_On_Contack_And_NewButton() {
		contactslink.click();		
		newbutton.click();
	}
	public void clickOnContacts() {
		contactslink.click();
	}
	
	public void enter_Names(String fName, String lName, String mName) {
		firstnamefield.sendKeys(fName);
		lastnamefield.sendKeys(lName);
		middlenamefield.sendKeys(mName);
		
	}
	public void categoryoptionselect() throws IOException {
		categorysearchfield.click();
		crm_testutil = new CRM_TestUtil();
		crm_testutil.selectDropdownValue(categoryxpathvalue, "Customer");
	}
	
	public void statusdoptionselect() {
		statussearchfield.click();
		crm_testutil.selectDropdownValue(statusxpathvalue, "New");
	}
	
	public void enterdescription(String descriptioninfo) {
		descriptionfield.sendKeys(descriptioninfo);
		
	}
	
	public void createCRMContacts(String CRMFname, String CRMLname, String CRMMname, String CRMCategory, String CRMStatus, String CRMDescription) throws IOException {
		crm_testutil = new CRM_TestUtil();
		click_On_Contack_And_NewButton();
		firstnamefield.sendKeys(CRMFname);
		lastnamefield.sendKeys(CRMLname);
		middlenamefield.sendKeys(CRMMname);
		categorysearchfield.click();	
		crm_testutil.selectDropdownValue(categoryxpathvalue, CRMCategory);
		statussearchfield.click();
		crm_testutil.selectDropdownValue(statusxpathvalue, CRMStatus );
		descriptionfield.sendKeys(CRMDescription);
		savebutton.click();
		
	}
	
}
