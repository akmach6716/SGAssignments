package sgPractice.Assignments;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		java.util.List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th//*"));
		for (int a = 0; a < headers.size(); a++) {
			String headerlabel = headers.get(a).getText();
			if (headerlabel.equalsIgnoreCase("Last Name")) {
				System.out.println("The index of the last name is :" + a);
				java.util.List<WebElement> lastNames = driver
						.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[" + (a + 1) + "]"));
				int Lastnamevalues = driver
						.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[" + (a + 1) + "]")).size();
				for (int b = 0; b < Lastnamevalues; b++) {
					String LastName = lastNames.get(b).getText();
					if (LastName.equalsIgnoreCase("Conway")) {
						System.out.println("Index of the required last name :" + b);
						java.util.List<WebElement> elements = driver.findElements(By
								.xpath("//table[@id='table1']//tbody/tr[" + (b + 1) + "]//td//following-sibling::td"));
						int noofelements = elements.size();
						for (int i = 1; i <= noofelements; i++) {
							int noofchildlinks = (driver.findElements(By.xpath("//table[@id='table1']//tbody/tr["
									+ (b + 1) + "]//td//following-sibling::td[" + i + "]//*"))).size();
							if (noofchildlinks != 0) {
								java.util.List<WebElement> childlinks = driver
										.findElements(By.xpath("//table[@id='table1']//tbody/tr[" + (b + 1)
												+ "]//td//following-sibling::td[" + i + "]//*"));
								for (int j = 0; j < noofchildlinks; j++) { // System.out.println(childlinks.get(j).getText());
									if (childlinks.get(j).getText().equalsIgnoreCase("edit")) {
										childlinks.get(j).click();
									}
								}
							}
						}
						System.out.println(driver.getCurrentUrl());
					}
				}
			}
		}
	}
}