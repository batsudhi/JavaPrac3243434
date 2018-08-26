package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		// Loading flipkart URL
		driver.get("https://www.flipkart.com/");
		
		// Locating and clicking on Home & Furniture menu
		WebElement homeFurniture= driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		homeFurniture.click();
		
		// When we click on homeFurniture, we can see "Bedsheets" in sub menu. Locating bedsheet
		WebElement bs1= driver.findElement(By.xpath("//span[text()='Bedsheets']"));
		Thread.sleep(5000);
		
		// Checking if bedsheets is displayed
		if(bs1.isDisplayed())
			System.out.println("Element is displayed.");
		else
			System.out.println("Element is not displayed.");
				Thread.sleep(5000);
		
				
		// Click on flipkart logo to just remove mouse from Home & Furniture menu
		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		// Bedsheets is not visible now but webdriver will be able to find it as it is in DOM
		WebElement bs2= driver.findElement(By.xpath("//span[text()='Bedsheets']"));
		Thread.sleep(5000);
		
		// Checking if bedsheets is displyaed
		if(bs2.isDisplayed())
			System.out.println("Element is displayed.");
		else
			System.out.println("Element is not displayed.");
		}
}