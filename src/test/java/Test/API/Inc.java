package Test.API;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inc {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		/*
		 * ChromeOptions options= new ChromeOptions();
		 * options.addArguments("--incognito");
		 */
		

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		
	}
	
}
