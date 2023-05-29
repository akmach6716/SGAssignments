package sgPractice.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicWbTablefromBard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");

		// Find the index of the header with the text "Last Name"
int lastNameIndex = driver.findElements(By.xpath("//table[@id='table1']//th//*")).indexOf(driver.findElement(By.xpath("//table[@id='table1']//th[text()='Last Name']")));
		

		// Find the index of the cell that contains the text "Conway",index
		int conwayIndex = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td"))
		.indexOf(driver.findElement(By.xpath("//table[@id='table1']//tbody//tr//td[text()='Conway']")));

		// Find the first child element of the table row that contains the text "Conway"
		WebElement editButton = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + (conwayIndex + 1) + "]//td//following-sibling::td[1]//*[text()='edit']"));

		// Click on the edit button
		editButton.click();

		// Print the current URL of the web page
		System.out.println(driver.getCurrentUrl());
	}

}
