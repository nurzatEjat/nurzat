package twm_Page;

import twm_UtilityLibrary.BasePage;

public class HomePage extends BasePage{
	
	public void clickFirstRRProduct() {
		
		lib.customWait(3);
		lib.click(locatorR.getLocator("homePageFirstRRName"));
		
	}
	

}
