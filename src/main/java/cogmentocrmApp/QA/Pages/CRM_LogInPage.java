package cogmentocrmApp.QA.Pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cogmentocrmApp.QA.Base.CRM_TestBase;
import cogmentocrmApp.QA.Util.CRM_TestUtil;

public class CRM_LogInPage extends CRM_TestBase // extend the  CRM_TestBase class
{
	CRM_TestUtil crm_testutil;
	

	public CRM_LogInPage() throws IOException // Create a contractor for CRM_LogInPage class
	{
		PageFactory.initElements(driver, this); // use PageFactory
	}
	
	@FindBy(xpath = "//input[@name = 'email']")
	WebElement emailfield;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement passwordfield;
	//@FindBy(linkText = "Login")
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginfield;
	@FindBy(xpath = "//span[contains(text(),'smart QA')]")
	WebElement usernameLabel;
	@FindBy(xpath= "//div[@role='listbox']")
	WebElement listboxoption;
	String settinglistxpathvalue = "//div[@role='listbox']//div/a";	
	
	public void logInAction(String useremail, String userpassword) {		
		emailfield.sendKeys(useremail);
		passwordfield.sendKeys(userpassword);
		loginfield.click();
	}
	
	public boolean verifyusernamelabel() {
		return usernameLabel.isDisplayed();
	}	
	public void logoutAction() throws IOException {
		listboxoption.click();
		crm_testutil = new CRM_TestUtil();
		crm_testutil.selectDropdownValue(settinglistxpathvalue, "Log Out");
	}
	
}