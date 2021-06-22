package cogmentocrmApp.QA.Pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cogmentocrmApp.QA.Base.CRM_TestBase;

public class CRM_CompaniesPage extends CRM_TestBase {

	public CRM_CompaniesPage() throws IOException {
		PageFactory.initElements(driver, this); // use PageFactory
	
	}
	
	@FindBy(xpath = "//span[contains(text(),'kasdjfaksd')]")
	WebElement companieslink;
	
	@FindBy(xpath = "//button[contains(text(), 'New')]")
	WebElement newbutton;
    @FindBy(name = "name")
    WebElement namefield;
    
    public void click_On_CompainesAndNewButton() {
    	companieslink.click();
    	newbutton.click();
    }


}
