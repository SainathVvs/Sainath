package Test.API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver89.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().getCookies();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.close();
		System.out.println(driver.getTitle());
	}

}
