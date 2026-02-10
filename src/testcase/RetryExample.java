package testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryExample implements IRetryAnalyzer {
	static int retryCount= 2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount > 0) {
			retryCount--;
			System.out.println("code rerun*************");
			return true;
		}
		return false;
	}

}
