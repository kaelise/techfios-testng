package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DuplicateCategoryPage;
import util.BrowserFactory;

public class DuplicateCategoryTest {

	
	WebDriver driver;
	@Test
	public void userShouldNotBeAbleToAddCategory() {
		driver = BrowserFactory.launchBrowser();
		
		DuplicateCategoryPage duplicatecategory = PageFactory.initElements(driver, DuplicateCategoryPage.class);
		duplicatecategory.enterCategoryName("Spring");
		duplicatecategory.clickAddCategoryButton();
		duplicatecategory.verifiedDuplicateElement();
		BrowserFactory.tearDown();
	}
}
