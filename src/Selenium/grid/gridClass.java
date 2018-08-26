package Selenium.grid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gridClass {
	
	WebDriver driver;
	String baseUrl, nodeUrl10, nodeUrl05;
	
	
	@BeforeTest
	public void setUp() throws MalformedURLException{
		baseUrl   = "http://www.google.co.in";
		nodeUrl10 = "http://51.16.50.39:5555/wd/hub";
		nodeUrl05 = "http://51.16.109.6:5555/wd/hub";
		
		// 1. Defined desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		
		driver = new RemoteWebDriver(cap);
		//driver = new RemoteWebDriver(new URL(nodeUrl05), cap);
		//driver = new RemoteWebDriver(new URL(nodeUrl10), cap);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		// when u have to run on a specific node then u can provide it 
		//new RemoteWebDriver(new URL(nodeUrl), cap);
	}
	
	
	
	@Test
	public void gridtest() throws MalformedURLException
	{

		
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tear()
	{
		driver.quit();
	}

}
