package TestListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests {
	
	@Test(retryAnalyzer = TestListeners.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertTrue(false);
	}
}
