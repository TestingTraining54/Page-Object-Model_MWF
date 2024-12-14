package rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BasePage;
import pages.BMWCarsPage;
import pages.FindNewCarsPage;
import pages.HomePage;
import pages.MarutiCarsPage;

public class FindNewCarsTest {

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.carwale.com/");
		HomePage home = new HomePage(driver);
		FindNewCarsPage findNewCar = home.findNewCars();
		BMWCarsPage bmw = findNewCar.goToBMW();
		System.out.println(BasePage.carBase.getCarTitle());
		 
		
		//System.out.println(home.findNewCars().goToAudi().getCarTitle());
		
		
		//Page Factory

	}

}
