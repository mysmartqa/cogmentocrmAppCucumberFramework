package cogmentocrmApp.QA.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cogmentocrmApp.QA.Base.CRM_TestBase;

public class CRM_TestUtil extends CRM_TestBase {
	public CRM_TestUtil() throws IOException {
		super();		
	}
	public static long Page_Load_TimeOut = 40;
	public static long Implicit_Wait = 40;
	public static String excelfilepath = "C:\\MavenProject\\cogmentocrmApp\\src\\main\\java\\cogmentocrmApp\\QA\\Data\\Testdatasource.xlsx";
	public static Workbook excelbook;
	public static Sheet sheet;
	public void selectDropdownValue(String xpathValue, String value) {
		List<WebElement> dropdownlist = driver.findElements(By.xpath(xpathValue));
		int dropdownlistsize = dropdownlist.size();
		for(int i=0;i<dropdownlistsize;i++) {
			String dropdownlistitems = dropdownlist.get(i).getText();
			System.out.println(dropdownlistitems);
			if(dropdownlistitems.equalsIgnoreCase(value)) {
				dropdownlist.get(i).click();
				break;
			}
		}
	}
	
	// To read test data from the excel file:
	public static Object[][] getTestdata(String sheetName) throws IOException{
		FileInputStream filepath = null;
		 filepath = new FileInputStream(excelfilepath);		
		excelbook = WorkbookFactory.create(filepath);
		 sheet = excelbook.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];				
		for(int i= 0; i<sheet.getLastRowNum();i++) {
			for(int k = 0; k<sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		
	}
	

}
