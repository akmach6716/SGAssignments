package sgPractice.Assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowreverseTraverse {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netsuite.com/portal/in/home.shtml");
		driver.findElement(By.xpath("//div[@id='navbar2']//ul//li[2]//a")).click();
		driver.findElement(By.xpath("//a[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//ul[@class='list-inline']//li//a[1]")).click();
		driver.findElement(By.xpath("//ul[@class='list-inline']//li//a[2]")).click();		
Set<String>	allWindows=driver.getWindowHandles();
System.out.println("Child windows in their opening order");
System.out.println(allWindows);
List<String> windowsinList= new ArrayList<String>(allWindows);
int noofwindows=windowsinList.size();
System.out.println("Child windows in reverse order");
for(int i=noofwindows-1;i>=0;i--)
{System.out.println(windowsinList.get(i));
	driver.switchTo().window(windowsinList.get(i));
//System.out.println(driver.getCurrentUrl());	
}	}}
