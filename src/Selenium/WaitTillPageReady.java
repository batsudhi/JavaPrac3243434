package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitTillPageReady {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
	}

	@Test
	public void calc() {
		//Call this function to wait for page to ready.
		checkPageIsReady();

		//Once page Is ready/loaded, Bellow given steps will be executed.
		driver.findElement(By.xpath("//input[@id='1']")).click();
		driver.findElement(By.xpath("//input[@id='plus']")).click();
		driver.findElement(By.xpath("//input[@id='5']")).click();
		driver.findElement(By.xpath("//input[@id='equals']")).click();
	}


	public void checkPageIsReady() {

		JavascriptExecutor js = (JavascriptExecutor)driver;


		//Initially bellow given if condition will check ready state of page.
		if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			System.out.println("Page Is loaded.");
			return; 
		} 

		//This loop will rotate for 25 times to check If page Is ready after every 1 second.
		//You can replace your value with 25 If you wants to Increase or decrease wait time.
		for (int i=0; i<25; i++){
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {} 
			//To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete"))
			{ 	System.out.println("Page Is loaded.");
				break; 
			}   
		}
	}
}