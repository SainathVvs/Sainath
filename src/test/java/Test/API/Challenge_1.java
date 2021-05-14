package Test.API;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver89.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.worldometers.info/world-population/");

		String population=driver.findElement(By.xpath("//div[@class='maincounter-number']//span[@rel='current_population']")).getText();
		
		StopWatch watch = new StopWatch();
		 watch.start();
		 // call to the methods you want to benchmark
		// watch.stop();
		 long result = watch.getTime(); 	
		System.out.println(result);
		while(true)
		{
			System.out.println(population);
			if(result==1L)
			{
				break;
			}
			
		}
	}

}
