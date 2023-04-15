package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod {
	public CreateLead (ChromeDriver driver) {
		this.driver=driver;
	}
public CreateLead companyName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
   return this;

}
public CreateLead fname() {
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Charulatha");
	 return this;
}
public CreateLead lname() {
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");	
    return this;
}
public ViewLead clickCreateLead() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLead(driver);
}
}
