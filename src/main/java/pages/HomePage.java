package pages;
/*
Create a maven project of your own and show the URL is running and opening the page. Please add maximize(), deleteAllCookies(), pageLoadTimeOut(), implicitlyWait() in the BaseClass. In the home page, validate the logo, the way I validated. Use click() method to click webeElement, create at least 5. Use @FindBy to find web Elelement. You can use at least one as HOW keyword. Use Thread.sleep() to know use of it. Use enabled and priority keyword in test method along with @Test. Push to the github and share the link below*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@class='-oneX-header-logo']")
	WebElement logo;

	@FindBy (xpath = "//input[@id='oneX-username']")
	WebElement userId;

	@FindBy(xpath = "//button[@class='-oneX-header-top-menu-btn']" )
	WebElement logingButton;

	@FindBy(xpath = "//span[text()='Insurance']")
	WebElement insuranceButton;

	@FindBy(how = How.XPATH, using = "//a[@id='oneX-4-insurance']")
	WebElement healthButton;


	public boolean logoDisplayed() {
		boolean img = logo.isDisplayed();
		System.out.println("The logo is displayed"+ img);
		return img;	
	}
	public void enterUserIdField() {
		logingButton.click(); 
	}
	public void loginButtonClicked() throws InterruptedException {
		Thread.sleep(5000);
		logingButton.click();
		Thread.sleep(5000);
	}
	public void insuranceButton() throws InterruptedException {
		insuranceButton.click();
		Thread.sleep(5000);
	}
	public void healthButton() throws InterruptedException {
		Thread.sleep(5000);
		healthButton.click();
		Thread.sleep(5000);
	}
}

