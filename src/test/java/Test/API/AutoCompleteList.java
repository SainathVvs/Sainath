package Test.API;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");

		List<WebElement> elements = driver.findElements(By.xpath("//ul/li[@class='sbct']"));

		System.out.println(elements.size());
		
		Thread.sleep(2500);

		for (WebElement b : elements) {
			
			String element = b.getText();
			
			System.out.println(element);

			if (element.equalsIgnoreCase("Selenium testing")) {
				
				b.click();
				
				break;

			}

		}

	}

}
