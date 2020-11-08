package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	
	public static int randomNumGenerator() {
		Random num = new Random();
		int randomNum = num.nextInt(999);
		return randomNum;
	}
	
	public static void dropDown(WebElement locator, String visibleText) {
		Select sel = new Select(locator);
		sel.selectByVisibleText(visibleText);
	
	}
}
