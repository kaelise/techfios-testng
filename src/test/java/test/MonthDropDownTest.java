package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MonthDropDownPage;
import util.BrowserFactory;

public class MonthDropDownTest {

    WebDriver driver;
	
	@Test
	public void validateMonthDropDown() {
		driver = BrowserFactory.launchBrowser();
		
		MonthDropDownPage monthdropdown = PageFactory.initElements(driver, MonthDropDownPage.class);
		monthdropdown.monthDropDown();
		BrowserFactory.tearDown();
	}
}
