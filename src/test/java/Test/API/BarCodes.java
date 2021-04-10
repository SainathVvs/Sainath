package Test.API;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCodes {

	public static void main(String[] args) throws InterruptedException, IOException, NotFoundException{
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.cognex.com/en-in/resources/interactive-tools/free-barcode-generator");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"sitecookiemodal\"]/div/div/div[3]/button")).click();
		///////////////////////////////////////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//div[@class='container']//span[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='data']")).clear();
		
		driver.findElement(By.xpath("//input[@id='data']")).sendKeys("Learning with Leo");
		
		driver.findElement(By.xpath("//input[@value='Generate Barcode']")).click();
		///////////////////////////////////////////////////////////////////////////////////////////////////
		String url=driver.findElement(By.xpath("//img[@id='barcode-image']")).getAttribute("src");
		
		System.out.println(url);
		
		URL urllink=new URL(url);
		
		BufferedImage img=ImageIO.read(urllink);
		
		LuminanceSource luminous=new BufferedImageLuminanceSource(img);
		
		BinaryBitmap binarydata= new BinaryBitmap(new HybridBinarizer(luminous));

		Result result =new MultiFormatReader().decode(binarydata);
		
		System.out.println(result.getText());
		
		System.out.println(result.getBarcodeFormat());
		

	}

}
