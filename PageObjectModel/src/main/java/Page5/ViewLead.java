package Page5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod {
public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}

public DuplicateLead pnum() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10834']")).click();
	return new DuplicateLead(driver);
}
}
