package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Sumbit extends ProjectSpecificMethod{
public Sumbit(ChromeDriver driver) {
		this.driver=driver;
	}

public void clickOk() {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("iOPEX");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
}
}
