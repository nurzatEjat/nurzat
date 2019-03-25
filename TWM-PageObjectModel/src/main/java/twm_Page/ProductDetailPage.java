package twm_Page;

import twm_UtilityLibrary.BasePage;

public class ProductDetailPage extends BasePage{
	
	
	public void clickAddToCartButton() {
		
		lib.click(locatorR.getLocator("pdpAddToCartButton"));
		lib.customWait(2);
	}
	
	public void closeAddItemPopUp() {
		
		lib.clickAndContinue(locatorR.getLocator("pdpCloseIcon"));
	}

}
