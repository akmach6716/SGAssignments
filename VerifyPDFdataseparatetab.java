package sgPractice.Assignments;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class VerifyPDFdataseparatetab {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://homeloans.sbi/");
		String url =driver.findElement(By.xpath("//a[@title='Home Loan Agreement']")).getAttribute("href");
		driver.findElement(By.xpath("//a[@title='Home Loan Agreement']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		URL pdfUrl = new URL(url);
		InputStream ip=pdfUrl.openStream();
		BufferedInputStream bf= new BufferedInputStream(ip);
		PDDocument pdDocument=PDDocument.load(bf);
		System.out.println(pdDocument.getDocumentInformation().getAuthor());
		System.out.println("No of pages in the PDF : "+pdDocument.getNumberOfPages());
		PDFTextStripper pdfstripper= new PDFTextStripper();
		pdfstripper.setStartPage(1);
		String pdftext=pdfstripper.getText(pdDocument);
		//System.out.println(pdftext);
		
		}
	}
