package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddACategoryPage extends BasePage {

    WebDriver driver;
	
    public AddACategoryPage(WebDriver driver) {
		this.driver = driver;
	}
    @FindBy(how = How.CSS, using = "input[name=\"categorydata\"]") WebElement ADD_CATEGORY_FIELD;
	@FindBy(how = How.CSS, using = "input[value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	
	public void enterCategoryName(String categoryName) {
		String category = categoryName + randomNumGenerator();
		ADD_CATEGORY_FIELD.sendKeys(category);
		System.out.println("New Category entered is:"+ category);
		
	}
	
	public void clickAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
	}
}
