package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class MarutiCarsPage extends BasePage {
	
	public MarutiCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getCarTitle() {
		WebElement carTitle = driver.findElement(By.xpath("//h1"));
		return carTitle.getText();
	}




	
	
	
}
