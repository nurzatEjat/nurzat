package twm_UtilityLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class LocatorReader {
	
	
	Properties prop;
	String filePath = "src/test/resources/Locator.properties";

	public LocatorReader() {
		
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(filePath);
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public By getLocator(String key) {
		
		String locator = prop.getProperty(key);
			//id:btnNo
		//xpath://*[@class="kajlfkj"]/following::sibling*
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.replace(locatorType+":", "");
		
		By result = null;
		if(locatorType.equalsIgnoreCase("id")) {
			result = By.id(locatorValue);
		}else if(locatorType.equalsIgnoreCase("class")) {
			result = By.className(locatorValue);
		}else if(locatorType.equalsIgnoreCase("xpath")) {
			result = By.xpath(locatorValue);
		}else {
			System.out.println("value of the key: "+key+" is not match in our locator type. Please check it");
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
