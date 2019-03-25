package twm_Page;

import twm_UtilityLibrary.BasePage;

public class ShoppingCartPage extends BasePage{

	public void clickCheckOutButton() {
		lib.click(locatorR.getLocator("scpCheckoutButton"));
	}
	
}
