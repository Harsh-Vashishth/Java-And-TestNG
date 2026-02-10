package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTest {
	
	@Test(dataProvider = "getData")
	void login(String username, String password) {
		System.out.println("Login: "+ username+ " "+ password);
	}
	
	@DataProvider
	Object[][]getData(){
		Object[][]data = new Object[3][2];
		data[0][0] = "username1";
		data[0][1] = "pass1";
		data[1][0] = "username2";
		data[1][1] = "pass2";
		data[2][0] = "username3";
		data[2][1] = "pass3";

		return data;
		
	}
	
	@Parameters({"url"})
	@Test
	void goToSite(String url) {
		System.out.println(url);
	}
	
//	@Test(enabled = false)
//	void printData() {
//		System.out.println("Print Data");
//	}
//	
//	@Test(timeOut = 5000)
//	void checkTime() throws InterruptedException {
//		Thread.sleep(6000);
//	}
	@Test
	void signIn() {
		int num = 10/0;
		System.out.println("Sign In");
	}
	@Test(dependsOnMethods = {"signIn"})
	void signOut() {
		System.out.println("Sign Out");
	}
}
