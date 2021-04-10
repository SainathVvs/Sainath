package Test.API;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://licindia.in/");

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count=0;
		
		try{
		for (WebElement link : links) {
			
			String urlss = link.getAttribute("href");

			URL url = new URL(urlss);

			HttpURLConnection urlconnect = (HttpURLConnection) url.openConnection();

			urlconnect.setConnectTimeout(3000);
			
			urlconnect.connect();
			
			if (urlconnect.getResponseCode() == 200) {
				
				System.out.println(urlss + " " + urlconnect.getResponseMessage());
				
				count++;
			}
			else
			{
				System.out.println("Bad Url"+urlconnect.getResponseCode());
			}
		}}catch(Exception e)
		{
			
			System.out.println("Exception");
			e.getStackTrace();
			System.out.println(e);
		}
		System.out.println("Count"+count);
	}

}
