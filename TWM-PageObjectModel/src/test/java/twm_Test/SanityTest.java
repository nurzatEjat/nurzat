package twm_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import twm_UtilityLibrary.BasePage;

public class SanityTest extends BasePage{
	
	@Test(enabled=true)
	public void DOT_3594_validate_age_gate()
	{
		gate.clickNoButton();
		lib.customWait(11);
		String title = lib.getPageTitle();
		System.out.println(title);
		if(!title.startsWith("Responsibility.org")) {
			Assert.fail("page title is not correct, current title is: "+title);
		}
	}
	
	@Test(enabled=true)
	public void DOT_3631_validate_age_gate_no() {
		
		try {
			driver.findElement(By.id("testjlajfaoijg")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		gate.clickNoButton();
		lib.customWait(11);
		String title = lib.getPageTitle();
		System.out.println(title);
		if(!title.startsWith("Responsibility.org")) {
			Assert.fail("page title is not correct, current title is: "+title);
		}
		
		lib.openUrl("https://www.totalwine.com/");
		lib.customWait(1);
		boolean isdisplay = gate.verifyAgeGateDisplay();
		Assert.assertTrue(isdisplay, "Age Gate model it didn't display");
	}
	
	
}
