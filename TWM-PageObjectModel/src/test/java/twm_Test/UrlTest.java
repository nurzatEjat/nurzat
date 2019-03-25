package twm_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import twm_UtilityLibrary.BasePage;

public class UrlTest extends BasePage {

	@Test(enabled = false)
	public void testUrl() {
		urlReader();
		for (Object key : prop.keySet()) {
			String url = prop.getProperty(key.toString()); // String.valueOf(key);
			lib.openUrl(url);
			boolean ageGateDisplaied = gate.verifyAgeGateDisplay();
//		Assert.assertTrue(ageGateDisplaied, "This url has problem to land age gate "+url);
			lib.customWait(2);
		}
	}

	@Test(dataProvider="getUrl")
	public void testUrlByDataProvider(Object url) {
		System.out.println("******"+url.toString());
		lib.openUrl(url.toString());
		gate.verifyAgeGateDisplay();
		lib.customWait(2);
	}

	Properties prop;
	String filePath = "src/test/resources/url.properties";

	public void urlReader() {

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

	@DataProvider
	public Object[] getUrl() {
		urlReader();

		Object[] listOfUrl = new Object[prop.size()];
		int i =0;
		for (Object key : prop.keySet()) {
			
			String url = prop.getProperty(key.toString()); // String.valueOf(key);
			listOfUrl[i] = url;
			i++;
		}
		return listOfUrl;
		// only data it will object[] object[][]
	}

}
