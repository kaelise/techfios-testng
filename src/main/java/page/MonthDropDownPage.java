package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MonthDropDownPage {
	
    WebDriver driver;
	
	public MonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]") WebElement DROPDOWN_FIELD_LOCATOR;
	
	public void monthDropDown() {
		Select select = new Select(driver.findElement(By.name("due_month")));
		List<WebElement> list = select.getOptions();
		for(WebElement month:list) {
			System.out.println(month.getText());
		}
		
		
	}

}
