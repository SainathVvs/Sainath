package Test.API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("C:\\Users\\Dell\\AppData\\Local\\Google\\leo");
		
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
	}

}
