package src.metric_conversion.com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeClass
	public void setup(){
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://www.metric-conversions.org/");
	} 

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}