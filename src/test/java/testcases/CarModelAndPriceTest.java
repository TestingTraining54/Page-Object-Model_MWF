package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.AudiCarsPage;
import pages.BMWCarsPage;
import pages.FindNewCarsPage;
import pages.HomePage;
import pages.TataCarsPage;
import pages.ToyotaCarsPage;
import utility.DataUtils;

public class CarModelAndPriceTest extends BaseTest{

	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "data")
	public void getCarModelAndPriceTest(String browser,String runmode,String carBrand) {
		if(runmode.equals("n")) {
			throw new SkipException("Skipped the testcase as runmode is n");
		}
		
		setUp(browser);
		HomePage home = new HomePage(driver);
		FindNewCarsPage findNewCar = home.findNewCars();
		
		if(carBrand.equals("bmw")) {
			BMWCarsPage bmw = findNewCar.goToBMW();
		}
		
		else if(carBrand.equals("tata")) {
			TataCarsPage bmw = findNewCar.goToTata();
		}
		
		else if(carBrand.equals("toyota")) {
			ToyotaCarsPage bmw = findNewCar.goToToyota();
		}
		
		else if(carBrand.equals("audi")) {
			AudiCarsPage bmw = findNewCar.goToAudi();
		}
		
		BasePage.carBase.getCarModelAndPrice();
		
		
	}
}
