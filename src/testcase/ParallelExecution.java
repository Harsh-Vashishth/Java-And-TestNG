package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	@BeforeMethod
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	void methodA() {
		driver.get("https://www.geeksforgeeks.org/");
	}
	
	@Test
	void methodB() {
		driver.get("https://www.tpointtech.com/");
	}
	@Test
	void methodC() {
		driver.get("https://www.spicejet.com/");
	}
}
