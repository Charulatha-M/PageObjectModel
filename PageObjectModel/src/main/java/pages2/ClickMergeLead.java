package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ClickMergeLead extends ProjectSpecificMethod {
public ClickMergeLead(ChromeDriver driver) {
		this.driver=driver;
	}

public void merge() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
}
}
