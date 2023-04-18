package sgPractice.Assignments;
import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class DownloadFile {
	public static void main(String[] args) {
		//WebDriver driver;
		File downloadFolder = new File("E://Sample path");
		downloadFolder.mkdir();
		ChromeOptions options = new ChromeOptions();		
		HashMap<String,Object> chromeprefs=new HashMap<String, Object>();
		chromeprefs.put("download.default_directory", downloadFolder);
		options.setExperimentalOption("prefs", chromeprefs);
		//DesiredCapabilities cap=DesiredCapabilities.Chrome();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[contains(text(),'LambdaTest')]")).click();
	}

}
