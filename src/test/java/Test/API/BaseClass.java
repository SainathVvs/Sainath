package Test.API;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class BaseClass {
	static WebDriver webDriver;
	@BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
			 webDriver=new ChromeDriver();
			 webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  }


	@AfterClass
	  public void afterClass() {
			webDriver.quit();

	  }

}
