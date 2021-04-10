package Test.API;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1b {
	WebDriver webDriver;
	
	@Test
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--keep-alive-for-test");
		
		webDriver = new ChromeDriver();
		
		webDriver.manage().window().maximize();
		
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		webDriver.get("https://www.zoopla.co.uk/");
		
		webDriver.findElement(By.xpath("//*[@id='cookie-consent-form']/div/div/div/button[2]")).click();
		
		webDriver.manage().getCookies();
		
		String actualTitle = webDriver.getTitle();
		
		System.out.println(actualTitle);
		
		assertEquals("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents", actualTitle);
		
		System.out.println("End of Open Browser");
		
	}
	
	@Test
	public void search()
	{
		System.out.println("Begin of Search");
		
		webDriver.findElement(By.xpath("//*[@id=\'search-input-location\']")).sendKeys("london");

		webDriver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();

	}

}
