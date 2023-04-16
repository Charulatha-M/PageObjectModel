package page4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DeleteLead extends ProjectSpecificMethod{

	public DeleteLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public void delete() {
		driver.findElement(By.linkText("Delete")).click();
	}

}
