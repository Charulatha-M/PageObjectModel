package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@BeforeMethod
 public void browser() {
	 driver = new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 }
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
