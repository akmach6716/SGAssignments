package sgPractice.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class colorAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		System.out.println(driver.findElement(By.xpath("//input[@type='color']")).getAttribute("value"));

	}

}
