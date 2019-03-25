package twm_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import twm_UtilityLibrary.BasePage;

public class RegressionTest extends BasePage{

	@Test
	public void DOT_3607_HomeWork() {
		String emailId = "test@test.com";
		String expectingMessage = "We've sent you an email with a link to reset your password. The link will expire in 24 hours.\n" + 
				"\n" + 
				"If you don't receive the email shortly, please check to see if it was routed to your spam or junk-mail folder.";
		
		gate.clickYesButton();
		lib.customWait(1);
		lib.refreshPage();
		
		hp.clickFirstRRProduct();
		pdp.clickAddToCartButton();
		pdp.closeAddItemPopUp();
		lib.customWait(3);
		
		hd.gotoCart();
		lib.customWait(8);
		scp.clickCheckOutButton();
		lib.customWait(2);
		signIn.clickForgetPasswordLink();
		signIn.enterEmailForForgetPassword(emailId);
		signIn.clickSubmitForForgetPassword();
		String actualMessage =signIn.getSuccesfulTextFromResetPassword();
		
		Assert.assertEquals(actualMessage, expectingMessage);
		
	}
	
}
