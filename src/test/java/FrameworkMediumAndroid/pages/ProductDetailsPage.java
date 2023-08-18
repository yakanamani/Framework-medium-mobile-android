package FrameworkMediumAndroid.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends MenuPage {

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]\n" + 
			"") 
	private WebElement title;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]"
			+ "") 
	private WebElement desc;

	@AndroidFindBy (accessibility = "test-BACK TO PRODUCTS") 
	private WebElement backToProductsBtn;



public String getTitle() {
	return getText(title, "title is: ");
}

public String getDesc() {
	return getText(desc, "description is: ");
}

public String getPrice() throws Exception {
	return getText(andScrollToElementUsingUiScrollable("description", "test-Price"), "price is: ");

}


public ProductsPage pressBackToProductsBtn() {
	click(backToProductsBtn, "navigate back to products page");
	return new ProductsPage();
}

}
