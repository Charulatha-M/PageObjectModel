package Page5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DuplicateLead extends ProjectSpecificMethod {

	public DuplicateLead(ChromeDriver driver) {
		this.driver=driver;
	}
public DuplicateLead duplicate() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.name("submitButton")).click();
	return this;
}
}
