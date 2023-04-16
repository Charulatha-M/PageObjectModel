package Page5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	public HomePage (ChromeDriver driver) {
		this.driver=driver;
	}
public MyHomePage clickcrmsfa() {
	 driver.findElement(By.partialLinkText("CRM/SFA")).click();
	 return new MyHomePage(driver);
}

}
