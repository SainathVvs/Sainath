package Test.API;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoadExtension {

	public static void main(String[] args) {

		WebDriver webDriver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\Dell\\Downloads\\extension_2_0_9_0.crx"));
		
		webDriver = new ChromeDriver();
		
		webDriver.manage().window().maximize();
		
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		webDriver.get("https://www.zoopla.co.uk/");
		
		webDriver.findElement(By.xpath("//*[@id='cookie-consent-form']/div/div/div/button[2]")).click();
		
		webDriver.manage().getCookies();
		
		String actualTitle = webDriver.getTitle();
		
		System.out.println(actualTitle);
		
	}

}
