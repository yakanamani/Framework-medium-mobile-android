package FrameworkMediumAndroid.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import FrameworkMediumAndroid.utils.TestUtils;

public class LoginPage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy (accessibility = "test-Username") 
	private WebElement usernameTxtFld;

	@AndroidFindBy (accessibility = "test-Password") 
	private WebElement passwordTxtFld;
	
	@AndroidFindBy (accessibility = "test-LOGIN") 
	private WebElement loginBtn;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView") 
	private WebElement errTxt;

	public LoginPage(){
	}

public LoginPage enterUserName(String username) throws InterruptedException {
	clear(usernameTxtFld);	
	sendKeys(usernameTxtFld, username, "login with " + username);
	return this;
}

public LoginPage enterPassword(String password) {
	clear(passwordTxtFld);
	sendKeys(passwordTxtFld, password, "password is " + password);
	return this;
}

public ProductsPage pressLoginBtn() {
	click(loginBtn, "press login button");
	return new ProductsPage();
}

public ProductsPage login(String username, String password) throws InterruptedException {
	enterUserName(username);
	enterPassword(password);
	return pressLoginBtn();
}

public String getErrTxt() {
	String err = getText(errTxt, "error text is - ");
	return err;
}

}
