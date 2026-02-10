package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	By search = By.xpath("//input[@type = 'text']");
	public WebElement getSearchBox(WebDriver driver) {
		return driver.findElement(search);
	}

}
