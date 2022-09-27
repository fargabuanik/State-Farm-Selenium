package pages;

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

