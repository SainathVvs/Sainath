package Test.API;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

/*
 * Pre-requisites: PDFbox
 * 1. Launch url for invoice to me
 * 2. Update the details in the form
 * 3. Redirect the downloads into the project folder
 * 4. Open pdf with file Class
 * 5. Parse with pdfbox
 * 
 */
public class PDFdataValidation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		
		String downloadPath=System.getProperty("user.dir");
		
		System.out.println(downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://invoiceto.me/");
		
		driver.findElement(By.xpath("//input[@id='title']")).clear();
		
		driver.findElement(By.xpath("//input[@id='company']")).clear();
		
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Invoice");
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Learning with Leo");
		
		driver.findElement(By.xpath("//*[@id=\"open_pp\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/a")).click();
		
		Thread.sleep(2500);
		
		downloadPath=downloadPath+"\\invoiceto.me.pdf";

		File file=new File(downloadPath);
		
		FileInputStream fis=new FileInputStream(file);
		
		PDDocument document=null;
		
		document=PDDocument.load(fis);
		
		String pdfData=new PDFTextStripper().getText(document);
		
		System.out.println(pdfData);
		
	}

}



