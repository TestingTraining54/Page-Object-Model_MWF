package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import utility.DbManager;
import utility.ExcelReader;

public class BaseTest {

	/*
	 * WebDriver Implicit Wait Explicit Wait Excel Reader Log4j TestNG DBConnection
	 * Properties screenshot keyword - type/click/select Extent Reports
	 * 
	 * Sequential Browser Opened Testcase1 Testcase2 Testcase3 Close browser
	 * 
	 * End-To-End Browser Opened Testcase1 Close browser Browser Opened Testcase2
	 * Close browser Browser Opened Testcase3 Close browser
	 * 
	 */

	public static WebDriver driver;
	public ExcelReader excel = new ExcelReader("./src/test/resources/data/testData.xlsx");
	public FileInputStream fis;
	public Properties config = new Properties();
	public Properties or = new Properties();
	public Logger log = Logger.getLogger(BaseTest.class);
	public WebDriverWait wait;
	public DbManager dbManager = new DbManager();


	public void setUp(String browser) {
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("Test Execution started");

		try {
			fis = new FileInputStream("./src/test/resources/properties/config.properties");
			config.load(fis);
			log.info("Config file loaded");
		}

		catch (IOException e) {
			System.out.println("File is not Found: " + e.getMessage());
			log.info(e.getMessage());
		}

		try {
			fis = new FileInputStream("./src/test/resources/properties/or.properties");
			or.load(fis);
			log.info("OR properties file loaded");
		}

		catch (IOException e) {
			System.out.println("File is not Found: " + e.getMessage());
			log.info(e.getMessage());
		}

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome browser is launched");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			log.info("Firefox browser is launched");
		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			log.info("Edge browser is launched");
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		driver.manage().window().maximize();
		log.info("Browser window maximized");

		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigated to an url: " + config.getProperty("testsiteurl"));

	}
	//@AfterMethod
	public void tearDown() {
		driver.close();
		log.info("Execution Stopped");
	}

}
