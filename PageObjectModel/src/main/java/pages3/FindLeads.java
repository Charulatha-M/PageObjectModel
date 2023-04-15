package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeads extends ProjectSpecificMethod {
public FindLeads(ChromeDriver driver) {
		this.driver=driver;
	}

public FirstName findLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FirstName(driver);
}
}
