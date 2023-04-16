package page4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLead extends ProjectSpecificMethod {
public FindLead(ChromeDriver driver) {
	this.driver=driver;
	}

public ViewLead findLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new ViewLead(driver);
}
}
