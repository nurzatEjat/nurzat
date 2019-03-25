package twm_UtilityLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import twm_Page.AgeGate;
import twm_Page.Header;
import twm_Page.HomePage;
import twm_Page.ProductDetailPage;
import twm_Page.ShoppingCartPage;
import twm_Page.SignInPage;

public class BasePage {

	public static WebDriver driver;

	String url = "https://www.totalwine.com/";

	public static FunctionalLibrary lib;
	public static LocatorReader locatorR = new LocatorReader();
	public static AgeGate gate = new AgeGate();

	public static Header hd = new Header();
	public static HomePage hp = new HomePage();
	public static ProductDetailPage pdp = new ProductDetailPage();
	public static ShoppingCartPage scp = new ShoppingCartPage();
	public static SignInPage signIn = new SignInPage();

	ExtentReports extent;
	
	@BeforeMethod
	public void startTest() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		driver = new ChromeDriver();

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("test-output/ExtentReports/report.html");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		lib = new FunctionalLibrary(driver);

		driver.get(url);

		driver.manage().window().fullscreen();

	}

	@AfterMethod
	public void endTest() {
		driver.close();
		extent.flush();
		driver.quit();
	}
}
