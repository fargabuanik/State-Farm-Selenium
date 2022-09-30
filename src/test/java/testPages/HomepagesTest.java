package testPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass; 
public class HomepagesTest extends BaseClass {

	@Test(enabled = false) 
	public void logoTest() {
		homePage.logoDisplayed();
	}
	@Test(enabled = false)
	public void userIdFieldTest() {
		homePage.enterUserIdField();
	}
	@Test(enabled = false)
	public void loginButtonTest() throws InterruptedException {
		homePage.loginButtonClicked();
	}	
	@Test(enabled = false)
	public void insuranceButton() throws InterruptedException {
		homePage.insuranceButton();
	}
	@Test(enabled = false)
	public void healthButton() throws InterruptedException {
		homePage.insuranceButton();
		homePage.healthButton(); 
	}
	//new
	@Test(enabled = false)
	public void logoTestClickTest(){
		driver.findElement(By.xpath("//img[@class='-oneX-header-logo']")).click();
	}
	@Test(enabled = false)
	public void insurancreButtonClickTest(){
		driver.findElement(By.xpath("//span[text()='Insurance']")).click();
	}
	@Test(enabled = false)
	public void carInsuranceButtonClickTest() {
		driver.findElement(By.xpath("//a[text()='Car Insurance']")).click();

	}
	@Test(enabled = false)
	public void shrechicon() {
		driver.get("https://www.capitalone.com/");	
		driver.findElement(By.id("unav-l1-search")).click();
	}
	@Test(enabled = false)
	public void searchFieldTest() {
		driver.get("https://www.walgreens.com/");
		driver.findElement(By.className("blue-shadow")).click();
	}
	@Test(enabled = false)
	public void usernameClickTest() {
		driver.get("https://www.capitalone.com/");
		driver.findElement( By.name("ods-input-0")).click();
	}
	@Test(enabled = false)
	public void termsandConditionsLinkTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.linkText("Terms and Conditions")).click();
	}
	@Test(enabled = false)
	public void yourPrivacyRightsTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.partialLinkText("Your Privacy Ri")).click();	

	}
	@Test(enabled = false)
	public void groceryButtonTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("a#Home_Ancillary_0")).click();//html cssSelector tag, dot then# then valuen (if is Id) used Id and class
		
	}
	@Test(enabled = false)
	public void usernameTest(){
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.cssSelector("input#ods-input-0")).click();

	}
	@Test(enabled = false)
	public void forgotUsernameOrPassword() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.cssSelector("a.asset-link.grv-text__body--tiny")).click();
	}
	@Test(enabled = false)
	public void logoTest01() {
		boolean elementDisplayed = driver.findElement(By.xpath("//img[@class='-oneX-header-logo']")).isDisplayed();
	}
	@Test(enabled = true)
	public void loginButtonTest01() {
		boolean loginButtonEnabled = driver.findElement(By.xpath("//span[text()='Log in']")).isEnabled();
	}
}







