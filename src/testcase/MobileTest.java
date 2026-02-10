package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MobileTest {

	@Test
	void mobileA() {
		try {
			int num = 10/0;
			System.out.println("Mobile A");
		}
		catch(Exception ex){
			
		}
		
	}
	@Test(groups = "smoke")
	void mobileB() {
		boolean result = false;
//		Assert.assertTrue(result);
//		
//		System.out.println("Mobile B");
		
		SoftAssert assertSoft = new SoftAssert();
		assertSoft.assertTrue(result);
		System.out.println("Mobile B");
		assertSoft.assertAll();
		
	}

}
