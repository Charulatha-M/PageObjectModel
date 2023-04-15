package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
public LoginPage userName() {
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	return this;
}
public LoginPage password(){
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;
}
public HomePage clickLogin() {
    driver.findElement(By.className("decorativeSubmit")).click();
    return new HomePage(driver);
}
}
