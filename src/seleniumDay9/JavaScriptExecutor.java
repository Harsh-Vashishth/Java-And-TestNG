package seleniumDay9;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('input_text').value = 'java'");
		Thread.sleep(5000);
		driver.quit();

	}

}
