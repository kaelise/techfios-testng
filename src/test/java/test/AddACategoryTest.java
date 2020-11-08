package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddACategoryPage;
import util.BrowserFactory;

public class AddACategoryTest {

	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddCategory() {
		driver = BrowserFactory.launchBrowser();
		
		AddACategoryPage addcategory = PageFactory.initElements(driver, AddACategoryPage.class);
		addcategory.enterCategoryName("Spring");
		addcategory.clickAddCategoryButton();
		BrowserFactory.tearDown();
	}
}
