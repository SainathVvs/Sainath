package Test.API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito"); 
		options.addArguments("window-size=600,600");
		
		driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://zoopla.com");

		System.out.println(driver.getTitle());
		
		driver.quit();
		
		System.out.println("Test Execution Completed");
		
	}

}
