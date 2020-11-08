package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class DuplicateCategoryPage {
	
  
WebDriver driver;
	
	public DuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.CSS, using = "input[name=\"categorydata\"]") WebElement ADD_CATEGORY_FIELD;
	@FindBy(how = How.CSS, using = "input[value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body/span[1]") WebElement DUPLICATE_ELEMENT_FIELD;

	
	
	
	public void enterCategoryName(String categoryName) {
		ADD_CATEGORY_FIELD.sendKeys(categoryName);
	}
	
	public void clickAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
	}
	public void verifiedDuplicateElement () {
		Assert.assertEquals(DUPLICATE_ELEMENT_FIELD.getText(), "Spring", "duplicated category name");
		
	}

}
