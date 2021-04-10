package Test.API;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zoo extends BaseClass{

		@Test
		public void a() throws InterruptedException {

			webDriver.get("https://www.zoopla.co.uk/");
			webDriver.manage().getCookies();
		//webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
			String actualTitle=webDriver.getTitle();
			System.out.println(actualTitle);
			webDriver.close();
			//System.out.println(actualTitle);
	//assertEquals("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents", actualTitle);

		}

		/*
		 * @Test public void b() throws InterruptedException { WebDriverWait wait2 = new
		 * WebDriverWait(webDriver, 10);
		 * wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
		 * "//*[@id=\'search-input-location\']")));
		 * webDriver.findElement(By.xpath("//*[@id=\'search-input-location\']")).
		 * sendKeys("london");
		 * 
		 * webDriver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click(); }
		 */
	}


