package testcase;

import org.testng.annotations.*;

public class WebsiteTest {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before suite***");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("After suite***");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Before test");
	}
	@AfterTest
	void afterTest() {
		System.out.println("After test");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("After method");
	}
	
	@Test(retryAnalyzer = RetryExample.class)
	void websiteA() {
		int num = 10/0;
		System.out.println("Website A");
	}
	
	@Test(groups = "smoke")
	void websiteB() {
		System.out.println("Website B");
	}
}
