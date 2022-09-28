package testPages;

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
	@Test(enabled = true)
	public void healthButton() throws InterruptedException {
		homePage.insuranceButton();
		homePage.healthButton();
	}

}
