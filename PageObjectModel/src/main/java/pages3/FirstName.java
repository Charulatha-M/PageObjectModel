package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FirstName extends ProjectSpecificMethod {
public FirstName(ChromeDriver driver) {
		this.driver=driver;
	}

public EditLead findLead() {
	 driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Charulatha");
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
     driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=14742'])[2]")).click();
     return new EditLead(driver);
}
}
