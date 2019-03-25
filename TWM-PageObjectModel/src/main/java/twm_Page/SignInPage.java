package twm_Page;

import twm_UtilityLibrary.BasePage;

public class SignInPage extends BasePage{

	
	public void clickForgetPasswordLink() {
		lib.click(locatorR.getLocator("signInForgetPasswordLink"));
	}
	
	public void enterEmailForForgetPassword(String emailId) {
		
		lib.switchInToFrame(locatorR.getLocator("signInResetPasswordIframe"));
		lib.sendKey(locatorR.getLocator("signInResetPasswordTextBox"), emailId);
		lib.switchToDefault();
	}
	
	public void clickSubmitForForgetPassword() {
		lib.switchInToFrame(locatorR.getLocator("signInResetPasswordIframe"));
		
		lib.click(locatorR.getLocator("signInResetPasswordSubmitButton"));
		lib.switchToDefault();
	}
	
	public boolean verifyResetPasswordButton() {
		lib.switchInToFrame(locatorR.getLocator("signInResetPasswordIframe"));
		
		boolean exist = lib.isDisplay(locatorR.getLocator("signInResetPasswordSignInButton"));
		
		lib.switchToDefault();
		return exist;
	}
	
	public String getSuccesfulTextFromResetPassword() {
		lib.switchInToFrame(locatorR.getLocator("signInResetPasswordIframe"));
		
		String message =lib.getText(locatorR.getLocator("signInResetPasswordSuccefulMessage"));
		
		lib.switchToDefault();
		return message;
	}
	
	
	
	
}
