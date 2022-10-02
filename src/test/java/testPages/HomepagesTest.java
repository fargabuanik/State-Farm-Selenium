package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogExporter; 
public class HomepagesTest extends BaseClass {

	private org.openqa.selenium.Dimension dimension;
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
	//hw3
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
	//hw4
	@Test(enabled = false)
	public void logoTest01() {
		driver.findElement(By.xpath("//img[@class='-oneX-header-logo']")).isDisplayed();
	}
	@Test(enabled = false)
	public void loginButtonTest01() {
		driver.findElement(By.xpath("//span[text()='Log in']")).isEnabled();

	}@Test(enabled = false)
	public void use_of_isSelected_method() {
		boolean payInsuranceBillIsSelected =driver.findElement(By.cssSelector("div.-oneX-util-menu-icon.-oneX-util-menu-icon-search")).isSelected();
		System.out.print("is the pay insurance Bill IsSelected" + payInsuranceBillIsSelected);
	}
	@Test(enabled = false)
	public void  use_of_getTitle_method() {
		System.out.println("The title of the page is "+driver.getTitle());	
	}
	@Test(enabled = false)
	public void use_of_getText_method() {
		WebElement nur = 	driver.findElement(By.xpath("//span[text()='Log in']"));
		System.out.println("The text for the Web Element" + nur.getText());
	}
	@Test(enabled = false)
	public void use_of_getCurrentURl_method() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(20);
		System.out.println(driver.getCurrentUrl());
	} 
	@Test(enabled = false)
	public void use_of_getAttribute_method() {
		String value = driver.findElement(By.xpath("//img[@id='oneX-sf-logo']")).getAttribute("id");
		String value2 = driver.findElement(By.xpath("//img[@class='-oneX-header-logo']")).getAttribute("class");
		System.out.println("The value of the span Attribut is : " + value);
		System.out.println("The value of the span Attribut is : " + value2);
	}
	@Test(enabled = false)
	//send Key user id and password
	public void use_of_sendKeys_mathod() throws InterruptedException{
		Thread.sleep(5);
		driver.get("https://www.capitalone.com/"); 
		Thread.sleep(5);
		driver.findElement(By.xpath("//input[@id='ods-input-0']")).sendKeys("Anik5428");
		Thread.sleep(5);
		driver.findElement(By.xpath("//input[@name='ods-input-1']")).sendKeys("anik12");
		Thread.sleep(5);
	}
	@Test(enabled = false)
	public void use_of_sendKeys_mathod_then_click_submit_and_then_clear() throws InterruptedException {  
		Thread.sleep(5000);
		driver.get("https://www.bestbuy.com/");
		Thread.sleep(5000);
		driver.findElement(By.className("search-input")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.className("search-input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.className("search-input")).sendKeys("camera", Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.className("search-input")).clear();
	}
	 @Test(enabled = false)
	 public void use_of_navigate_method() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.bestbuy.com/");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
	 
	 }
		 @Test(enabled = true)
		 public void setASpecificSizeOfWindow() throws InterruptedException {
			Dimension dimension = new Dimension(700, 400);
			 driver.manage().window().setSize(dimension); 
			 driver.manage().deleteAllCookies();
			 driver.get("https://www.bestbuy.com/");
			 Thread.sleep(4000);
			 System.out.println("This size of the screen is " + driver.manage().window().getSize());
			 driver.manage().window().maximize();
			 System.out.println("This size of the screen is " + driver.manage().window().getSize());
			 Thread.sleep(4000);
			 driver.manage().window().setSize( dimension); 
			 Thread.sleep(4000);
			 System.out.println("This size of the screen is " + driver.manage().window().getSize());
	
	 }
 
}





