package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarBase {

	WebDriver driver;
	
	public CarBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement carTitle;
	public String getCarTitle() {
		//WebElement carTitle = driver.findElement(By.xpath("//h1"));
		return carTitle.getText();
	}
}
