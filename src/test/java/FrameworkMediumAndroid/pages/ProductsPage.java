package FrameworkMediumAndroid.pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import FrameworkMediumAndroid.utils.GlobalParams;
import FrameworkMediumAndroid.utils.TestUtils;

public class ProductsPage extends MenuPage {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='PRODUCTS']")
	private WebElement titleTxt;



	public String getTitle() {
		return getText(titleTxt, "product page title is - ");
	}

	public String getProductTitle(String title) throws Exception {
		return getText(andScrollToElementUsingUiScrollable("text", title), "product title is: " + title);

	}

	public By defProductPrice(String title) throws Exception {
		switch(new GlobalParams().getPlatformName()){
			case "Android":
				return By.xpath("//*[@text=\"" + title + "\"]/following-sibling::*[@content-desc=\"test-Price\"]");
			case "iOS":
				return By.xpath("//XCUIElementTypeOther[@name=\"" + title + "\"]/following-sibling::*[1]/child::XCUIElementTypeStaticText[@name=\"test-Price\"]");
			default:
				throw new Exception("Invalid platform name");
		}
	}

	public ProductDetailsPage pressProductTitle(String title) throws Exception {
		click(andScrollToElementUsingUiScrollable("text", title), "press " + title + " link");
		return new ProductDetailsPage();

	}
}
