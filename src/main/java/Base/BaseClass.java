package Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;	
	public HomePage homePage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/fargabuddin/eclipse-workspace/gov.portal.StateFram/drive/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.statefarm.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}