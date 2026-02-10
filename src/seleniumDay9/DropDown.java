package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(4000);
		
		WebElement country = driver.findElement(By.id("country"));
		Thread.sleep(2000);
		Select selectCountry = new Select(country);
		selectCountry.selectByIndex(12); 
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("Russia");
		Thread.sleep(2000);
		selectCountry.selectByValue("japan");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
