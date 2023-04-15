package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MergeLead extends ProjectSpecificMethod {
public MergeLead(ChromeDriver driver) {
		this.driver=driver;
	}
public From clickMergeLead() {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new From(driver);
}



}
