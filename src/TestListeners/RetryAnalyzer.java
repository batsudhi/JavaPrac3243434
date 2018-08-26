package TestListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	private int retryCount = 0;
	private int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCount <maxRetryCount)
		{
			System.out.println("retrying "+result.getName());
			retryCount++;
			return true;
		}
		return false;
	}

}
