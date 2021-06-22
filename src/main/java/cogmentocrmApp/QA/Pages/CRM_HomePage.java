package cogmentocrmApp.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cogmentocrmApp.QA.Base.CRM_TestBase;

public class CRM_HomePage extends CRM_TestBase{

	public CRM_HomePage() throws IOException {
		PageFactory.initElements(driver, this); // use PageFactory
	}
@FindBy(xpath= "//div[@class='header item']")
WebElement homepagetitle;

public void homepagetitleverify() {
	String title= homepagetitle.getText();
	System.out.println("Home page title is : " + title);
}

}
