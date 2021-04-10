package Test.API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessUnitDriver {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://zoopla.com");

		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
