package testPages;

import org.testng.annotations.Test;
import Base.BaseClass; 
public class HomepagesTest extends BaseClass {
	//@Test(enabled = true) 
	public void logoTest() {
		homePage.logoDisplayed();
	}
	//@Test(enabled = true)
	public void userIdFieldTest() {
		homePage.enterUserIdField();
	}
	//@Test(enabled = true)
	public void loginButtonTest() throws InterruptedException {
		homePage.loginButtonClicked();
	}	
//	@Test(enabled = true)
	public void insuranceButton() throws InterruptedException {
		homePage.insuranceButton();
	}
	@Test(enabled = true)
	public void healthButton() throws InterruptedException {
		homePage.insuranceButton();
		//homePage.healthButton();
	}
	
}
