package sgPractice.Assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Spinnercheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");		
		System.out.println(driver.findElement(By.xpath("//div[@class='col-12 py-2']//p")).getText());
	//Thread.sleep(10000);	
	WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		if((w.until(ExpectedConditions.textToBe(By.xpath("//div[@class='col-12 py-2']/p"), "Done!"))==true))
				{
System.out.println("no of images :"+driver.findElements(By.xpath("//div[@id='image-container']/img")).size());
		
				}	}}
