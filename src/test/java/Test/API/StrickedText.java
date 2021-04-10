package Test.API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrickedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Dell/Desktop/strike.html");
		
		String S=driver.findElement(By.xpath("/html/body/div[1]/p[1]/span/strike")).getText();
		
		System.out.println(S);
		
		
	}

}
