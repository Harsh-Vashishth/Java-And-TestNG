package pageObject;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/framework");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		SearchPage search = new SearchPage(driver);
		search.getSearchBox(driver).sendKeys("Rose");
		Thread.sleep(3000);
	}

}
