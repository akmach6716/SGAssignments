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
		String downloadPath=System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();		
		HashMap<String,Object> chromeprefs=new HashMap<String, Object>();
		chromeprefs.put("profile.default_content_settings.popups", 0);
		chromeprefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromeprefs);
		//DesiredCapabilities cap=DesiredCapabilities.Chrome();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[contains(text(),'LambdaTest')]")).click();
		System.out.println(downloadPath);
		File f=new File(downloadPath+"/LambdaTest.txt");

		if(f.exists())
		{
			System.out.println("file found ");
		}else {System.out.println("file not found in the path ");}
	}

}
