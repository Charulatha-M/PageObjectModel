package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class EditLead extends ProjectSpecificMethod {

	public EditLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public Sumbit editLead() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new Sumbit(driver);
	
	}

}
