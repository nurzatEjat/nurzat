package twm_Page;

import twm_UtilityLibrary.BasePage;

public class AgeGate extends BasePage{

	
	
	public void clickNoButton() {
		//we have to click no button
		//click comand should come from library
		//locator should come properties file
		
		lib.click(locatorR.getLocator("ageGateNoButton"));
	}

	public boolean verifyAgeGateDisplay() {
		Boolean isdisplay = lib.isDisplay(locatorR.getLocator("ageGateModel"));
		
		return isdisplay;
	}

	public void clickYesButton() {
		
		lib.click(locatorR.getLocator("ageGateYesButton"));
	}
}
