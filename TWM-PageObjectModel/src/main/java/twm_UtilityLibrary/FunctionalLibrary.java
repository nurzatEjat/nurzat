package twm_UtilityLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
	final boolean Demo = false;

	private WebDriver driver;

	public FunctionalLibrary(WebDriver baseDriver) {
		// TODO Auto-generated constructor stub
		this.driver = baseDriver;
	}

	/***
	 * This method highlights web-elements using javascript executon
	 * 
	 * @param by
	 */

	public void highLightElement(By by) {
		if (Demo) {
			try {
				WebElement temp = driver.findElement(by);
				WrapsDriver wrappedElement = (WrapsDriver) temp;
				JavascriptExecutor js = (JavascriptExecutor) wrappedElement.getWrappedDriver();

				for (int i = 0; i < 3; i++) {
					js.executeScript("arguments[0].setAttribute('style', arguments[1]);", temp,
							"color: red; border: 2px solid yellow;");
					customWait(1);
					js.executeScript("arguments[0].setAttribute('style', arguments[1]);", temp, "");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void highlightElement1(By locator) {
		WebElement elementToHighlight = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				elementToHighlight);
	}

	public void click(By by) {
		highLightElement(by);
		driver.findElement(by).click();
	}

	public void customWait(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void openUrl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}

	public Boolean isDisplay(By locator) {

		List<WebElement> list = driver.findElements(locator);

		return list.size() != 0;
	}

	/**
	 * This method will try to click the given element, if not able to click, then
	 * it will pass
	 * 
	 * @param locator
	 */
	public void clickAndContinue(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshPage() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
	}

	public void switchInToFrame(By locator) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(driver.findElement(locator));
	}

	public void sendKey(By locator, String text) {
		// TODO Auto-generated method stub
		highLightElement(locator);
		driver.findElement(locator).sendKeys(text);
	}

	public void switchToDefault() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();

	}

	public String getText(By locator) {
		highLightElement(locator);
		String temp = driver.findElement(locator).getText();
		return temp;
	}

	public void selectDynamicDropdown(By dropdown, By option) {
		click(dropdown);
		customWait(1);
		click(option);
	}

	public void selectByOptionValue(By dropdown, String optionValue) {
		Select myselect = new Select(driver.findElement(dropdown));
		myselect.selectByValue(optionValue);
	}

	public void moveByOffset(By dragElement, int xOffset, int yOffset) {

		Actions myAction = new Actions(driver);

		myAction.dragAndDropBy(driver.findElement(dragElement), xOffset, yOffset).build().perform();
	}

	public void selectCheckBox(By Box) {
		WebElement checkbox = driver.findElement(Box);
		boolean selected = checkbox.isSelected();
		if (selected) {
			// It already been selected, do nothing
		} else {
			checkbox.click();
		}
	}

	public void clickElementFromList(By listOfElement, int index) {
		List<WebElement> list = driver.findElements(listOfElement);
		list.get(index).click();
	}
	
	
}
