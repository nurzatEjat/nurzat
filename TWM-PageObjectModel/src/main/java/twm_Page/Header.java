package twm_Page;

import twm_UtilityLibrary.BasePage;

public class Header extends BasePage{

	public void gotoCart() {
		lib.click(locatorR.getLocator("headerCartIcon"));
	}
}
