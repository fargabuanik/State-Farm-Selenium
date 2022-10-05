package Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;	
	protected HomePage homePage;

	@BeforeMethod
	public void setup() {


		//1st way to show the location of chrome driver
		/*
		System.setProperty("webdriver.chrome.driver" ,"/Users/fargabuddin/eclipse-workspace/gov.portal.StateFram/drive/chromedriver");
		 */

		//2nd way to show the location of chrome driver
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "./drive/chromedriver");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "./drive/chromedriver");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./drive/geckodriver");
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		WebDriverManager.chromedriver().driverVersion("106.0.5249.91").setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.statefarm.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}                                 
	@AfterMethod
	public void tearUp() { 
		driver.quit(); 
	}
}